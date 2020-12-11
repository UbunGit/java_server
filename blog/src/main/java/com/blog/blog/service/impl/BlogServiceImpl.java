package com.blog.blog.service.impl;

import com.blog.blog.entity.Blog;
import com.blog.blog.mapper.BlogMapper;
import com.blog.blog.service.BlogService;
import com.blog.blog.param.BlogPageParam;
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
 * blog 服务实现类
 *
 * @author ubungit
 * @since 2020-12-11
 */
@Slf4j
@Service
public class BlogServiceImpl extends BaseServiceImpl<BlogMapper, Blog> implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveBlog(Blog blog) throws Exception {
        return super.save(blog);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateBlog(Blog blog) throws Exception {
        return super.updateById(blog);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteBlog(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<Blog> getBlogPageList(BlogPageParam blogPageParam) throws Exception {
        Page<Blog> page = new PageInfo<>(blogPageParam, OrderItem.desc(getLambdaColumn(Blog::getCreateTime)));
        LambdaQueryWrapper<Blog> wrapper = new LambdaQueryWrapper<>();
        IPage<Blog> iPage = blogMapper.selectPage(page, wrapper);
        return new Paging<Blog>(iPage);
    }

}
