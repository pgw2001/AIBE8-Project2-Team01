package com.grepp.efy.domain.estimate.servicerequest;

import com.grepp.efy.domain.basedata.secondcategory.SecondCategory;
import com.grepp.efy.domain.basedata.secondregion.SecondRegion;
import com.grepp.efy.domain.estimate.servicerequest.dto.ServiceRequestCreateResponse;
import com.grepp.efy.domain.user.member.Member;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ServiceRequestMapper {

    ServiceRequestCreateResponse toServiceRequestCreateResponse(ServiceRequest serviceRequest);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "requestStatus", constant = "OPEN")
    ServiceRequest createEntity(Member member, SecondCategory secondCategory, SecondRegion secondRegion);
}
