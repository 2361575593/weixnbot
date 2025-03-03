package com.example.demo.domain.deepseek.reuqest;

import java.util.List;

public class RequestData {
    private List<Message> messages;
    private String model;
    private int frequency_penalty;
    private int max_tokens;
    private int presence_penalty;
    private String stop;
    private boolean stream;
    private Object stream_options;
    private double temperature;
    private double top_p;
    private Object tools;
    private String tool_choice;
    private boolean logprobs;
    private Object top_logprobs;

    // Getters and Setters
    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFrequency_penalty() {
        return frequency_penalty;
    }

    public void setFrequency_penalty(int frequency_penalty) {
        this.frequency_penalty = frequency_penalty;
    }

    public int getMax_tokens() {
        return max_tokens;
    }

    public void setMax_tokens(int max_tokens) {
        this.max_tokens = max_tokens;
    }

    public int getPresence_penalty() {
        return presence_penalty;
    }

    public void setPresence_penalty(int presence_penalty) {
        this.presence_penalty = presence_penalty;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public boolean isStream() {
        return stream;
    }

    public void setStream(boolean stream) {
        this.stream = stream;
    }

    public Object getStream_options() {
        return stream_options;
    }

    public void setStream_options(Object stream_options) {
        this.stream_options = stream_options;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTop_p() {
        return top_p;
    }

    public void setTop_p(double top_p) {
        this.top_p = top_p;
    }

    public Object getTools() {
        return tools;
    }

    public void setTools(Object tools) {
        this.tools = tools;
    }

    public String getTool_choice() {
        return tool_choice;
    }

    public void setTool_choice(String tool_choice) {
        this.tool_choice = tool_choice;
    }

    public boolean isLogprobs() {
        return logprobs;
    }

    public void setLogprobs(boolean logprobs) {
        this.logprobs = logprobs;
    }

    public Object getTop_logprobs() {
        return top_logprobs;
    }

    public void setTop_logprobs(Object top_logprobs) {
        this.top_logprobs = top_logprobs;
    }
}

