package com.example.user.vo;
import io.geekidea.springbootplus.framework.shiro.service.LoginToken;
import io.geekidea.springbootplus.framework.shiro.vo.LoginClientUserVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author geekidea
 * @date 2019-10-26
 **/
@Data
@Accessors(chain = true)
@ApiModel("客户端登录用户信息TokenVO")
public class ClientLoginUserTokenVo implements LoginToken{
    private static final long serialVersionUID = -2138450422989081056L;

    @ApiModelProperty("token")
    private String token;

    /**
     * 登录用户对象
     */
    private LoginClientUserVo loginSysUserVo;
}
