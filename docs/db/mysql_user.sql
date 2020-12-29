create table if not exists users
(
    id bigint auto_increment comment '主键'
        primary key,
    username varchar(20) not null comment '用户名',
    nickname varchar(20) null comment '昵称',
    password varchar(64) not null comment '密码',
    salt varchar(32) null comment '盐值',
    phone varchar(20) not null comment '手机号码',
    gender int default 1 not null comment '性别，0：女，1：男，默认1',
    head varchar(200) null comment '头像',
    remark varchar(200) null comment '备注',
    state int default 1 not null comment '状态，0：禁用，1：启用，2：锁定',
    deleted int default 0 not null comment '逻辑删除，0：未删除，1：已删除',
    version int default 0 not null comment '版本',
    create_time timestamp default CURRENT_TIMESTAMP null comment '创建时间',
    update_time timestamp null comment '修改时间',
    constraint sys_user_username_uindex
        unique (username)
)
    comment '客户端用户';