package 课堂代码.ch03_循环结构.ch02_while循环;

/**
 * ClassName: ch02_for和while的区别
 * Package: 课堂代码.ch03_循环结构.ch02_while循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/24 - 22:41
 * @Version: v1.0
 *
 */
public class ch02_for和while的区别 {
	public static void main(String[] args){
		//for循环10次跳跃---明确了循环的次数---范围1~10--for
		//for循环的格式,开始条件1，结束条件10,一眼就可以看到
		for(int i=1;i<=10;i++){
			System.out.println("跳跃第"+i+"次");
		}

		//while循环10次跳跃---不明确循环的次数---范围1~10--while
		int i=1;
		//此时循环的次数是不确定的,但是🔚条件一眼就能看到是<=10
		while(i<=10){
			System.out.println("跳跃第"+i+"次");
			i++;
		}
	}
}
