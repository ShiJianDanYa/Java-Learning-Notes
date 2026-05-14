package 课堂代码.ch02_分支结构.ch03_多分支.ch02_多分支选择语句;

/**
 * ClassName: ch04_switch新特性
 * Package: 课堂代码.ch02分支结构.ch03多分支.ch02多分支选择语句
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/23 - 13:38
 * @Version: v1.0
 *
 */
public class ch04_switch新特性 {
	public static void main(String[] args){
		/*
		3.switch新特性：JDK12预览版 jDK14正式版
		一、箭头标签
		二、case后面可以写多个值
		三、switch可以有运行结果
		四、yield关键字
		*/

		int number = 5;
		switch(number){
			case 1,2,3,4,5 -> System.out.println("工作时间");
			default -> System.out.println("休息时间");
		}
		//如果下面使用,我要继续使用switch的结果,就无法操作

		//定义变量接受数据
		number = 6;
		/*
		String result = switch(number){
			case 1,2,3,4,5 -> {
				yield "工作时间";
			}
			default -> {
				yield "休息时间";
			}
		};*/
		//超级简化启动
		String result = switch(number){
			case 1,2,3,4,5 -> "工作时间";
			default -> "休息时间";
			//大括号后面还需要补一个分号
		};
		//输出结果
		System.out.println(result);

	}
}
