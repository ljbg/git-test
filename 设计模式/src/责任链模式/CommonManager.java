package 责任链模式;

//经理
public class CommonManager  extends Manager{
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestDo(MyRequest request) {
        if(request.getType() == "请假" && request.getNumber() <= 2){
            System.out.println(request.getContent()+" :被批准   批准人: "+this.name);
        }else if(superior != null){
            superior.requestDo(request);
        }
    }
}
