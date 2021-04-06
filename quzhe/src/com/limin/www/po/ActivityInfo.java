package com.limin.www.po;

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
    private String act_status;
    private int act_maxpeople;
    private String act_content;

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
        this.act_status = act_status;
    }

    public int getAct_maxpeople() {
        return act_maxpeople;
    }

    public void setAct_maxpeople(int act_maxpeople) {
        this.act_maxpeople = act_maxpeople;
    }

    public String getAct_content() {
        return act_content;
    }

    public void setAct_content(String act_content) {
        this.act_content = act_content;
    }

    public ActivityInfo(Integer id, String act_club, String act_name, String act_type, String act_site, String act_time, int act_hour, String act_status, int act_maxpeople, String act_content) {
        this.id = id;
        this.act_club = act_club;
        this.act_name = act_name;
        this.act_type = act_type;
        this.act_site = act_site;
        this.act_time = act_time;
        this.act_hour = act_hour;
        this.act_status = act_status;
        this.act_maxpeople = act_maxpeople;
        this.act_content = act_content;
    }

    public ActivityInfo() {

    }
}