package com.zhong.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhong.api.Do.UserDo;
import com.zhong.api.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class TestDubbosController {

    @Reference
    private IUserService userService;

    @RequestMapping(value = "/testDubbos")
    public String testDubbos(HttpServletRequest request, HttpServletResponse response) {
        UserDo user = userService.getUser("");
        System.out.println(user.toString());
        return user.toString();
    }

}