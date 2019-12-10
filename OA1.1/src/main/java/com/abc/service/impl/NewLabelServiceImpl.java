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
    public List<NewLabel> findNewLabel(int page ,int size ,int pid) {

        PageHelper.startPage(page,size);
        List<NewLabel> newLabels = dao.findNewLabel(pid);
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
    public void modifyNewlabel(NewLabel newLabel) {
        dao.modifyNewlabel(newLabel);
    }

    @Override
    public void addNewlabel(NewLabel newLabel) {
        dao.addNewlabel(newLabel);
    }
}
