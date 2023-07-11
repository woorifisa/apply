package com.apply.admin.recruitment.dto.response;

import com.apply.admin.recruitment.domain.Recruitment;

public class NewRecruitmentResponse {

    private Long idx;

    public NewRecruitmentResponse(Long idx) {
        this.idx = idx;
    }

    public NewRecruitmentResponse(Recruitment recruitment) {
        this.idx = recruitment.getIdx();
    }

    public Long getIdx() {
        return idx;
    }
}
