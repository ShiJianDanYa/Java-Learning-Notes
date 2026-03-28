package 继承.课堂练习.方法重写.手机进化;

/**
 * ClassName: ThirdGeneration
 * Package: 继承.课堂练习.方法重写
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/19 - 14:58
 * @Version: v1.0
 *
 */
public class ThirdGeneration extends SecondGeneration {
    //重写方法
    //注解/注释：都是对代码的解释说明
    //注释：给程序员看的（文字性的内容）
    //注解：给虚拟机看的
    @Override
    public void call(){
        System.out.println("视频通话");
    }

    //添加功能 玩游戏
    public void playGame(){
        System.out.println("玩游戏");
    }

}
