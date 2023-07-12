package com.apply.admin.recruitment.dto.response;

import com.apply.admin.recruitment.domain.Recruitment;
import com.apply.admin.recruitment.domain.RecruitmentStatus;

import java.time.LocalDateTime;

public class RecruitmentResponse {

    private Long idx;

    private String course;

    private int contentMaxSize;

    private int headCount;

    private RecruitmentStatus recruitmentStatus;

    private String curriculumImage;

    private LocalDateTime startDate;

    private LocalDateTime dueDate;

    private RecruitmentResponse() {
    }

    public RecruitmentResponse(final Long idx, final String course, final int contentMaxSize,
                               final int headCount, final RecruitmentStatus recruitmentStatus, final String curriculumImage,
                               final LocalDateTime startDate, final LocalDateTime dueDate) {
        this.idx = idx;
        this.course = course;
        this.contentMaxSize = contentMaxSize;
        this.headCount = headCount;
        this.recruitmentStatus = recruitmentStatus;
        this.curriculumImage = curriculumImage;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }

    public RecruitmentResponse(final Recruitment recruitment) {
        this(recruitment.getIdx(), recruitment.getCourse(), recruitment.getContentMaxSize(),
                recruitment.getHeadCount(), recruitment.getRecruitmentStatus(), recruitment.getCurriculumImage(),
                recruitment.getStartDate(), recruitment.getDueDate());
    }


}
