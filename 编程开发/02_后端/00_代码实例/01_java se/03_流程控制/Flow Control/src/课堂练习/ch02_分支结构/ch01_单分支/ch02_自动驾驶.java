package 课堂练习.ch02_分支结构.ch01_单分支;

/**
 * ClassName: ch02自动驾驶
 * Package: 课堂练习.ch02分支结构.ch01单分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/20 - 20:28
 * @Version: v1.0
 *
 */
public class ch02_自动驾驶 {
	static void main(String[] args) {
		//汽车无人驾驶会涉及到大量的判断
		//当汽车行驶的时候遇到了红绿灯，就会进行判断
		//如果红灯亮，就停止
		//如果黄灯亮，就减速//如果绿灯亮，就行驶

		//1.定义三个变量表示灯的状态
		// true亮 false灭
		//红灯
		boolean red = false;
		//黄灯
		boolean yellow = false;
		//绿灯
		boolean green = true;

		//2.判断
		//红灯亮，就停止
		//黄灯亮，就减速
		//绿灯亮，就行驶

		if(red)System.out.println("停止");
		if(yellow)System.out.println("减速");
		if(green)System.out.println("行驶");
	}
}
