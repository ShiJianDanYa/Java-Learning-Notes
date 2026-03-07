package 练习.流程.循环;

/**
 * ClassName: 流程_循环_偶数和16
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2916:36
 * @Version1.0
 */

/*
求1到100之间的偶数和

 */
public class 流程_循环_偶数和16 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=100;i++){
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1到100之间的偶数和"+sum);
    }
}
