package com.abc.beans;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @Author MZZ
 * @Date 2019/12/14/0014 16:07
 * @Version 1.0
 **/
public class Users {

    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String worktime;
    private String sex;
    private Integer depid;
    private String duty;
    private String email;
    private String mobile;
    private String homephone;
    private String workphone;
    private String fax;
    private String MSN;
    private String birthday;
    private String httpaddress;
    private String address;
    private String content;
    private String logontime;
    private String lastlogontime;
    private String logoncount;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", worktime='" + worktime + '\'' +
                ", sex='" + sex + '\'' +
                ", depid=" + depid +
                ", duty='" + duty + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", homephone='" + homephone + '\'' +
                ", workphone='" + workphone + '\'' +
                ", fax='" + fax + '\'' +
                ", MSN='" + MSN + '\'' +
                ", birthday='" + birthday + '\'' +
                ", httpaddress='" + httpaddress + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                ", lastlogontime='" + lastlogontime + '\'' +
                ", logoncount='" + logoncount + '\'' +
                '}';
    }

    public String getLogontime() {
        return logontime;
    }

    public void setLogontime(String logontime) {
        this.logontime = logontime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public String getWorkphone() {
        return workphone;
    }

    public void setWorkphone(String workphone) {
        this.workphone = workphone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMSN() {
        return MSN;
    }

    public void setMSN(String MSN) {
        this.MSN = MSN;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHttpaddress() {
        return httpaddress;
    }

    public void setHttpaddress(String httpaddress) {
        this.httpaddress = httpaddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLastlogontime() {
        return lastlogontime;
    }

    public void setLastlogontime(String lastlogontime) {
        this.lastlogontime = lastlogontime;
    }

    public String getLogoncount() {
        return logoncount;
    }

    public void setLogoncount(String logoncount) {
        this.logoncount = logoncount;
    }
}
