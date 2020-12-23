package com.demo.controller;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.Sign;
import cn.hutool.crypto.asymmetric.SignAlgorithm;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.pojo.SysMenu;
import com.demo.service.SysMenuService;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloContorller {
@Autowired
private UserService userService;
@Autowired
private SysMenuService sysMenuService;
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    /*登陆*/
    @RequestMapping("/login")
    public String hello1() {
        return "登陆成功";
    }
    /*登陆*/
    @RequestMapping("/admin")
    public String admin() {
        return "您拥有访问admin的权限";
    }
    /*注销*/
    @RequestMapping("/logout")
    public String hello2() {
        return "注销成功";
    }

    /*注销*/
    @RequestMapping("/testToken")
    public String hell03() {
        byte[] data = "我是一段测试字符串".getBytes();
        Sign sign = SecureUtil.sign(SignAlgorithm.MD5withRSA);
        //签名
        byte[] signed = sign.sign(data);
        //验证签名
        boolean verify = sign.verify(data, signed);
        return sign.toString();
    }
    /*注销*/
    @RequestMapping("/getgetAllUserMessage")
    public  List<Map<String, Object>> hell04() {
        List<Map<String, Object>> maps = userService.getgetAllUserMessage();
        return maps;
    }
   /*testSysMenu*/
    @RequestMapping("/getBaseMapper")
    public  BaseMapper<SysMenu> hell05() {
        BaseMapper<SysMenu> baseMapper = sysMenuService.getBaseMapper();
        return baseMapper;
    }

    /*注销*/
    @RequestMapping("/count")
    public  List<SysMenu> hell06() {
        List<SysMenu> list = sysMenuService.list();
        return list;
    }

}
