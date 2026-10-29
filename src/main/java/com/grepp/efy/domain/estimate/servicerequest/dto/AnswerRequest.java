package com.grepp.efy.domain.estimate.servicerequest.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class AnswerRequest {

    @NotNull
    private Long questionId;

    @NotBlank
    @Size(max = 500)
    private String content;
}
