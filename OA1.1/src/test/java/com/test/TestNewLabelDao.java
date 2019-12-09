package com.test;

import com.abc.beans.NewLabel;
import com.abc.dao.INewLabelDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/3/0003 16:37
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-*.xml","classpath:mybatis.xml"})
public class TestNewLabelDao {

    @Autowired
    public INewLabelDao dao;
    @Test
    public void test01(){
        List<NewLabel> newLabels = dao.findNewLabel();
        for (NewLabel newLabel :newLabels){
            System.out.println(newLabel);
        }
    }
}
