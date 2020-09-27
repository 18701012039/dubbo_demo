package com.zxb.service;/**
 * @author zxb
 * @date 2018/10/19
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2020/8/31
 * @since 1.0.0
 */
public class test {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        Date startTime =calendar.getTime();
        System.out.println(simpleDateFormat.format(startTime));
        calendar.add(Calendar.MONTH,-1);
        Date endTime =calendar.getTime();
        System.out.println(simpleDateFormat.format(endTime));
        System.out.println("123456");

    }
}
