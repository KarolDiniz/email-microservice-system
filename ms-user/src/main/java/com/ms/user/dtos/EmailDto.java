package com.ms.user.dtos;

import java.util.UUID;

public class EmailDto {

    private UUID userID;
    private String emailTo;
    private String subject;
    private String text;

    public UUID getUserid() {
        return userID;
    }

    public void setUserid(UUID userid) {
        this.userID = userid;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
