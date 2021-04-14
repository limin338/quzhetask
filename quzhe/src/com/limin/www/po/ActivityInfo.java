package com.limin.www.po;

import java.time.LocalDate;



/**
 * @author amin
 * @create 2021-04-02 20:27
 */
public class ActivityInfo {

    private Integer id;
    private String act_club;
    private String act_name;
    private String act_type;
    private String act_site;
    private String act_time;
    private int act_hour;
    private String act_status = "待审核";
    private long act_maxpeople;
    private String act_content;
    private String img_path="static/img/quzhe.jpg";

    @Override
    public String toString() {
        return "ActivityInfo{" +
                "id=" + id +
                ", act_club='" + act_club + '\'' +
                ", act_name='" + act_name + '\'' +
                ", act_type='" + act_type + '\'' +
                ", act_site='" + act_site + '\'' +
                ", act_time=" + act_time +
                ", act_hour=" + act_hour +
                ", act_status='" + act_status + '\'' +
                ", act_maxpeople=" + act_maxpeople +
                ", act_content='" + act_content + '\'' +
                ", img_path='" + img_path + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAct_club() {
        return act_club;
    }

    public void setAct_club(String act_club) {
        this.act_club = act_club;
    }

    public String getAct_name() {
        return act_name;
    }

    public void setAct_name(String act_name) {
        this.act_name = act_name;
    }

    public String getAct_type() {
        return act_type;
    }

    public void setAct_type(String act_type) {
        this.act_type = act_type;
    }

    public String getAct_site() {
        return act_site;
    }

    public void setAct_site(String act_site) {
        this.act_site = act_site;
    }

    public String getAct_time() {
        return act_time;
    }

    public void setAct_time(String act_time) {
        this.act_time = act_time;
    }

    public int getAct_hour() {
        return act_hour;
    }

    public void setAct_hour(int act_hour) {
        this.act_hour = act_hour;
    }

    public String getAct_status() {
        return act_status;
    }

    public void setAct_status(String act_status) {
        if (act_status == null) {
            this.act_status = act_status;
        }
    }

    public long getAct_maxpeople() {
        return act_maxpeople;
    }

    public void setAct_maxpeople(long act_maxpeople) {
        this.act_maxpeople = act_maxpeople;
    }

    public String getAct_content() {
        return act_content;
    }

    public void setAct_content(String act_content) {
        this.act_content = act_content;
    }

    public String getImg_path() {
        return img_path;
    }


    public ActivityInfo(Integer id) {
        this.id = id;
    }

    public ActivityInfo(Integer id, String act_status) {
        this.id = id;
        this.act_status = act_status;
    }

    public void setImg_path(String img_path) {
        //要求给定的图片路径不能为空
        if(img_path == null && !"".equals(img_path)){
            this.img_path = img_path;
        }
    }

    public ActivityInfo(Integer id, String act_club, String act_name, String act_type, String act_site, String act_time, int act_hour, String act_status, int act_maxpeople, String act_content, String img_path) {
        this.id = id;
        this.act_club = act_club;
        this.act_name = act_name;
        this.act_type = act_type;
        this.act_site = act_site;
        this.act_time = act_time;
        this.act_hour = act_hour;
        if (act_status == null) {
            this.act_status = act_status;
        }
        this.act_maxpeople = act_maxpeople;
        this.act_content = act_content;
        //要求给定的图片路径不能为空
        if(img_path == null && !"".equals(img_path)){
            this.img_path = img_path;
        }

    }

    public ActivityInfo() {

    }


}