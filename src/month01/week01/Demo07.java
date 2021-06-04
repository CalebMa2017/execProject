package month01.week01;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo07 {

    public static void main(String[] args) {

    }
    @Test
    public void test01() {
        Date date = new Date();
        Date date2 = new Date(System.currentTimeMillis());
        System.out.println(date);
        System.out.println(date2);
    }
    @Test
    public void test02() {
        Calendar calendar = Calendar.getInstance();
        //Calendar.MONTH索引是从零开始的
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.MONTH));
        calendar.set(1974,4,24);
        System.out.println(calendar);
        calendar.setLenient(false);
    }
    @Test
    public void test03() {
        DateFormat df = DateFormat.getDateInstance();
        DateFormat dtf = DateFormat.getDateTimeInstance();
        String format = df.format(new Date());
        System.out.println(format);
        try {
            df.parse("1949-9-1");
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void test04() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        String format = sdf.format(new Date());
        System.out.println(format);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
        String format1 = sdf2.format(new Date());
        System.out.println(format1);
    }

}
