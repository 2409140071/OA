package com.abc.service;

import com.abc.beans.Department;
import com.abc.beans.Users;

import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/14/0014 17:25
 * @Version 1.0
 **/
public interface IDepartmentService {
    List<Users> findAll(int page, int size);

    int addDepartment(Department department);
}
