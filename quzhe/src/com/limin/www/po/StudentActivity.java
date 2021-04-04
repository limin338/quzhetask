package com.limin.www.po;

/**
 * @author amin
 * @create 2021-04-02 20:22
 */
public class StudentActivity {
    private Integer id;
    private String stu_name;
    private String activity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public StudentActivity(Integer id, String stu_name, String activity) {
        this.id = id;
        this.stu_name = stu_name;
        this.activity = activity;
    }

    public StudentActivity() {

    }

    @Override
    public String toString() {
        return "StudentActivity{" +
                "id=" + id +
                ", stu_name='" + stu_name + '\'' +
                ", activity='" + activity + '\'' +
                '}';
    }
}
