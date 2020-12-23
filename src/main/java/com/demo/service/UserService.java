package com.demo.service;


import com.demo.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    /*获取所有用户*/
    public List<User> getAllUser();
    /*获取用户所有信息*/
    List<Map<String ,Object>>getgetAllUserMessage();

}
