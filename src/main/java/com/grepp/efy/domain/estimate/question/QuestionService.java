package com.grepp.efy.domain.estimate.question;

import com.grepp.efy.domain.estimate.question.dto.QuestionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    public List<QuestionResponse> getQuestions() {
        return questionMapper.toResponseList(questionRepository.findAllByOrderByDisplayOrderAsc());
    }
}
