package com.demo;


import com.demo.pojo.SysUser;
import com.demo.pojo.SysUserRole;
import com.demo.service.SysUserRoleService;
import com.demo.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private SysUserRoleService sysUserRoleService;

    @Test
    void contextLoads() {
        // 注册用户
        SysUser sysUserEntity = new SysUser();
        sysUserEntity.setUsername("wang");
        sysUserEntity.setPassword(bCryptPasswordEncoder.encode("123456"));
        // 设置用户状态
        sysUserEntity.setStatus("NORMAL");
        sysUserService.save(sysUserEntity);
        // 分配角色 1:ADMIN 2:USER
        SysUserRole sysUserRoleEntity = new SysUserRole();
        sysUserRoleEntity.setRoleId(2L);
        sysUserRoleEntity.setUserId(sysUserEntity.getUserId());
        sysUserRoleService.save(sysUserRoleEntity);
        System.out.println(sysUserEntity);
    }

    //使用springboot的测试类，然后注入RabbitTemplate模板类
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void helloWorldProvider(){
        rabbitTemplate.convertAndSend("hello","hhh");//给hello队列发送消息
    }

}
