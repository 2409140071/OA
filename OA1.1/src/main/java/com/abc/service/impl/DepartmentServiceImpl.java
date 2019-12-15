package com.abc.service.impl;

import com.abc.beans.Department;
import com.abc.beans.Users;
import com.abc.dao.IDepartmentDao;
import com.abc.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/14/0014 17:26
 * @Version 1.0
 **/
@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private IDepartmentDao dao;
    @Override
    public List<Users> findAll(int page, int size) {
        return dao.findAll();
    }

    @Override
    public int addDepartment(Department department) {
        return dao.addDepartment(department);
    }
}
