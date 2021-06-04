package month01.week04.selfCourse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 日期时间操作类Date format Calendar
 */
public class Example04 {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        long l = System.currentTimeMillis();
        System.out.println(l);
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        System.out.println(calendar);
        Date time = calendar.getTime();
        System.out.println(time);
        System.out.println(calendar.get(Calendar.YEAR)+"年"+
                (calendar.get(Calendar.MONTH)+1)+"月"+
                calendar.get(Calendar.DAY_OF_MONTH)+"日"+
                " "+calendar.get(Calendar.HOUR)+":"+
                calendar.get(Calendar.MINUTE)+":"+
                calendar.get(Calendar.SECOND));
        //日历格式化
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(df.format(d));
    }
}
