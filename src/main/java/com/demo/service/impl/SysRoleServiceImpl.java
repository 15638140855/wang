package com.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.mapper.SysRoleMapper;

import com.demo.pojo.SysRole;
import com.demo.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * @Description 角色业务实现
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

}