package com.abc.service;

import com.abc.beans.Users;

import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/14/0014 16:21
 * @Version 1.0
 **/
public interface IUsersService {

    List<Users> findAll(int page, int size);

    int addUser(Users user);
}
