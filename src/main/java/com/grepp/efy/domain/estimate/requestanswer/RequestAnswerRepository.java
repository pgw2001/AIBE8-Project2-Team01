package com.grepp.efy.domain.estimate.requestanswer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestAnswerRepository extends JpaRepository<RequestAnswer, Long> {
}
