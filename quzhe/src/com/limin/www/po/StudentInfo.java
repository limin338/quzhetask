package com.limin.www.po;


public class StudentInfo {
    private Integer id;
    private String stu_number;
    private String stu_name;
    private  String password;
    private String grade;
    private String phonenumber;
    private long hour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStu_number() {
        return stu_number;
    }

    public void setStu_number(String stu_number) {
        this.stu_number = stu_number;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public long getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id=" + id +
                ", stu_number='" + stu_number + '\'' +
                ", stu_name='" + stu_name + '\'' +
                ", password='" + password + '\'' +
                ", grade='" + grade + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", hour=" + hour +
                '}';
    }

    public StudentInfo() {
    }

    public StudentInfo(Integer id, String stu_number, String stu_name, String password, String grade, String phonenumber, int hour) {
        this.id = id;
        this.stu_number = stu_number;
        this.stu_name = stu_name;
        this.password = password;
        this.grade = grade;
        this.phonenumber = phonenumber;
        this.hour = hour;
    }
}
