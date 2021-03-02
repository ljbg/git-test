package 桥接模式;

//手机品牌
abstract class HandSetBrand {
    protected  HandSetSoft soft;

    public void setSoft(HandSetSoft soft){
        this.soft = soft;
    }

    public abstract void run();

}
