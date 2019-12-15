package com.abc.dao;

import com.abc.beans.Department;
import com.abc.beans.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/14/0014 17:24
 * @Version 1.0
 **/
@Repository
public interface IDepartmentDao {
    @Select("select * from department")
    List<Users> findAll();
    @Insert("insert into department(depname,pid, email,phone,content)" +
            " values(#{depname},#{pid},#{email},#{phone},#{content})")
    int addDepartment(Department department);
}
