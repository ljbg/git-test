package 责任链模式;

public class MyRequest {
    private String type;    //申请类型
    private String content;  //申请内容
    private int number;      //申请数量

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
