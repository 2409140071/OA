package com.abc.beans;

import java.util.List;

/**
 * @Author MZZ
 * @Date 2019/12/3/0003 15:10
 * @Version 1.0
 **/
public class NewLabel {

    private Integer id;
    private String name;
    private String content;
    private String pid;

    //关联属性，多对一
    private NewLabel parent;
    //关联属性，一对多
    private List<NewLabel> children;
    @Override
    public String toString() {
        return "NewLabel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", pid='" + pid + '\'' +
                ", parent=" + parent +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public NewLabel getParent() {
        return parent;
    }

    public void setParent(NewLabel parent) {
        this.parent = parent;
    }
}
