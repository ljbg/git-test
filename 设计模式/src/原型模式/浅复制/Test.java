package 原型模式.浅复制;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("李俊波");
        a.setSexAge("男","21");
        a.setWorkExperience("2020","腾讯公司");
        Resume b = (Resume) a.clone();
        Resume c = (Resume) a.clone();
        b.setSexAge("男","20");
        b.setWorkExperience("2020","谷歌公司");
        c.setSexAge("男","19");
        c.setWorkExperience("2020","百度公司");
        a.display();
        b.display();
        c.display();

    }
}
