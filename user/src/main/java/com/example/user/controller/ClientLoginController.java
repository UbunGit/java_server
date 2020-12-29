package com.example.user.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.geekidea.springbootplus.framework.common.api.ApiResult;
import io.geekidea.springbootplus.framework.log.annotation.OperationLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Api(value = "客户端用户登录/注册API", tags = {"客户端登录/注册"})
@RestController
@RequestMapping("/client")
public class ClientLoginController {
    /**
     * Hello World
     *
     * @return
     * @throws IOException
     */
    @GetMapping(value = "/clientLogin")
    @OperationLog(name = "clientLogin")
    @ApiOperation(value = "clientLogin", response = String.class)
    public ApiResult<String> helloWorld() throws IOException {
        return ApiResult.ok("client login");
    }
}
