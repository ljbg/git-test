package 责任链模式;

public class Test {
    public static void main(String[] args) {
        CommonManager commonManager = new CommonManager("经理");
        MajorManager majorManager = new MajorManager("总监");
        GeneralManager generalManager = new GeneralManager("老板");
        commonManager.setSuperior(majorManager);
        majorManager.setSuperior(generalManager);

        MyRequest request = new MyRequest();
        request.setType("请假");
        request.setContent("李俊波请假");
        request.setNumber(1);
        commonManager.requestDo(request);

        MyRequest request4 = new MyRequest();
        request.setType("请假");
        request.setContent("李俊波请假");
        request.setNumber(4);
        commonManager.requestDo(request);


        MyRequest request2 = new MyRequest();
        request2.setType("加薪");
        request2.setContent("李俊波加薪");
        request2.setNumber(500);
        commonManager.requestDo(request2);

        MyRequest request3 = new MyRequest();
        request3.setType("加薪");
        request3.setContent("李俊波加薪");
        request3.setNumber(1000);
        commonManager.requestDo(request3);
    }
}
