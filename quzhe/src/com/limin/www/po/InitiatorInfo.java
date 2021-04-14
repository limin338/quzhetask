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
    private String club_introduction;
    private String password;
    private String init_status = "审核中";

    public InitiatorInfo(Integer id, String init_name, String init_phonenumber, String init_club, String club_introduction, String password, String init_status) {
        this.id = id;
        this.init_name = init_name;
        this.init_phonenumber = init_phonenumber;
        this.init_club = init_club;
        this.club_introduction = club_introduction;
        this.password = password;
        if(init_status == null){
            this.init_status = init_status;
        }
    }

    public String getInit_status() {

        return init_status;
    }

    public void setInit_status(String init_status) {
        if(init_status == null){
            this.init_status = init_status;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
        return club_introduction;
    }

    public void setClub_introdution(String club_introdution) {
        this.club_introduction = club_introdution;
    }

    @Override
    public String toString() {
        return "InitiatorInfo{" +
                "id=" + id +
                ", init_name='" + init_name + '\'' +
                ", init_phonenumber='" + init_phonenumber + '\'' +
                ", init_club='" + init_club + '\'' +
                ", club_introduction='" + club_introduction + '\'' +
                ", password='" + password + '\'' +
                ", init_status='" + init_status + '\'' +
                '}';
    }

    public InitiatorInfo(String init_club) {
        this.init_club = init_club;
    }

    public InitiatorInfo(Integer id, String init_name, String init_phonenumber, String init_club, String club_introduction, String password) {

        this.id = id;
        this.init_name = init_name;
        this.init_phonenumber = init_phonenumber;
        this.init_club = init_club;
        this.club_introduction = club_introduction;
        this.password = password;
    }

    public InitiatorInfo(String init_name, String init_phonenumber, String init_club, String password) {
        this.init_name = init_name;
        this.init_phonenumber = init_phonenumber;
        this.init_club = init_club;
        this.password = password;
    }

    public String getClub_introduction() {


        return club_introduction;
    }

    public void setClub_introduction(String club_introduction) {
        this.club_introduction = club_introduction;
    }

    public InitiatorInfo() {

    }

    public InitiatorInfo(String init_name, String password, String init_status) {
        this.init_name = init_name;
        this.password = password;
        this.init_status = init_status;
    }

    public InitiatorInfo(String init_name, String password) {
        this.init_name = init_name;
        this.password = password;
    }

    public InitiatorInfo(Integer id, String init_status) {
        this.id = id;
        this.init_status = init_status;
    }

    public void addInitiator(InitiatorInfo initiatorInfo) {
    }
}
