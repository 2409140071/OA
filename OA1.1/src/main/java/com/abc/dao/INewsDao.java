package com.abc.dao;

import com.abc.beans.News;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INewsDao {

    @Insert("insert into newmanage(uid,labelid,title,content,time) value(#{uid},#{labelid},#{title},#{content},#{time})")
    int addNews(News news);

    @Select("select * from newmanage")
    @Results(id = "newMap", value = {
            @Result(id=true,property="id",column="id"),
            @Result(property="uid",column="u_id"),
            @Result(property="labelid",column="labelid"),
            @Result(property="title",column="title"),
            @Result(property="content",column="content"),
            @Result(property="time",column="time"),
    })
    List<News> findNews();

    @Select("select * from newmanage where id=#{id}")
    News findNewsById(int id);
    @Update("update newmanage set uid=#{uid},labelid=#{labelid},title=#{title},content=#{content},time=#{time} where id=#{id}")
    int modifyNews(News news);
}
