package com.baidubce.appbuilder.model.appbuilderclient;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class AppBuilderClientResponse {
    @SerializedName("request_id")
    private String requestId;
    private String data;
    private String date;
    private String answer;
    @SerializedName("conversation_id")
    private String conversationId;
    @SerializedName("message_id")
    private String messageId;
    @SerializedName("is_completion")
    private boolean isCompletion;
    private EventContent[] content;
    private String code;
    private String message;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public boolean isCompletion() {
        return isCompletion;
    }

    public void setCompletion(boolean completion) {
        isCompletion = completion;
    }

    public EventContent[] getContent() {
        return content;
    }

    public void setContent(EventContent[] content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "AgentBuilderResponse{" +
                "requestId='" + requestId + '\'' +
                ", date='" + date + '\'' +
                ", answer='" + answer + '\'' +
                ", conversationId='" + conversationId + '\'' +
                ", messageId='" + messageId + '\'' +
                ", isCompletion=" + isCompletion +
                ", content=" + Arrays.toString(content) +
                '}';
    }
}