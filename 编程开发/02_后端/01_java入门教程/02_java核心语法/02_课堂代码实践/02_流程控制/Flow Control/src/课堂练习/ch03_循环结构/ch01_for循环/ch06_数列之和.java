package 课堂练习.ch03_循环结构.ch01_for循环;
//导包
import java.util.Scanner;
/**
 * ClassName: ch07_数列之和
 * Package: 课堂练习.ch03_循环结构.ch01_for循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/24 - 17:38
 * @Version: v1.0
 *
 */
public class ch06_数列之和 {
	public static void main(String[] args){
		/*
		描述
		小诗诗开始学习数列啦。现在他想计算以下数列前n项的和：
		S(n) =1-2+3-4+.....
		示例1：
		输入：4
		说明：S(4)=1-2+3-4=-2
		输出：-2
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出第n项的数字");
		int n = sc.nextInt();
		//创建变量保存和
		int sum = 0;

		for(int i=1;i<=n;i++){
			if(i%2==0){
				sum-=i;
			}else {
				sum+=i;
			}
		}
		System.out.println("数列前"+n+"项的和为"+sum);
	}
}
