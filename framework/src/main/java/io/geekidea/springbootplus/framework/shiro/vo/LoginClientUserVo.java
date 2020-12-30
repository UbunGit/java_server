package io.geekidea.springbootplus.framework.shiro.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * <p>
 * 客户端登录用户对象，响应给前端
 * </p>
 *
 * @author geekidea
 * @date 2019-05-15
 **/
@Data
@Accessors(chain = true)
public class LoginClientUserVo implements Serializable{
    
    private static final long serialVersionUID = -1758338570596088158L;

    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("性别，0：女，1：男，默认1")
    private Integer gender;

    @ApiModelProperty("状态，0：禁用，1：启用，2：锁定")
    private Integer state;
}
