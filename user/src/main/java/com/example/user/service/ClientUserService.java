package com.example.user.service;

import com.example.user.entity.ClientUser;
import com.example.user.param.ClientUserPageParam;
import io.geekidea.springbootplus.framework.common.service.BaseService;
import io.geekidea.springbootplus.framework.core.pagination.Paging;

/**
 * 客户端用户 服务类
 *
 * @author ubungit
 * @since 2020-12-30
 */
public interface ClientUserService extends BaseService<ClientUser> {

    /**
     * 保存
     *
     * @param clientUser
     * @return
     * @throws Exception
     */
    boolean saveClientUser(ClientUser clientUser) throws Exception;

    /**
     * 修改
     *
     * @param clientUser
     * @return
     * @throws Exception
     */
    boolean updateClientUser(ClientUser clientUser) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteClientUser(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param clientUserQueryParam
     * @return
     * @throws Exception
     */
    Paging<ClientUser> getClientUserPageList(ClientUserPageParam clientUserPageParam) throws Exception;

}
