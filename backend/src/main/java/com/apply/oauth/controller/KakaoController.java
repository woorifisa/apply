package com.apply.oauth.controller;

import com.apply.oauth.service.KakaoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app/oauth/kakao")
@Slf4j
public class KakaoController {
    private final KakaoService kakaoService;

    public KakaoController(KakaoService kakaoService){
         this.kakaoService = kakaoService;
    }

    @GetMapping
    public String kakaoOauth(@RequestParam("code") String code) {
        log.info("인가 코드를 이용하여 토큰을 받습니다. code: " + code);
        System.out.println("code: " + code);
        String accessToken = kakaoService.getKakaoAccessToken(code);
        kakaoService.getKakaoUserInfo(accessToken);
        return "okay";
    }

}
