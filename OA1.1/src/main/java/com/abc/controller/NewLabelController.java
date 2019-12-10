package com.abc.controller;

import com.abc.beans.NewLabel;
import com.abc.service.INewLabelService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/3/0003 15:14
 * @Version 1.0
 **/
@Controller
@RequestMapping("/newlabel")
public class NewLabelController {

    @Autowired
    public INewLabelService service;

    @RequestMapping("/findnewlabel.do")
    public String findNewLbel(HttpSession session,
                              @RequestParam(name = "page",required = true,defaultValue = "1") int page ,
                              @RequestParam(name = "size",required = true,defaultValue = "5")int size,
                              @RequestParam(name = "pid" ,required = true,defaultValue = "0")int pid){

        List<NewLabel> newLabels = service.findNewLabel(page,size,pid);
        PageInfo pageInfo = new PageInfo(newLabels);
        session.setAttribute("pageInfo" ,pageInfo);
        return "/html/news/栏目管理.jsp";
    }

    @RequestMapping("/findnewlabelByparent.do")
    public String findNewLbelByparent(HttpSession session,
                              @RequestParam(name = "page",required = true,defaultValue = "1") int page ,
                              @RequestParam(name = "size",required = true,defaultValue = "5")int size){

        List<NewLabel> newLabels = service.findNewLabel(page,size);

        PageInfo pageInfo = new PageInfo(newLabels);
        session.setAttribute("pageInfo" ,pageInfo);
        return "/html/news/栏目管理.jsp";
    }
    //通过id删除栏目
    @RequestMapping("/deletenewlabel.do")
    public String deleteNewlabel(int id,HttpSession session){
        PageInfo pageInfo = (PageInfo) session.getAttribute("pageInfo");
        service.deleteNewlabel(id);
        return "redirect:/newlabel/findnewlabel.do?page="+pageInfo.getPageNum()+"&size="+pageInfo.getPageSize();
    }
    //通过id查询栏目
    @RequestMapping("/findnewlabelById.do")
    public String findNewlabelById(int id,HttpSession session){
        NewLabel newLabel = service.findNewLabelById(id);
        System.out.println(newLabel);
        session.setAttribute("newlabel",newLabel);
        return "/html/news/栏目修改.jsp";
    }
    //通过id修改栏目信息
    @RequestMapping("/modifynewlabel.do")
    public String modifyNewlabel(NewLabel newLabel,HttpSession session){
        PageInfo pageInfo = (PageInfo) session.getAttribute("pageInfo");
        System.out.println("这是modifynewlabel中的"+newLabel);
        service.modifyNewlabel(newLabel);
        return "redirect:/newlabel/findnewlabel.do?page="+pageInfo.getPageNum()+"&size="+pageInfo.getPageSize();
    }

    //添加栏目add
    @RequestMapping("/addnewlabel.do")
    @ResponseBody
    public String addNewlabel(NewLabel newLabel){
        System.out.println(newLabel);
        service.addNewlabel(newLabel);
        return "success,请关闭此页面吧";
    }

}
