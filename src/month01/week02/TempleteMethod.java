package month01.week02;

/**
 * 模板方法模式
 * （抽象类的应用）
 */
public class TempleteMethod {

    public static void main(String[] args) {

    }

}
abstract class BaseManager {
    public abstract void execute(String exec);
    public void check(String name,String exec) {
        if("admin".equals(name)) execute(exec);
        else System.out.println("您没有权限这么做");
    }
}
//class UserManager extends BaseManager {
//
//}
