package 课堂代码.ch02_分支结构.ch01_单分支;

/**
 * ClassName: 注意事项
 * Package: 课堂代码.ch02分支结构.ch01单分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/20 - 20:01
 * @Version: v1.0
 *
 */
public class ch02_注意事项 {
	static void main(String[] args) {
		//if 注意事项
		//1.大括号的开头可以另起一行书写，但是建议写在第一行的末尾
		//2.小括号后面不能有分号，这样会拆开if的语句结构
		//3.在语句体中，如果只有一句代码，大括号可以省略不写。个人建议，大括号还是不要省略
		//4.如果对一个布尔类型的变量进行判断，不要用==号

		//大括号的开头可以另起一行书写，但是建议写在第一行的末尾
		if(true)
		{
			System.out.println("hello world");
		}
		//小括号后面不能有分号，这样会拆开if的语句结构
		if(false);{
			System.out.println("hello world");
		}
		//在语句体中，如果只有一句代码，大括号可以省略不写。个人建议，大括号还是不要省略
		if(true)
			System.out.println("hello world");

		//如果对一个布尔类型的变量进行判断，不要用==号
		boolean b = true;
		if(b){
			System.out.println("hello world");
		}


	}
}
