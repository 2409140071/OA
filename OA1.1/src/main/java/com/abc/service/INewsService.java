package com.abc.service;

import com.abc.beans.News;

import java.util.List;

public interface INewsService {
    void addNews(News news);

    List<News> findNews();
}
