package com.bishe.service;

import com.bishe.dao.usermapper.UserMapper;
import com.bishe.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yuanyuanAndDuxiaoyue
 * @Date: 2020-01-05 12:33
 * @Description:
 */
@Service
public class UserService {
@Autowired
    private UserMapper userMapper;
    public User findById(String id){
        return userMapper.findById(id);
    }
}
