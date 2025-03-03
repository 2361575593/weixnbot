package com.example.demo.test;

import com.example.demo.controller.TestController;
import com.example.demo.domain.wexin.request.FormData;
import com.example.demo.domain.wexin.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringTest {
    @Autowired
    TestController testController;
    @Test
    public void test1(){
        FormData formData = new FormData();
        formData.setType("text");
        formData.setContent("我想测试一下你的聊天功能");
        Response receive = testController.receive(formData);
        System.out.println(receive);
    }
}
