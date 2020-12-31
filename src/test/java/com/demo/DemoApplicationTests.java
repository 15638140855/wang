package com.demo;


import com.demo.service.SysUserRoleService;
import com.demo.service.SysUserService;
import org.junit.jupiter.api.Test;
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
/*        // 注册用户
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
        System.out.println(sysUserEntity);*/
    }

  /*  //使用springboot的测试类，然后注入RabbitTemplate模板类
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void helloWorldProvider(){
        rabbitTemplate.convertAndSend("hello","hhh");//给hello队列发送消息
    }*/

    int test(int a ){
        System.out.println(a);
        return a;
    }
    @Test
    void test1() {

   /*     List<String> row1 = CollUtil.newArrayList("aa", "bb", "cc", "dd");
        List<String> row2 = CollUtil.newArrayList("aa1", "bb1", "cc1", "dd1");
        List<String> row3 = CollUtil.newArrayList("aa2", "bb2", "cc2", "dd2");
        List<String> row4 = CollUtil.newArrayList("aa3", "bb3", "cc3", "dd3");
        List<String> row5 = CollUtil.newArrayList("aa4", "bb4", "cc4", "dd4");
        List<List<String>> rows = CollUtil.newArrayList(row1, row2, row3, row4, row5);
        //通过工具类创建writer
        ExcelWriter writer = ExcelUtil.getWriter("d:/writeTest.xlsx");
       //通过构造方法创建writer
       //ExcelWriter writer = new ExcelWriter("d:/writeTest.xls");
       //跳过当前行，既第一行，非必须，在此演示用
        writer.passCurrentRow();
       //合并单元格后的标题行，使用默认标题样式
        writer.merge(rows.size() - 1, "测试标题");
       //一次性写出内容，强制输出标题
        writer.write(rows, true);
       //关闭writer，释放内存
        writer.close();*/
        // 不用类型声明
    }
}
