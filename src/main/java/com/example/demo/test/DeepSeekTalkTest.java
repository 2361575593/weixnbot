package com.example.demo.test;

import com.example.demo.domain.response.Message;
import com.example.demo.utils.DeepSeekTalk;

public class DeepSeekTalkTest {
    public static void main(String[] args) {
        Message talk = DeepSeekTalk.talk("帮我写一段java使用OkHttp的实例代码");
        System.out.println(talk.getContent());
        System.out.println(talk.getReasoning_content());
    }
}
