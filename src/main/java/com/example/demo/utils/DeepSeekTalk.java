package com.example.demo.utils;

import com.example.demo.domain.deepseek.response.Message;
import com.example.demo.domain.deepseek.response.ResponseData;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DeepSeekTalk {
    static private OkHttpClient client = new OkHttpClient().newBuilder()
            .connectTimeout(600, TimeUnit.SECONDS) // 连接超时
                .readTimeout(600, TimeUnit.SECONDS)    // 读取超时
                .writeTimeout(600, TimeUnit.SECONDS)   // 写入超时
                . build();
    public static Message talk(String msg){
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n  \"messages\": [\n    {\n      \"content\": \""+msg+"\",\n      \"role\": \"system\"\n    },\n    {\n      \"content\": \"Hi\",\n      \"role\": \"user\"\n    }\n  ],\n  \"model\": \"deepseek-reasoner\",\n  \"frequency_penalty\": 0,\n  \"max_tokens\": 2048,\n  \"presence_penalty\": 0,\n  \"response_format\": {\n    \"type\": \"text\"\n  },\n  \"stop\": null,\n  \"stream\": false,\n  \"stream_options\": null,\n  \"temperature\": 1,\n  \"top_p\": 1,\n  \"tools\": null,\n  \"tool_choice\": \"none\",\n  \"logprobs\": false,\n  \"top_logprobs\": null\n}");
        Request request = new Request.Builder()
                .url("https://api.deepseek.com/chat/completions")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", "Bearer sk-20a7e17a98734546a1529fce90397591")
                .build();
        try {
            Response response = client.newCall(request).execute();
            String responseBody = response.body().string();
            ObjectMapper objectMapper = new ObjectMapper();
            System.out.println(responseBody);
            ResponseData responseData = objectMapper.readValue(responseBody, ResponseData.class);
            return responseData.getChoices().get(0).getMessage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
