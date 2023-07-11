package com.apply.admin.recruitment.repository;

import com.apply.admin.recruitment.domain.Recruitment;
import com.apply.admin.recruitment.exception.NoSuchRecruitmentException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface RecruitmentRepository extends JpaRepository<Recruitment, Long> {

    Optional<Recruitment> findByCourse(final String course);

    default Recruitment getById(final Long idx) {
        return findById(idx)
                .orElseThrow(NoSuchRecruitmentException::new);
    }

    default Recruitment getByCourse(final String course) {
        return findByCourse(course)
                .orElseThrow(NoSuchRecruitmentException::new);
    }

    @Query(value = "SELECT r.course FROM Recruitment r WHERE r.idx = : idx")
    Optional<Integer> findByCourseValueById(@Param("idx") int idx);
}
