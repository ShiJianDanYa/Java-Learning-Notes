package ch01课堂代码.ch01继承.ch07子类从父类继承内容.ch02内存分析;

import org.openjdk.jol.vm.VM;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: 内存分析
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 16:08
 * @Version: v1.0
 *
 */
public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        //利用第三方工具，获取对象真实的内存地址       24348 Test
        System.out.println("对象Z在内存中的真实地址是："+Long.toHexString(VM.current().addressOf(z)));
        //键盘录入目的为程序不停止
        Scanner sc = new Scanner(System.in);
        sc.next();

    }
}
    class Fu{
        private int a = 0x111;
        int b = 0x222;
        static int staticFu = 0x333;
    }
    class Zi extends Fu{
        private int c = 0x444;
        int b = 0x555;
        static int staticZi = 0x666;
    }

