package com.abc.service.impl;

import com.abc.beans.News;
import com.abc.dao.INewsDao;
import com.abc.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements INewsService {

    @Autowired
    private INewsDao dao;
    @Override
    public void addNews(News news) {
        dao.addNews(news);
    }
}
