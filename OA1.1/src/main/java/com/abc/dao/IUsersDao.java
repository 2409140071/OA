package com.abc.dao;

import com.abc.beans.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/14/0014 16:45
 * @Version 1.0
 **/
@Repository
public interface IUsersDao {

    @Select("select * from users")
    List<Users> findAll();

    @Insert("insert into users(username,password, nickname,worktime," +
            "sex,depid,duty,email,mobile,homephone,workphone,fax,MSN," +
            "birthday,httpaddress,address,content,logontime,lastlogontime,logoncount)" +
            " values(#{username},#{password},#{nickname},#{worktime}," +
            "#{sex},#{depid},#{duty},#{email},#{mobile},#{homephone},#{workphone},#{fax},#{MSN}" +
            ",#{birthday},#{httpaddress},#{address},#{content},#{logontime},#{lastlogontime},#{logoncount})")
    int addUsers(Users users);
}
