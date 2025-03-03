package com.example.demo.domain.response;

public class CompletionTokensDetails {
    private int reasoning_tokens;  // 新增字段 reasoning_tokens

    // Getter and Setter
    public int getReasoning_tokens() {
        return reasoning_tokens;
    }

    public void setReasoning_tokens(int reasoning_tokens) {
        this.reasoning_tokens = reasoning_tokens;
    }
}

