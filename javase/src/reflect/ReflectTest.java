package reflect;


import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

//简单框架类   可以为任何类创建对象,并且可以执行他们的任意方法
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        //加载配置文件
        InputStream resource = ReflectTest.class.getClassLoader().getResourceAsStream("reflect.properties");
        p.load(resource);
        String className = p.getProperty("className");
        String method = p.getProperty("method");
        Person person = (Person) Class.forName(className).newInstance();
        Method method1 = Class.forName(className).getMethod(method);
        method1.invoke(person);
    }
}
