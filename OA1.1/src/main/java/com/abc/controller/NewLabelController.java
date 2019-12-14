package com.abc.controller;

import com.abc.beans.NewLabel;
import com.abc.service.INewLabelService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpOutputMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

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
        //在这里还要把全部查询一下，
        List<NewLabel> newLabels2 = service.findNewLabel();
        List<NewLabel> newLabels = service.findNewLabel(page,size,pid);
        PageInfo pageInfo = new PageInfo(newLabels);
        session.setAttribute("pageInfo" ,pageInfo);
        session.setAttribute("newlabels" ,newLabels2);
        return "/html/news/栏目管理.jsp";
    }

    @RequestMapping("/findnewlabelByparent.do")
    public String findNewLbelByparent(HttpServletRequest request,
                              @RequestParam(name = "page",required = true,defaultValue = "1") int page ,
                              @RequestParam(name = "size",required = true,defaultValue = "5")int size,
                                @RequestParam(name = "pid" ,required = true,defaultValue = "0")int pid){

        List<NewLabel> newLabels = service.findNewLabelByPid(page,size,pid);
        System.out.println("这是通过父id查询方法中的");
        System.out.println(newLabels);
        PageInfo pageInfo = new PageInfo(newLabels);
        request.setAttribute("pageInfo" ,pageInfo);
        request.setAttribute("pid",pid);
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
    public String findNewlabelById(int id,HttpServletRequest request){

        NewLabel newLabel = service.findNewLabelById(id);
        List<NewLabel> newLabels = service.findNewLabel();
        request.setAttribute("newlabel",newLabel);
        request.setAttribute("newlabels",newLabels);
        return "/html/news/栏目修改.jsp";
    }
    //通过id修改栏目信息
    @RequestMapping("/modifynewlabel.do")
    public String modifyNewlabel(NewLabel newLabel, HttpSession session, HttpServletRequest request){
        PageInfo pageInfo = (PageInfo) session.getAttribute("pageInfo");
        int n = service.modifyNewlabel(newLabel);
        String msg = (n>=0?"修改成功":"修改失败");
        request.setAttribute("msg",msg);
        return "forward:/html/news/栏目修改.jsp";
    }

    //添加栏目add
    @RequestMapping("/addnewlabel.do")
    public String addNewlabel(NewLabel newLabel, HttpServletRequest request){
        System.out.println(newLabel);
        int n = service.addNewlabel(newLabel);
        System.out.println("n="+n);
        String msg = (n>0?"添加成功":"添加失败");
        request.setAttribute("msg",msg);
        return "forward:/html/news/栏目添加.jsp";
    }

}
