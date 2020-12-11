package com.blog.blog.service;

import com.blog.blog.entity.Blog;
import com.blog.blog.param.BlogPageParam;
import io.geekidea.springbootplus.framework.common.service.BaseService;
import io.geekidea.springbootplus.framework.core.pagination.Paging;

/**
 * blog 服务类
 *
 * @author ubungit
 * @since 2020-12-11
 */
public interface BlogService extends BaseService<Blog> {

    /**
     * 保存
     *
     * @param blog
     * @return
     * @throws Exception
     */
    boolean saveBlog(Blog blog) throws Exception;

    /**
     * 修改
     *
     * @param blog
     * @return
     * @throws Exception
     */
    boolean updateBlog(Blog blog) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteBlog(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param blogQueryParam
     * @return
     * @throws Exception
     */
    Paging<Blog> getBlogPageList(BlogPageParam blogPageParam) throws Exception;

}
