package com.example.user.service;

import com.example.user.entity.Users;
import com.example.user.param.UsersPageParam;
import io.geekidea.springbootplus.framework.common.service.BaseService;
import io.geekidea.springbootplus.framework.core.pagination.Paging;

/**
 * 客户端用户 服务类
 *
 * @author ubungit
 * @since 2020-12-29
 */
public interface UsersService extends BaseService<Users> {

    /**
     * 保存
     *
     * @param users
     * @return
     * @throws Exception
     */
    boolean saveUsers(Users users) throws Exception;

    /**
     * 修改
     *
     * @param users
     * @return
     * @throws Exception
     */
    boolean updateUsers(Users users) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteUsers(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param usersQueryParam
     * @return
     * @throws Exception
     */
    Paging<Users> getUsersPageList(UsersPageParam usersPageParam) throws Exception;

}
