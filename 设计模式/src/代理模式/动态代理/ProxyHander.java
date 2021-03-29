package 代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHander  implements InvocationHandler {
    private Object target;

    public ProxyHander(Object target) {
        this.target = target;
    }

    //生成代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(target, args);
        fare();
        return result;
    }

    public void seeHouse(){
        System.out.println("看房");
    }
    public void fare(){
        System.out.println("收取中介费");
    }
}
