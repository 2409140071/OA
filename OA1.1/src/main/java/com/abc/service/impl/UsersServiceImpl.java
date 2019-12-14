package com.abc.service.impl;

import com.abc.beans.Users;
import com.abc.dao.IUsersDao;
import com.abc.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/14/0014 16:21
 * @Version 1.0
 **/
@Service
public class UsersServiceImpl implements IUsersService {
    @Autowired
    private IUsersDao dao;
    @Override
    public List<Users> findAll(int page, int size) {
        return dao.findAll();
    }

    @Override
    public int addUser(Users user) {
        return dao.addUsers(user);
    }
}
