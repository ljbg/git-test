package 抽象工厂模式;

import java.net.IDN;

public class DataAccess {
    private static  String AssemblyName = "抽象工厂模式";
    private static String db = "Access";
    //private static String db = "Sqlserver";

    public static  IUser createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = AssemblyName + "." + db + "User";
        return (IUser) Class.forName(className).newInstance();
    }

    public static  IDepartment createDepartment() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = AssemblyName + "." + db + "Department";
        return (IDepartment) Class.forName(className).newInstance();
    }
}
