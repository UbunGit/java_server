package com.example.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.user.entity.ClientUser;
import com.example.user.param.ClientUserPageParam;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * 客户端用户 Mapper 接口
 *
 * @author ubungit
 * @since 2020-12-30
 */
@Repository
public interface ClientUserMapper extends BaseMapper<ClientUser> {


}
