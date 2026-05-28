package ch03课外作业.ch02多态.ch03饲养动物;

/**
 * ClassName: dog
 * Package: ch03课外作业.ch02多态.ch03饲养动物
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 15:53
 * @Version: v1.0
 *
 */
public class dog extends  animal{
	/*属性：年龄，颜色
	行为：eat(String something)(something表示吃的东西)
	看家lookHome法(参数)*/
	//构造方法
	public dog() {}

	public dog(int age, String color) {
		super(age, color);
	}
	//重写方法
	@Override
	public void eat(String something){
		System.out.println("狗吃"+something);
	}
	//行为
	public void lookHome(){
		System.out.println("狗看家");
	}
}
