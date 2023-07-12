package com.apply.admin.recruitment.service;

import com.apply.admin.recruitment.domain.Recruitment;
import com.apply.admin.recruitment.dto.request.NewRecruitmentRequest;
import com.apply.admin.recruitment.dto.request.RecruitmentUpdateRequest;
import com.apply.admin.recruitment.dto.response.NewRecruitmentResponse;
import com.apply.admin.recruitment.dto.response.RecruitmentResponse;
import com.apply.admin.recruitment.repository.RecruitmentRepository;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Service
public class RecruitmentService {

    private final RecruitmentRepository recruitmentRepository;

    public RecruitmentService(RecruitmentRepository recruitmentRepository) {
        this.recruitmentRepository = recruitmentRepository;
    }

    // 모집글 생성시
    @Transactional
    public NewRecruitmentResponse createBoard(NewRecruitmentRequest newRecruitmentRequest) {
        Recruitment recruitment = Recruitment.builder()
                .course(newRecruitmentRequest.getCourse())
                .build();

        Recruitment saverecruitment = recruitmentRepository.save(recruitment);
        return new NewRecruitmentResponse(saverecruitment);
    }


    // 모집글 수정시
    @Transactional
    public void update(final Long idx, final RecruitmentUpdateRequest request) {
        Recruitment recruitment = recruitmentRepository.getById(idx);
        recruitment.change(request.getCourse());
    }

}
