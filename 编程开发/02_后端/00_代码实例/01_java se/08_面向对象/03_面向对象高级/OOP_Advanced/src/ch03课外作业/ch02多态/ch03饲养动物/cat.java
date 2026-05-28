package ch03课外作业.ch02多态.ch03饲养动物;

/**
 * ClassName: cat
 * Package: ch03课外作业.ch02多态.ch03饲养动物
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 15:56
 * @Version: v1.0
 *
 */
public class cat extends animal {
	/*属性：年龄，颜色
	行为：eat(Stringsomething)方法(something表示吃的东西）
	逮老鼠catchMouse方法(无参数)*/
	//构造方法
	public cat() {}

	public cat(int age, String color) {
		super(age, color);
	}
	//重写方法
	@Override
	public void eat(String something){
		System.out.println("猫吃" + something);
	}
	//行为
	public void catchMouse(){
		System.out.println("猫逮老鼠");
	}
}
