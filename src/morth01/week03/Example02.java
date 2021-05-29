package morth01.week03;

/**
 *模板方法模式
 */
public class Example02 {

    public static void main(String[] args) {
        BaseManager m = new UserManager();
        m.check("admin","insert");
    }
}


abstract class BaseManager{
    public abstract void execute(String name);
    public void check(String username, String name) {
        if("admin".equals(username)) {
            execute(name);
        }else {
            System.out.println("你没有操作该方法的权限");
        }
    }
}
class UserManager extends BaseManager {

    @Override
    public void execute(String name) {
        if("insert".equals(name)) {
            System.out.println("进行插入操作");
        }else if("add".equals(name)) {
            System.out.println("进行添加操作");
        }else {
            System.out.println("不能进行该方法");
        }
    }
}