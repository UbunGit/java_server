package com.example.user.param;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 客户端注册参数
 *
 * @author geekidea
 * @date 2019-05-15
 **/
@Data
@ApiModel("客户端注册参数")
public class ClientSignUpParam {

    @NotBlank(message = "请输入手机号码")
    @ApiModelProperty(value = "手机号码", example = "1390000000")
    private String phone;

    @NotBlank(message = "请输入密码")
    @ApiModelProperty(value = "密码", example = "123456")
    private String password;

    @ApiModelProperty("验证码Token")
    private String verifyToken;

    @ApiModelProperty("验证码")
    private String code;  

    @ApiModelProperty(value = "账号", example = "admin")
    private String username;

    @ApiModelProperty(value = "邀请码", example = "WQYU56")
    private String reccode;
    
}
