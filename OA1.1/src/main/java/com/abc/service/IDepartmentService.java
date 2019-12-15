package com.abc.service;

import com.abc.beans.Department;

import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/14/0014 17:25
 * @Version 1.0
 **/
public interface IDepartmentService {
    List<Department> findAll(int page, int size);

    int addDepartment(Department department);
}
