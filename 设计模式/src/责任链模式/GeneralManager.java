package 责任链模式;

//总经理
public class GeneralManager  extends Manager{
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestDo(MyRequest request) {
        if(request.getType() == "请假"){
            System.out.println(request.getContent()+" :被批准   批准人: "+this.name);
        }
        else if(request.getType() == "加薪" && request.getNumber() <= 500){
            System.out.println(request.getContent()+" :被批准   批准人: "+this.name);
        }
        else if(request.getType() == "加薪" && request.getNumber() > 500){
            System.out.println(request.getContent()+" :不被批准   批准人: "+this.name);
        }
    }
}
