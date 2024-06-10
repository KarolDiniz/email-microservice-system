package com.ms.email.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public record EmailRecordDto(
        @JsonProperty("userid") UUID userID,
        String emailTo,
        String subject,
        String text
) {}
