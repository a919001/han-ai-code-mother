package com.hanshan.hanaicodemother.controller;

import com.hanshan.hanaicodemother.common.BaseResponse;
import com.hanshan.hanaicodemother.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
    @GetMapping ("/")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("ok");
    }
}
