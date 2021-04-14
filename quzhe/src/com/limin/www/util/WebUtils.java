package com.limin.www.util;

import com.limin.www.po.StudentInfo;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author amin
 * @create 2021-04-07 10:50
 */
public class WebUtils {

    /**
     * 把Map中的值注入到javabean当中
     * @param value
     * @param bean
     */
    public static <T>  T copyParamToBean(Map value, T bean){

        try {
            /*
            把所有的请求参数都注入到对象中
             */
            BeanUtils.populate(bean,value);//核心代码
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    /**
     * 将字符串转换成为int类型的数据
     * @param strInt
     * @param defaultValue
     * @return
     */
    public static int parseInt(String strInt,int defaultValue){
        try {
            if(strInt != null) {
                return Integer.parseInt(strInt);
            }
        }catch(Exception e){
//            e.printStackTrace();
        }
        return defaultValue;
    }
}
