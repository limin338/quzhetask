package com.limin.www.po;

/**
 * @author amin
 * @create 2021-04-02 20:24
 */
public class InitiatorInfo {
    private Integer id;
    private String init_name;
    private String init_phonenumber;
    private String init_club;
    private String club_introdution;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInit_name() {
        return init_name;
    }

    public void setInit_name(String init_name) {
        this.init_name = init_name;
    }

    public String getInit_phonenumber() {
        return init_phonenumber;
    }

    public void setInit_phonenumber(String init_phonenumber) {
        this.init_phonenumber = init_phonenumber;
    }

    public String getInit_club() {
        return init_club;
    }

    public void setInit_club(String init_club) {
        this.init_club = init_club;
    }

    public String getClub_introdution() {
        return club_introdution;
    }

    public void setClub_introdution(String club_introdution) {
        this.club_introdution = club_introdution;
    }

    public InitiatorInfo(Integer id, String init_name, String init_phonenumber, String init_club, String club_introdution) {
        this.id = id;
        this.init_name = init_name;
        this.init_phonenumber = init_phonenumber;
        this.init_club = init_club;
        this.club_introdution = club_introdution;
    }

    public InitiatorInfo() {

    }

    @Override
    public String toString() {
        return "InitiatorInfo{" +
                "id=" + id +
                ", init_name='" + init_name + '\'' +
                ", init_phonenumber='" + init_phonenumber + '\'' +
                ", init_club='" + init_club + '\'' +
                ", club_introdution='" + club_introdution + '\'' +
                '}';
    }
}
