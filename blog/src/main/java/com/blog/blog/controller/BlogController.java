package com.blog.blog.controller;

import com.blog.blog.entity.Blog;
import com.blog.blog.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import com.blog.blog.param.BlogPageParam;
import io.geekidea.springbootplus.framework.common.controller.BaseController;
import io.geekidea.springbootplus.framework.common.api.ApiResult;
import io.geekidea.springbootplus.framework.core.pagination.Paging;
import io.geekidea.springbootplus.framework.common.param.IdParam;
import io.geekidea.springbootplus.framework.log.annotation.Module;
import io.geekidea.springbootplus.framework.log.annotation.OperationLog;
import io.geekidea.springbootplus.framework.log.enums.OperationLogType;
import io.geekidea.springbootplus.framework.core.validator.groups.Add;
import io.geekidea.springbootplus.framework.core.validator.groups.Update;
import org.springframework.validation.annotation.Validated;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * blog 控制器
 *
 * @author ubungit
 * @since 2020-12-11
 */
@Slf4j
@RestController
@RequestMapping("/blog")
@Module("blog")
@Api(value = "blogAPI", tags = {"blog"})
public class BlogController extends BaseController {

    @Autowired
    private BlogService blogService;

    /**
     * 添加blog
     */
    @PostMapping("/add")
    @OperationLog(name = "添加blog", type = OperationLogType.ADD)
    @ApiOperation(value = "添加blog", response = ApiResult.class)
    public ApiResult<Boolean> addBlog(@Validated(Add.class) @RequestBody Blog blog) throws Exception {
        boolean flag = blogService.saveBlog(blog);
        return ApiResult.result(flag);
    }

    /**
     * 修改blog
     */
    @PostMapping("/update")
    @OperationLog(name = "修改blog", type = OperationLogType.UPDATE)
    @ApiOperation(value = "修改blog", response = ApiResult.class)
    public ApiResult<Boolean> updateBlog(@Validated(Update.class) @RequestBody Blog blog) throws Exception {
        boolean flag = blogService.updateBlog(blog);
        return ApiResult.result(flag);
    }

    /**
     * 删除blog
     */
    @PostMapping("/delete/{id}")
    @OperationLog(name = "删除blog", type = OperationLogType.DELETE)
    @ApiOperation(value = "删除blog", response = ApiResult.class)
    public ApiResult<Boolean> deleteBlog(@PathVariable("id") Long id) throws Exception {
        boolean flag = blogService.deleteBlog(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取blog详情
     */
    @GetMapping("/info/{id}")
    @OperationLog(name = "blog详情", type = OperationLogType.INFO)
    @ApiOperation(value = "blog详情", response = Blog.class)
    public ApiResult<Blog> getBlog(@PathVariable("id") Long id) throws Exception {
        Blog blog = blogService.getById(id);
        return ApiResult.ok(blog);
    }

    /**
     * blog分页列表
     */
    @PostMapping("/getPageList")
    @OperationLog(name = "blog分页列表", type = OperationLogType.PAGE)
    @ApiOperation(value = "blog分页列表", response = Blog.class)
    public ApiResult<Paging<Blog>> getBlogPageList(@Validated @RequestBody BlogPageParam blogPageParam) throws Exception {
        Paging<Blog> paging = blogService.getBlogPageList(blogPageParam);
        return ApiResult.ok(paging);
    }

}

