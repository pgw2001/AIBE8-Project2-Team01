package com.grepp.efy.domain.estimate.servicerequest.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.util.List;

@Getter
public class ServiceRequestCreateRequest {

    @NotNull
    private Long secondCategoryId;

    @NotNull
    private Long secondRegionId;

    @NotEmpty
    private List<@Valid AnswerRequest> answers;
}
