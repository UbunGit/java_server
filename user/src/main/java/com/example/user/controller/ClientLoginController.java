package com.example.user.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.example.user.param.ClientLoginParam;
import com.example.user.param.ClientSignUpParam;
import com.example.user.service.ClientUserLoginService;
import com.example.user.vo.ClientLoginUserTokenVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.geekidea.springbootplus.framework.common.api.ApiResult;
import io.geekidea.springbootplus.framework.log.annotation.OperationLog;
import io.geekidea.springbootplus.framework.log.annotation.OperationLogIgnore;
import io.geekidea.springbootplus.framework.shiro.util.JwtTokenUtil;
import io.geekidea.springbootplus.framework.shiro.vo.LoginClientUserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Api(value = "客户端用户登录/注册API", tags = {"客户端登录/注册"})
@RestController
public class ClientLoginController {

    @Autowired
    private ClientUserLoginService loginService;

 

    @PostMapping("/clogin")
    @OperationLogIgnore
    @ApiOperation(value = "客户端登录",
    notes = "系统用户登录",
    response = ClientLoginUserTokenVo.class
    )
    public ApiResult<ClientLoginUserTokenVo> login(@Validated @RequestBody ClientLoginParam loginParam, HttpServletResponse response) throws Exception {
        ClientLoginUserTokenVo clientLoginUserTokenVo = loginService.login(loginParam);
        // 设置token响应头
        response.setHeader(JwtTokenUtil.getTokenName(), clientLoginUserTokenVo.getToken());
        return ApiResult.ok(clientLoginUserTokenVo, "登录成功");
    }

    @PostMapping("/signup")
    @OperationLogIgnore
    @ApiOperation(value = "客户端用户注册",notes = "客户端用户注册",response = ClientLoginUserTokenVo.class)
    public ApiResult<Boolean> signup(@Validated @RequestBody ClientSignUpParam signUpParam, HttpServletResponse response) throws Exception {
        return ApiResult.result(true);
    }
    
}
