package 课堂练习.ch02_分支结构.ch03多分支.ch02_多分支选择语句;
import java.util.Scanner;

/**
 * ClassName: ch02_case穿透_月份季节
 * Package: 课堂练习.ch02分支结构.ch03多分支.ch02多分支选择语句
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/22 - 16:32
 * @Version: v1.0
 *
 */
public class ch02_case穿透_月份季节 {
	public static void main(String[] args){
		/*根据用户输入的月份，输出季节
		春季：3~5月
		夏季：6~8月
		秋季：9~11月
		冬季：12月、1月、2月*/
		//1.获取用户输入的月份
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = sc.nextInt();

		//开始判断
		switch( month){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;

			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;

			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;

			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;

			default:
				System.out.println("没有匹配的");
		}
	}
}
