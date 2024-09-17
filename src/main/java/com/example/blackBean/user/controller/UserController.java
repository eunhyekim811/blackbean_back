package com.example.blackBean.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor  //초기화 되지 않은 final 필드, @NonNull 필드에 대해 생성자 생성(생성자 조입)
//@RequestMapping(value = "/user", method = RequestMethod.POST)  //웹에서 들어온 요청을 특정 메서드와 매핑하기 위해 사용
public class UserController {
}
