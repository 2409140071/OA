package com.abc.dao;

import com.abc.beans.NewLabel;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/3/0003 15:13
 * @Version 1.0
 **/
@Repository
public interface INewLabelDao {
    //查询栏目及其父栏目
    @Select("select * from newlabel")
    @Results(id = "newlabelMap", value = {
            @Result(id=true,property="id",column="id"),
            @Result(property="name",column="label_name"),
            @Result(property="content",column="label_content"),
            @Result(property="pid",column="pid"),
            @Result(property = "parent" ,column = "pid",one=@One(select="com.abc.dao.INewLabelDao.findParentByPid"))
    })
    List<NewLabel> findNewLabel();

    //通过父栏目Id查询父栏目
    @Select("select * from newlabel where id=#{pid}")
    @ResultMap("newlabelMap")
    NewLabel findParentByPid(int pid);

    //查询栏目子栏目
    @Select("select * from newlabel where pid=#{pid}")
    @Results({
            @Result(id=true,property="id",column="id"),
            @Result(property="name",column="label_name"),
            @Result(property="content",column="label_content"),
            @Result(property="pid",column="pid"),
            @Result(property = "children" ,column = "pid",many=@Many(select="com.abc.dao.INewLabelDao.findNewLabelByPid"))
    })
    List<NewLabel> findNewLabelByPid(int pid);

    //通过id删除栏目
    @Delete("delete from newlabel where id=#{pid}")
    void deleteNewlabel(int id);

    //通过id查询栏目
    @Select("select * from newlabel where id=#{id}")
    @ResultMap("newlabelMap")
    NewLabel findNewLabelById(int id);
    //修改栏目信息
    @Update("update newlabel set label_name = #{name},label_content = #{content},pid = #{pid} where id = #{id}")
    int modifyNewlabel(NewLabel newLabel);

    //添加栏目信息
    @Insert("insert into newlabel(label_name,label_content,pid) values(#{name},#{content},#{pid})")
    int addNewlabel(NewLabel newLabel);
}
