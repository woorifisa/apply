package com.apply.admin.recruitment.controller;

import com.apply.admin.recruitment.dto.request.NewRecruitmentRequest;
import com.apply.admin.recruitment.dto.response.NewRecruitmentResponse;
import com.apply.admin.recruitment.dto.response.RecruitmentResponse;
import com.apply.admin.recruitment.service.RecruitmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;

@RequestMapping("/api/recruitments")
@RestController
public class RecruitmentController {

    private final RecruitmentService recruitmentService;

    public RecruitmentController(final RecruitmentService recruitmentService) {
        this.recruitmentService = recruitmentService;
    }

    @PostMapping
    public ResponseEntity<RecruitmentResponse> createRecruitment(@Valid @RequestBody NewRecruitmentRequest newRecruitmentRequest) {
        NewRecruitmentResponse recruitment = recruitmentService.createBoard(newRecruitmentRequest);
        return ResponseEntity.created(URI.create("/recruitments/" + recruitment.getIdx())).build();
    }

}
