package com.apply.admin.recruitment.dto.request;

import javax.validation.constraints.NotBlank;

public class RecruitmentUpdateRequest {

    @NotBlank(message = "모집명이 공백일 수 없습니다")
    private String course;

    private RecruitmentUpdateRequest() {
    }

    public RecruitmentUpdateRequest(final String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}
