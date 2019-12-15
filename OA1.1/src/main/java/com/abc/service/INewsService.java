package com.abc.service;

import com.abc.beans.News;

import java.util.List;

public interface INewsService {
    int addNews(News news);

    List<News> findNews();

    News findNewsById(int id);

    int modifyNews(News news);
}
