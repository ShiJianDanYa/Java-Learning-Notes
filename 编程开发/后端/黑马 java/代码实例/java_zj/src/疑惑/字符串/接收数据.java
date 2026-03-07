package 疑惑.字符串;

import java.util.Scanner;

public class 接收数据 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println("请输入一个字符：");
        String ch = sc.nextLine();
        System.out.println(ch);

        System.out.println();

    }
}
