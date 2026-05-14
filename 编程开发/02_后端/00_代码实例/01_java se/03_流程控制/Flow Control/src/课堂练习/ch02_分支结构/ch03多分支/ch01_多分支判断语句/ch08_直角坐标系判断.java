package 课堂练习.ch02_分支结构.ch03多分支.ch01_多分支判断语句;

//导包
import java.util.Scanner;

/**
 * ClassName: ch08直角坐标系判断
 * Package: 课堂练习.ch02分支结构.ch03多分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/21 - 20:59
 * @Version: v1.0
 *
 */
public class ch08_直角坐标系判断 {
	/*规则：
	输入变量X，y，判断点所在区域：
	情况1：原点(x=0且y=0)
	情况2：第1象限、第2象限、第3象限、第4象限
	情况3：在y轴上(x=0且y≠0)
	情况4：在x轴上（y=0且x≠0）
	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请分别输入X坐标，y坐标");
		double x =sc.nextDouble();
		double y =sc.nextDouble();
		//范围 大小 是 原点<x轴=y轴<其他象限
		//x轴的条件全是（x!= 0&&y=0）
		//但是原点已经排除 y=0的情况了 所以x轴的判断条件可以省略
		//y轴同理
		if(x==0 && y==0) System.out.println("原点");
		else if(x==0) System.out.println("在y轴上");
		else if(y==0) System.out.println("在x轴上");
		else if(x>0 && y>0)  System.out.println("第1象限");
		else if(x<0 && y>0) System.out.println("第2象限");
		else if(x<0 && y<0) System.out.println("第3象限");
		else if(x>0 && y<0) System.out.println("第4象限");

		//关闭输入
		sc.close();

	}
}
