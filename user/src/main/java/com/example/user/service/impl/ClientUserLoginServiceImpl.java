package com.example.user.service.impl;


import org.apache.shiro.authc.AuthenticationException;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.user.entity.ClientUser;
import com.example.user.mapper.ClientUserMapper;
import com.example.user.param.ClientLoginParam;
import com.example.user.service.ClientUserLoginService;
import com.example.user.vo.ClientLoginUserTokenVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端登录 服务实现类
 *
 * @author ubungit
 * @since 2020-12-30
 */
@Slf4j
@Service
public class ClientUserLoginServiceImpl implements ClientUserLoginService{

    @Lazy
    @Autowired
    private ClientUserMapper  clientUserMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ClientLoginUserTokenVo login(ClientLoginParam loginParam) throws Exception{

        String username = loginParam.getUsername();
        // 从数据库中获取登录用户信息
        ClientUser clientUser = getSysUserByUsername(username);
        if (clientUser == null) {
            log.error("登录失败,loginParam:{}", loginParam);
            throw new AuthenticationException("用户名或密码错误");
        }
   
        return new ClientLoginUserTokenVo();
    }



    @Override
    public ClientUser getSysUserByUsername(String username) throws Exception {

        ClientUser clientUser = new ClientUser().setUsername(username);
        return clientUserMapper.selectOne(new QueryWrapper<ClientUser>(clientUser));
    }
    
}
