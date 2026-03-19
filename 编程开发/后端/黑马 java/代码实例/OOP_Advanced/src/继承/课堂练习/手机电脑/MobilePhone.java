package 继承.课堂练习.手机电脑;

/**
 * ClassName: MobilePhone
 * Package: 继承.课堂练习.手机电脑
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/19 - 12:33
 * @Version: v1.0
 *
 */
public class MobilePhone extends Electronics {

    //行为 打电话 发短信
    public void call(){
        System.out.println("打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
}
