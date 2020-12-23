package com.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.pojo.SysMenu;
import com.demo.pojo.SysRole;
import com.demo.pojo.SysUser;


import java.util.List;

/**
 * @Description 系统用户业务接口
 * @Author Sans
 * @CreateTime 2019/6/14 15:57
 */
public interface SysUserService extends IService<SysUser>  {

    /**
     * 根据用户名查询实体
     * @Author Sans
     * @CreateTime 2019/9/14 16:30
     * @Param  username 用户名
     * @Return SysUserEntity 用户实体
     */
    SysUser selectUserByName(String username);
    /**
     * 根据用户ID查询角色集合
     * @Author Sans
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<SysRole> selectSysRoleByUserId(Long userId);
    /**
     * 根据用户ID查询权限集合
     * @Author Sans
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysMenuEntity> 角色名集合
     */
    List<SysMenu> selectSysMenuByUserId(Long userId);

}