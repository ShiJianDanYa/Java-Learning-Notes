import java.util.Random;

/**
 * ClassName: 随机数
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/10 - 17:52
 * @Version: v1.0
 *
 */
public class 随机数 {
    static void main(String[] args) {
        //需求：
        //随机数范围：1~100

        //创建对象
        /*Random r = new Random();
        //生成随机数
        int number = r.nextInt(101);// 0 ~ 100
        System.out.println(number);*/


        //秘诀
        //用来生成任意数到任意数之间的随机数7~15
        //1.让这个范围头尾都减去一个值，让这个范围从0开始     -7   0~8
        //2.尾巴+1    8+1= 9
        //3.最终的结果，再加上第一步减去的值。

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(9) + 7;// 7 ~ 15
            System.out.println(number);
        }
    }
}
