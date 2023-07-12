package com.apply.admin.recruitment.exception;

public class NoSuchRecruitmentException extends RuntimeException {
    public NoSuchRecruitmentException(final String message) {
        super(message);
    }

    public NoSuchRecruitmentException() {
        this("존재하지 않는 모집글입니다.");
    }
}