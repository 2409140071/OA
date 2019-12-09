package com.abc.dao;

import com.abc.beans.News;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface INewsDao {

    @Insert("insert into newmanage(uid,labelid,title,content,time) value(#{uid},#{labelid},#{title},#{content},#{time})")
    void addNews(News news);
}
