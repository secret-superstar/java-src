package util;


import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * 日历的操作
 * 描述：
 * 日历的功能操作
 * 1. 根据时间戳获取时间的情况
 * 2. 可以指定年月日和时分秒来生成日期
 * 3.
 */
public class TestCalendar {


    @Test
    public void testCrud() throws ParseException {

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        long timestamp = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timestamp);
        Assert.assertEquals(date, calendar.getTime());

        //根据字符串转换成timestamp, 解决日期的格式问题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar1 = sdf.getCalendar();

        //对这个时间进行日历的操作
        DateFormat dateFormat = DateFormat.getInstance();
        String string = "2019-10-01";
        Date date1 = dateFormat.parse(string);
        Assert.assertEquals(dateFormat.format(date1), string);

        //使用字符串转成日期的格式
    }

    /**
     * 是否可以支持各种正则的解析
     * 描述：
     * 1.
     * @param date
     * @return
     */
    private static String dateToString(Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static Date stringToDate(String string) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return sdf.parse(string);
    }
}

