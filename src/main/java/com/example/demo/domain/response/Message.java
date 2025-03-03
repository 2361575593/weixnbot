package com.example.demo.domain.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Message {
    private String role;
    private String content;

    private String reasoning_content;  // 添加 reasoning_content 字段


}
