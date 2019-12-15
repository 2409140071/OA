package com.abc.controller;

import com.abc.beans.Department;
import com.abc.beans.Users;
import com.abc.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/14/0014 17:24
 * @Version 1.0
 **/
@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired

    private IDepartmentService service;

    @RequestMapping("/findall.do")
    public String findAll(@RequestParam(name = "page",required = true,defaultValue = "1") int page ,
                          @RequestParam(name = "size",required = true,defaultValue = "5")int size){
        System.out.println("请过了处理器方法");
        List<Department> departments = service.findAll(page,size);

        return "/html/person_manage/所有员工.jsp";
    }
    @RequestMapping("/addDepartment.do")
    public String addDepartment(Department department, HttpServletRequest request){
        System.out.println("请过了处理器方法");
        System.out.println(department);
        int n = service.addDepartment(department);
        String msg = (n>0?"添加成功":"添加失败");
        request.setAttribute("msg",msg);
        return "forward:/html/person_manage/部门添加.jsp";
    }

}
