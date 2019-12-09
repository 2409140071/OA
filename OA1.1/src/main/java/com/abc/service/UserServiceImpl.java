package com.abc.service;

import com.abc.beans.User;
import com.abc.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public void addUser(User user) {
        System.out.println("service=" +user);
        userDao.insertUser(user);
    }
}
