package month02.week01.self.proxy;

/**
 * 代理的测试
 */
public class ProxyTest {
    public static void main(String[] args) {
        Shopping shoppingImple = new ShoppingImple();
        ProxyDemo pd = new ProxyDemo();
        Object o = pd.generateProxyObj(shoppingImple);
        ((Shopping)o).shop();
    }
}
