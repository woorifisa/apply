package com.apply.oauth.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class KakaoUserInfo {
    private Long id;
    private String email;
    private String profileImgUrl;
}
