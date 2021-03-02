package 享元模式;


import java.util.HashMap;

//网站工厂
public class WebsiteFactory {
    private HashMap flyweight = new HashMap();

    public Website getWebsite(String key){
        if(!flyweight.containsKey(key)){
            flyweight.put(key,new ConcreteWebsite(key));
        }
        return (Website) flyweight.get(key);
    }

    public int getCount(){
        return flyweight.size();
    }
}
