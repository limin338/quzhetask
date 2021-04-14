package com.limin.www.po;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amin
 * @create 2021-04-14 13:14
 */
public class StuAct {

    private Integer totalCount;//活动总数量
    private Integer totalHour;//活动总时长
    private List<StuActItem> items = new ArrayList<StuActItem>();

    @Override
    public String toString() {
        return "StuAct{" +
                "totalCount=" + totalCount +
                ", totalHour=" + totalHour +
                ", items=" + items +
                '}';
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(Integer totalHour) {
        this.totalHour = totalHour;
    }

    public List<StuActItem> getItems() {
        return items;
    }

    public void setItems(List<StuActItem> items) {
        this.items = items;
    }

    /**
     * 报名活动后，添加该活动到个人活动中
     * @param stuActItem
     */
    public void addItem(StuActItem stuActItem){
        StuAct stuAct = new StuAct();

        items.add(stuActItem);//添加该活动
//        stuAct.totalCount++;//活动数加1
        stuAct.totalHour += stuActItem.getAct_hour();//活动时长增加

    }
}
