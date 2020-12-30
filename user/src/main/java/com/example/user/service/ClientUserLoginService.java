package com.example.user.service;

import com.example.user.entity.ClientUser;
import com.example.user.param.ClientLoginParam;
import com.example.user.vo.ClientLoginUserTokenVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.geekidea.springbootplus.framework.log.annotation.Module;
import io.geekidea.springbootplus.framework.shiro.vo.LoginClientUserVo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

/**
 * 客户端登录控制器
 *
 * @author geekidea
 * @date 2019-09-28
 * @since 1.3.0.RELEASE
 **/

public interface ClientUserLoginService {
     /**
     * 客户端登录
     *
     * @param loginParam
     * @return
     * @throws Exception
     */
    
    ClientLoginUserTokenVo login(ClientLoginParam loginParam) throws Exception;

    /**
     * 根据用户名获取系统用户对象
     *
     * @param username
     * @return
     * @throws Exception
     */
    ClientUser getSysUserByUsername(String username) throws Exception;
}
