package com.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.demo.mapper.SysRoleMenuMapper;
import com.demo.pojo.SysRoleMenu;
import com.demo.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * @Description 角色与权限业务实现
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService {

}