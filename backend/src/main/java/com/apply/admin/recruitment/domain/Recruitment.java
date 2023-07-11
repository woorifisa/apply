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
    private Long idx;

    @Column(name = "course", nullable = false, length = 10)
    private String course;

    @Column(name = "content_max_size", nullable = false)
    private int contentMaxSize;

    @Column(name = "head_count", nullable = false)
    private int headCount;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "recruitment_status", nullable = false)
    private RecruitmentStatus recruitmentStatus;

    @Column(name = "curriculumImage", nullable = false, length = 100)
    private String curriculumImage;

    @CreatedDate
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @LastModifiedDate
    @Column(name = "due_date", nullable = false)
    private LocalDateTime dueDate;

    public Recruitment() {
    }

    @Builder
    public Recruitment(Long idx, String course, int contentMaxSize, int headCount, RecruitmentStatus recruitmentStatus, String curriculumImage, LocalDateTime startDate, LocalDateTime dueDate) {
        this.idx = idx;
        this.course = course;
        this.contentMaxSize = contentMaxSize;
        this.headCount = headCount;
        this.recruitmentStatus = recruitmentStatus;
        this.curriculumImage = curriculumImage;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }

    public void change(final String course) {
        this.course = course;
    }

    public Long getIdx() {
        return idx;
    }

    public String getCourse() {
        return course;
    }

    public int getContentMaxSize() {
        return contentMaxSize;
    }

    public int getHeadCount() {
        return headCount;
    }

    public RecruitmentStatus getRecruitmentStatus() {
        return recruitmentStatus;
    }

    public String getCurriculumImage() {
        return curriculumImage;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }
}
