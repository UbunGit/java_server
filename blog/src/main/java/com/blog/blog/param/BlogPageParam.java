package com.blog.blog.param;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import io.geekidea.springbootplus.framework.core.pagination.BasePageOrderParam;

/**
 * <pre>
 * blog 分页参数对象
 * </pre>
 *
 * @author ubungit
 * @date 2020-12-11
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "blog分页参数")
public class BlogPageParam extends BasePageOrderParam {
    private static final long serialVersionUID = 1L;
}
