package com.apply.admin.recruitment.dto.request;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class NewRecruitmentRequest {

    @NotBlank
    private String course;

    public NewRecruitmentRequest() {
    }

    public NewRecruitmentRequest(String course) {
        this.course = course;
    }
}
