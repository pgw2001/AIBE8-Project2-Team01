package com.grepp.efy.domain.estimate.question.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonPropertyOrder({"id", "content", "isRequired", "displayOrder"})
public class QuestionResponse {
    private Long id;
    private String content;
    private Boolean isRequired;
    private Integer displayOrder;
}
