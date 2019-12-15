package com.abc.beans;

/**
 * @Author MZZ
 * @Date 2019/12/14/0014 17:16
 * @Version 1.0
 **/
public class Department {

    private Integer id;
    private String depname;
    private Integer pid;
    private String email;
    private String phone;
    private String content;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", depname='" + depname + '\'' +
                ", pid=" + pid +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
