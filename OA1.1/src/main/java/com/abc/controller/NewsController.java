package com.abc.controller;

import com.abc.beans.NewLabel;
import com.abc.beans.News;
import com.abc.service.INewLabelService;
import com.abc.service.INewsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/3/0003 15:14
 * @Version 1.0
 **/
@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    public INewsService service;
    @RequestMapping("/addnews.do")
    public String addNews(News news){
        service.addNews(news);
        return "/html/news/新闻发布.jsp";
    }
//    @RequestMapping("/findnewlabel.do")
//    public String findNewLbel(HttpSession session,
//                              @RequestParam(name = "page",required = true,defaultValue = "1") int page ,
//                              @RequestParam(name = "size",required = true,defaultValue = "5")int size){
//
//        List<NewLabel> newLabels = service.findNewLabel(page,size);
//        PageInfo pageInfo = new PageInfo(newLabels);
//        System.out.println(pageInfo);
//        for (NewLabel newLabel :newLabels){
//            System.out.println(newLabel);
//        }
//        session.setAttribute("pageInfo" ,pageInfo);
//        return "/html/news/栏目管理.jsp";
//    }
//
//    @RequestMapping("/findnewlabelByparent.do")
//    public String findNewLbelByparent(HttpSession session,
//                                      @RequestParam(name = "page",required = true,defaultValue = "1") int page ,
//                                      @RequestParam(name = "size",required = true,defaultValue = "5")int size){
//
//        List<NewLabel> newLabels = service.findNewLabel(page,size);
//        PageInfo pageInfo = new PageInfo(newLabels);
//        System.out.println(pageInfo);
//        for (NewLabel newLabel :newLabels){
//            System.out.println(newLabel);
//        }
//        session.setAttribute("pageInfo" ,pageInfo);
//        return "/html/news/栏目管理.jsp";
//    }
//    //通过id删除栏目
//    @RequestMapping("/deletenewlabel.do")
//    public String deleteNewlabel(int id){
//        service.deleteNewlabel(id);
//        return "/html/news/栏目管理.jsp";
//    }
//    //通过id查询栏目
//    @RequestMapping("/findnewlabelById.do")
//    public String findNewlabelById(int id){
//        NewLabel newLabel = service.findNewLabelById(id);
//
//
//        return "";
//    }

}
