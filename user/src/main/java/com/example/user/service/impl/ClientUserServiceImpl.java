package com.example.user.service.impl;

import com.example.user.entity.ClientUser;
import com.example.user.mapper.ClientUserMapper;
import com.example.user.service.ClientUserService;
import com.example.user.param.ClientUserPageParam;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.geekidea.springbootplus.framework.common.service.impl.BaseServiceImpl;
import io.geekidea.springbootplus.framework.core.pagination.Paging;
import io.geekidea.springbootplus.framework.core.pagination.PageInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 客户端用户 服务实现类
 *
 * @author ubungit
 * @since 2020-12-30
 */
@Slf4j
@Service
public class ClientUserServiceImpl extends BaseServiceImpl<ClientUserMapper, ClientUser> implements ClientUserService {

    @Autowired
    private ClientUserMapper clientUserMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveClientUser(ClientUser clientUser) throws Exception {
        return super.save(clientUser);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateClientUser(ClientUser clientUser) throws Exception {
        return super.updateById(clientUser);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteClientUser(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<ClientUser> getClientUserPageList(ClientUserPageParam clientUserPageParam) throws Exception {
        Page<ClientUser> page = new PageInfo<>(clientUserPageParam, OrderItem.desc(getLambdaColumn(ClientUser::getCreateTime)));
        LambdaQueryWrapper<ClientUser> wrapper = new LambdaQueryWrapper<>();
        IPage<ClientUser> iPage = clientUserMapper.selectPage(page, wrapper);
        return new Paging<ClientUser>(iPage);
    }

}
