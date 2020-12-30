package com.example.user.controller;

import com.example.user.entity.ClientUser;
import com.example.user.service.ClientUserService;
import lombok.extern.slf4j.Slf4j;
import com.example.user.param.ClientUserPageParam;
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
 * 客户端用户 控制器
 *
 * @author ubungit
 * @since 2020-12-30
 */
@Slf4j
@RestController
@RequestMapping("/clientUser")
@Module("user")
@Api(value = "客户端用户API", tags = {"客户端用户"})
public class ClientUserController extends BaseController {

    @Autowired
    private ClientUserService clientUserService;

    /**
     * 添加客户端用户
     */
    @PostMapping("/add")
    @OperationLog(name = "添加客户端用户", type = OperationLogType.ADD)
    @ApiOperation(value = "添加客户端用户", response = ApiResult.class)
    public ApiResult<Boolean> addClientUser(@Validated(Add.class) @RequestBody ClientUser clientUser) throws Exception {
        boolean flag = clientUserService.saveClientUser(clientUser);
        return ApiResult.result(flag);
    }

    /**
     * 修改客户端用户
     */
    @PostMapping("/update")
    @OperationLog(name = "修改客户端用户", type = OperationLogType.UPDATE)
    @ApiOperation(value = "修改客户端用户", response = ApiResult.class)
    public ApiResult<Boolean> updateClientUser(@Validated(Update.class) @RequestBody ClientUser clientUser) throws Exception {
        boolean flag = clientUserService.updateClientUser(clientUser);
        return ApiResult.result(flag);
    }

    /**
     * 删除客户端用户
     */
    @PostMapping("/delete/{id}")
    @OperationLog(name = "删除客户端用户", type = OperationLogType.DELETE)
    @ApiOperation(value = "删除客户端用户", response = ApiResult.class)
    public ApiResult<Boolean> deleteClientUser(@PathVariable("id") Long id) throws Exception {
        boolean flag = clientUserService.deleteClientUser(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取客户端用户详情
     */
    @GetMapping("/info/{id}")
    @OperationLog(name = "客户端用户详情", type = OperationLogType.INFO)
    @ApiOperation(value = "客户端用户详情", response = ClientUser.class)
    public ApiResult<ClientUser> getClientUser(@PathVariable("id") Long id) throws Exception {
        ClientUser clientUser = clientUserService.getById(id);
        return ApiResult.ok(clientUser);
    }

    /**
     * 客户端用户分页列表
     */
    @PostMapping("/getPageList")
    @OperationLog(name = "客户端用户分页列表", type = OperationLogType.PAGE)
    @ApiOperation(value = "客户端用户分页列表", response = ClientUser.class)
    public ApiResult<Paging<ClientUser>> getClientUserPageList(@Validated @RequestBody ClientUserPageParam clientUserPageParam) throws Exception {
        Paging<ClientUser> paging = clientUserService.getClientUserPageList(clientUserPageParam);
        return ApiResult.ok(paging);
    }

}

