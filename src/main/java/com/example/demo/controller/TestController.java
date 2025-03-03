package com.example.demo.controller;

import com.example.demo.domain.deepseek.response.Message;
import com.example.demo.domain.wexin.request.FormData;
import com.example.demo.domain.wexin.request.Source;
import com.example.demo.domain.wexin.response.Response;
import com.example.demo.utils.DeepSeekTalk;
import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;
import java.util.List;

@Controller
public class TestController {
    @RequestMapping("/receive/")
    @ResponseBody
    public Response receive(FormData formData){
        Response response = new Response();
        List<Response.DataItem> dataItemList = new LinkedList<Response.DataItem>();
        String content = formData.getContent();
        response.setData(dataItemList);
        String isMentioned  = formData.getIsMentioned();
        if (formData.getSource().getRoom() != null && StringUtils.isNotBlank(isMentioned) && isMentioned.equals("1")){
            response.setSuccess(true);
            Source.Room room = formData.getSource().getRoom();
            List<Source.Room.Payload.Member> memberList = room.getPayload().getMemberList();
            Message talk = DeepSeekTalk.talk(content);
            Response.DataItem dataItem = new Response.DataItem();
            dataItem.setType("text");
            dataItem.setContent(new StringBuilder("@").append(memberList.get(0).getName()+" ").append(talk.getReasoning_content()).append("\r\n"+talk.getContent()).toString());
            dataItemList.add(dataItem);
        }else if (formData.getSource().getTo()!=null){
            response.setSuccess(true);
            Message talk = DeepSeekTalk.talk(content);
            Response.DataItem dataItem = new Response.DataItem();
            dataItem.setType("text");
            dataItem.setContent(new StringBuilder(talk.getReasoning_content()).append("\r\n"+talk.getContent()).toString());
            dataItemList.add(dataItem);
        }else {
            response.setSuccess(false);
        }
        return response;
    }
}
