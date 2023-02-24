package com.estate.service.impl;

import com.estate.mapper.OwnerMapper;
import com.estate.pojo.Owner;
import com.estate.pojo.OwnerExample;
import com.estate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhiyuan
 * @date 2022/11/27 -16:30
 */

//业务逻辑层，主要是做业务逻辑的处理
    @Service
public class UserServiceImpl implements UserService {
    @Autowired
    private OwnerMapper ownerMapper;

    @Override
    public Owner doLogin(String userName, String password) {
        OwnerExample example = new OwnerExample();
        OwnerExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(userName);
        criteria.andPasswordEqualTo(password);

        List<Owner> owners = ownerMapper.selectByExample(example);
        if(owners.size()>0 && owners!=null){  // 成功获取到用户，说明用户登录成功
            return owners.get(0);
        }
        return null;
    }

    @Override
    public void findUserById(Integer order) {

    }


    @Override
    public int updateUserMessage(Owner owner) {
        return ownerMapper.updateByPrimaryKey(owner);
    }
}
