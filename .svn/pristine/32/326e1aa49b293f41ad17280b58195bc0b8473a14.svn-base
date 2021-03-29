package snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public class GamePanel extends JPanel implements KeyListener, ActionListener {

    int length; //蛇的长度
    int [] x = new int[100];
    int [] y = new int[100];
    String direct;   //控制小蛇上下左右
    boolean isStart = false;  //游戏是否开始
    Timer timer = new Timer(150,  this);  //定时器
    //定义一个食物
    int foodX;
    int foodY;
    Random random = new Random();
    //死亡判断
    boolean isFail = false;
    //积分系统
    int score;


    //构造器
    public GamePanel(){
        init();
        //获取键盘的监听事件
        this.setFocusable(true);
        this.addKeyListener(this);
        timer.start();   //让时间动起来
    }

    //初始化
    public void init(){
        length = 3;
        x[0] = 100; y[0] = 100;  //头部坐标
        x[1] = 75;  y[1] = 100;  //第一个身体坐标你
        x[2] = 50;  y[2] = 100;  //第二个身体坐标
        direct="R";

        foodX =  25*random.nextInt(35);
        foodY =  25*random.nextInt(31);

        score = 0;

        timer.setDelay(150);

    }


     //画板: 画界面,画蛇
    //Graphics : 画笔
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);   //清屏
        this.setBackground(Color.GRAY);
        g.fillRect(0,0,900,800);
        //画一条静态的小蛇
        if(direct.equals("R")){
            Data.right.paintIcon(this,g,x[0],y[0]);
        }else if(direct.equals("L")){
            Data.left.paintIcon(this,g,x[0],y[0]);
        }else if(direct.equals("U")){                    //控制蛇头的方向
            Data.up.paintIcon(this,g,x[0],y[0]);
        }else if(direct.equals("D")){
            Data.down.paintIcon(this,g,x[0],y[0]);
        }
        for (int i = 1; i < length; i++) {
            Data.body.paintIcon(this,g,x[i],y[i]);   //蛇的身体长度通过Length控制
        }
        //画食物
        Data.food.paintIcon(this,g,foodX,foodY);
        //画积分
        g.setColor(Color.green);
        g.setFont(new Font("微软雅黑",Font.BOLD,18));
        g.drawString("长度"+length,750,35);
        g.drawString("分数"+score,750,60);


        //游戏提示,是否开始
        if(isStart==false){
            //画一个字符串 提示信息
            g.setColor(Color.CYAN);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("按空格开始游戏",300,300);
        }
        //失败提醒
        if(isFail){
            //画一个字符串 提示信息
            g.setColor(Color.CYAN);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("游戏失败了,按空格重新开始游戏",175,300);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //键盘按下 弹起
    }

    @Override
    public void keyPressed(KeyEvent e) {      //键盘按下
      //获取按下的键盘
        int keyCode = e.getKeyCode();
        if(keyCode==32){      //如果按下空格键
            if(isFail){         //失败,游戏再来一遍
                isFail=false;
                init();       //重新初始化游戏
            }else {         //暂停游戏
                isStart = !isStart;
            }
            repaint();    //刷新界面
        }

        //键盘控制上下左右
        if(keyCode==37 && direct!="R"){
            direct = "L";
        }else if(keyCode==39 && direct!="L"){
            direct = "R";
        }else if(keyCode==38 && direct!="D"){
            direct = "U";
        }else if(keyCode==40 && direct!="U"){
            direct = "D";
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
      //键盘释放
    }



    //定时器,监听时间, 帧 实现定时操作
    @Override
    public void actionPerformed(ActionEvent e) {
        if(isStart && isFail==false){             //游戏开始并且游戏没有失败
            for (int i = length - 1; i > 0; i--) {  //右移
                x[i] = x[i-1];
                y[i] = y[i-1];
            }
            //通过控制方向让头部移动
            if(direct.equals("R")){
                x[0] = x[0] + 25;
                //边界判断
                if(x[0]>900){
                    isFail=true;
                }
            }else if(direct.equals("L")){
                x[0] = x[0] - 25;
                //边界判断
                if(x[0]<0){
                    isFail=true;
                }
            }else if(direct.equals("U")){
                y[0] = y[0] - 25;
                //边界判断
                if(y[0]<0){
                    isFail=true;
                }
            }else if(direct.equals("D")){
                y[0] = y[0] + 25;
                //边界判断
                if(y[0]>800){
                    isFail=true;
                }
            }
            //吃到食物的时候
            if(x[0]==foodX && y[0]==foodY){
                //长度加1
                length++;
                score = score + 10;  //分数增加
                //重新生成食物
                foodX =  25*random.nextInt(35);
                foodY =  25*random.nextInt(31);
            }

            //失败判断
            for (int i = 1; i < length; i++) {
                if(x[0]==x[i] && y[0]==y[i]){
                    isFail=true;
                }
            }
            //刷新页面
            repaint();
        }

        if (length<10){
            timer.start();
        }else if(length>10){
            timer.setDelay(50);
            timer.start();
        }



    }
}
