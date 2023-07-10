package com.apply.admin.recruitment.domain;

import com.apply.common.BaseEntity;
import lombok.Builder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "recruitments")
@Entity
public class Recruitment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    private int idx;

    @Column(name = "course", nullable = false, length = 10)
    private String course;

    @Column(name = "content_max_size", nullable = false)
    private int contentMaxSize;

    @Column(name = "head_count", nullable = false)
    private int headCount;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "recruitment_status", nullable = false)
    private RecruitmentStatus recruitmentStatus;

    @Column(name = "profile_image_url", nullable = false)
    private String profileImageUrl;

    @CreatedDate
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @LastModifiedDate
    @Column(name = "due_date", nullable = false)
    private LocalDateTime dueDate;

    public Recruitment() {
    }

    @Builder
    public Recruitment(int idx, String course, int contentMaxSize, int headCount, RecruitmentStatus recruitmentStatus, String profileImageUrl, LocalDateTime startDate, LocalDateTime dueDate, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.idx = idx;
        this.course = course;
        this.contentMaxSize = contentMaxSize;
        this.headCount = headCount;
        this.recruitmentStatus = recruitmentStatus;
        this.profileImageUrl = profileImageUrl;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }
}
