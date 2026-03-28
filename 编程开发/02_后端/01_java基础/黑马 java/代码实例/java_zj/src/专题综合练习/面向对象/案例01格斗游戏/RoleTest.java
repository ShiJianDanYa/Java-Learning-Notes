package 专题综合练习.面向对象.案例01格斗游戏;

/**
 * ClassName: RoleTest
 * Package: 专题综合练习.面向对象.案例01格斗游戏
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/708:45
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class RoleTest {
    public static void main(String[] args) {
        // 创建角色
        Role r1 = new Role("乔峰",120,"男");
        Role r2 = new Role("鸠摩罗",100,"男");
        // 展示角色信息
        r1.showRoleinfo();
        r2.showRoleinfo();
        //开始对战
        while (true){
            //r1攻击r2
            r1.attack(r2);
            //开始判断剩余血量
            if (r2.getBlood() == 0){
                System.out.println(r1.getName()+" 胜利了");
                break;
            }
            //r2攻击r1
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName()+" 胜利了" );
            }
        }
    }
}
