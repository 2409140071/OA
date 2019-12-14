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

import javax.servlet.http.HttpServletRequest;
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
    @Autowired
    public INewLabelService labelService ;
    @RequestMapping("/addnews.do")
    public String addNews(News news){
        service.addNews(news);
        return "/html/news/新闻发布.jsp";
    }

    //查找全部栏目
    @RequestMapping("/findNewlabels.do")
    public String fineNewLables(HttpSession session){

        System.out.println("通过了这个方法");
        List<NewLabel> newLabels = labelService.findNewLabel();
        if (newLabels.isEmpty()){
            System.out.println("这是一个空的");
        }
        session.setAttribute("newlabels",newLabels);
        newLabels.forEach(System.out::println);
        return "/html/news/新闻发布.jsp";

    }


    @RequestMapping("/findnews.do")
    public String findNews(HttpServletRequest request){
        List<News> news =  service.findNews();
        if (news.size()==0){

            System.out.println("这是一个空的方法");
        }else
        {
            System.out.println("非空");
            System.out.println(news);
        }

        request.setAttribute("news",news);
        return "/html/news/新闻维护_普通查询.jsp";
    }

}
