package 课堂代码.ch03_循环结构.ch03_do_while循环;

/**
 * ClassName: ch01_do_while
 * Package: 课堂代码.ch03_循环结构.ch03_do_while循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/25 - 14:58
 * @Version: v1.0
 *
 */
public class ch01_do_while {
	public static void main(String[] args){
		/*
		利用do...while循环，输出5行"helloworld"
		注：do...while循环，熟悉语法即可，无需额外练习

		特点：先执行后判断，循环体至少执行一次

		for,while的特点：先判断后执行
		*/

		int i=1;
		do{
			System.out.println("helloworld");
			i++;
		}while(i<=5);
		}
	}
