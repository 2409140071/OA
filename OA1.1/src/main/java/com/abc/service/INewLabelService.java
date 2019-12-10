package com.abc.service;

import com.abc.beans.NewLabel;
import com.abc.beans.News;

import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/3/0003 15:14
 * @Version 1.0
 **/
public interface INewLabelService {

    List<NewLabel> findNewLabel(int page,int size,int pid);
    //查询全部，为分页
//    List<NewLabel> findNewLabel1();

    void deleteNewlabel(int id);

    NewLabel findNewLabelById(int id);


    void modifyNewlabel(NewLabel newLabel);

    void addNewlabel(NewLabel newLabel);
}
