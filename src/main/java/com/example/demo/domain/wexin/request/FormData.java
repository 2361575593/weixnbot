package com.example.demo.domain.wexin.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormData {
    private String type;
    private String content;
    private Source source;
    private String isMentioned;
    private String isMsgFromSelf;

}
