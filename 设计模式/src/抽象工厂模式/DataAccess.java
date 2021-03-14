package 抽象工厂模式;

import java.io.IOException;
import java.io.InputStream;
import java.net.IDN;
import java.util.Properties;

public class DataAccess {

    private static  String AssemblyName = "抽象工厂模式";
    private static String db = "";
    //private static String db = "Sqlserver";

    static {
        Properties prop = new Properties();
        InputStream is= DataAccess.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            prop.load(is);
            db = prop.getProperty("db");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  IUser createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = AssemblyName + "." + db + "User";
        return (IUser) Class.forName(className).newInstance();
    }

    public static  IDepartment createDepartment() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = AssemblyName + "." + db + "Department";
        return (IDepartment) Class.forName(className).newInstance();
    }
}
