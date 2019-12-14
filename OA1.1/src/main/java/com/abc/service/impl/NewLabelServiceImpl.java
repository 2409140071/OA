package com.abc.service.impl;

import com.abc.beans.NewLabel;
import com.abc.dao.INewLabelDao;
import com.abc.service.INewLabelService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/3/0003 15:15
 * @Version 1.0
 **/
@Service
public class NewLabelServiceImpl implements INewLabelService {
    @Autowired
    public INewLabelDao dao;
    @Override
    public List<NewLabel> findNewLabel(int page ,int size,int pid) {

        PageHelper.startPage(page,size);
        List<NewLabel> newLabels = dao.findNewLabel();
        return newLabels;
    }

    @Override
    public List<NewLabel> findNewLabel() {

        List<NewLabel> newLabels = dao.findNewLabel();
        if (newLabels.isEmpty()){
            System.out.println("在srvice方法中是空的");
        }
        return newLabels;
    }

    @Override
    public void deleteNewlabel(int id) {
        dao.deleteNewlabel(id);
    }

    @Override
    public NewLabel findNewLabelById(int id) {
        return dao.findNewLabelById(id);
    }

    @Override
    public int modifyNewlabel(NewLabel newLabel) {

        return dao.modifyNewlabel(newLabel);
    }

    @Override
    public int addNewlabel(NewLabel newLabel) {

        return dao.addNewlabel(newLabel);
    }

    @Override
    public List<NewLabel> findNewLabelByPid(int page, int size, int pid) {

        return dao.findNewLabelByPid(pid);
    }
}
