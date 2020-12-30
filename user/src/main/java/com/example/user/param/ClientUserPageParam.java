package com.example.user.param;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import io.geekidea.springbootplus.framework.core.pagination.BasePageOrderParam;

/**
 * <pre>
 * 客户端用户 分页参数对象
 * </pre>
 *
 * @author ubungit
 * @date 2020-12-30
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "客户端用户分页参数")
public class ClientUserPageParam extends BasePageOrderParam {
    private static final long serialVersionUID = 1L;
}