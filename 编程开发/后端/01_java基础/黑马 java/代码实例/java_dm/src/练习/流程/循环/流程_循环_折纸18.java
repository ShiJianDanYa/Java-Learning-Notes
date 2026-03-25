package 练习.流程.循环;

/**
 * ClassName: 流程_循环_折纸18
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2918:12
 * @Version1.0
 */

/*
    珠穆朗玛峰高度为884443000毫米
    纸张厚度为0.1毫米
    请问，折叠多少次可以折成珠穆朗玛峰的高度
 */
public class 流程_循环_折纸18 {
    public static void main(String[] args) {
        int i = 1,sum=88444300,c=0;
        //我们不知道循环次数，所以使用while循环
        while(i<=sum){
            i*=2;
            c++;
        }
        System.out.println("一共需要"+c+"次");

        System.out.println("程序结束");
    }
}
