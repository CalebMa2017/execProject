package month02.week01.self.bean;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * bean的使用
 */
public class JavaBeanTest {

    public static void main(String[] args) {
        //获得了数据
        String name1="hiewfhewf";
        String name2="jdfeowjfo";
        int age1=33;
        int age2=28;
        User u1 = new User();
        User u2 = new User();
        //存入Map中
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name",name1);
        map.put("age",age1);
        Map<String,Object> map2 = new HashMap<>();
        map2.put("name",name2);
        map2.put("age",age2);
        try {
            BeanUtils.populate(u1,map);
            BeanUtils.populate(u2,map2);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(u1);
        System.out.println("---------------------------");
        System.out.println(u2);
        System.out.println("====================");
        try {
            BeanUtils.setProperty(u1,"name","hfxxxxx");
            BeanUtils.setProperty(u1,"age",999);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(u1);
    }
}
