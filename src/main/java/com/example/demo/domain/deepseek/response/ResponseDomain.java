package com.example.demo.domain.deepseek.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDomain {
        private String type;
        private String content;
        private String source;
        private String isMentioned;
        private String isMsgFromSelf;
        private String isSystemEvent;
}
