package com.example.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.blog.entity.Blog;
import com.example.blog.param.BlogPageParam;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * blog Mapper 接口
 *
 * @author ubungit
 * @since 2020-12-11
 */
@Repository
public interface BlogMapper extends BaseMapper<Blog> {


}
