package 练习.流程.循环;

        /**
        *ClassName: 流程_循环_累加15
        *Package: 练习
        *Description:
        *@Author 锏箪
        *@Create 2025/3/2915:53
        *@Version1.0
        */
    
    /*
*/
public class 流程_循环_累加15 {
    public static void main(String[] args){
        // 初始化变量sum，用于累加1到5之间的所有整数
        int sum = 0;
        // 使用for循环累加1到5之间的所有整数
        for(int i =1;i<=5;++i){
            sum += i;
        }
        // 输出累加结果
        System.out.println(sum);

        System.out.println("===============================");
        for( int i =5;i>=1;i--){
            System.out.println(i);
        }
        System.out.println("结束");
    }
}
