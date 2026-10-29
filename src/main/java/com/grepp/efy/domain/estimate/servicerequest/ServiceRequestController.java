package com.grepp.efy.domain.estimate.servicerequest;

import com.grepp.efy.domain.estimate.servicerequest.docs.ServiceRequestControllerDocs;
import com.grepp.efy.domain.estimate.servicerequest.dto.ServiceRequestCreateRequest;
import com.grepp.efy.domain.estimate.servicerequest.dto.ServiceRequestCreateResponse;
import com.grepp.efy.global.security.CustomUserDetails;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ServiceRequestController implements ServiceRequestControllerDocs {

    private final ServiceRequestService serviceRequestService;

    @Override
    @PostMapping("/requests")
    public ResponseEntity<ServiceRequestCreateResponse> createRequest(
            @AuthenticationPrincipal CustomUserDetails userDetails,
            @Valid @RequestBody ServiceRequestCreateRequest request
    ) {
        ServiceRequestCreateResponse response = serviceRequestService.createRequest(userDetails.getMemberId(), request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
