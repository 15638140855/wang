package com.demo.mapper;


import com.demo.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /*获取所有用户*/
    @Select(" select  * from user_login;")
    public List<User> getAllUser();
    /*获取用户所有信息*/
    List<Map<String ,Object>> getgetAllUserMessage();
}
