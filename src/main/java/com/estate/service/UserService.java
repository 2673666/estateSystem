package com.estate.service;

import com.estate.pojo.Owner;

/**
 * @author zhiyuan
 * @date 2022/11/27 -16:21
 */
public interface UserService {
    Owner doLogin(String userName,String password);

    void findUserById(Integer order);

    int updateUserMessage(Owner owner);
}
