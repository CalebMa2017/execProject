package month02.week01.self.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo implements InvocationHandler{
    private Object target;
    public Object generateProxyObj(Object target) {
        this.target=target;
        Object proxyObj = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return proxyObj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理去海外淘货");
        Object invoke = method.invoke(target, args);
        System.out.println("合作结束，下次再见");
        return invoke;
    }
}
