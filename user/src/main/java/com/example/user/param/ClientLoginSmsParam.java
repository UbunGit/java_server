package com.example.user.param;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 客户端验证码登录参数
 *
 * @author geekidea
 * @date 2019-05-15
 **/
@Data
@ApiModel("客户端验证吗登录参数")
public class ClientLoginSmsParam {
    private static final long serialVersionUID = 2854217576695117356L;

	@NotBlank(message = "请输入账号")
    @ApiModelProperty(value = "账号", example = "admin")
    private String username;

    @ApiModelProperty("验证码Token")
    private String verifyToken;

    @ApiModelProperty("验证码")
    private String code;
}
