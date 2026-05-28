package ch01课堂代码.ch03多态.ch01注册;

/**
 * ClassName: StudentManger
 * Package: ch01课堂代码.ch03多态.ch01注册
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 10:24
 * @Version: v1.0
 *
 */
public class StudentManger {
	//行为注册
	public void register(Person person){
		//注意 person 是参数列表 中Person类对象的名字通过他调用方法,不是直接通过类名调用
		//参数Person：此时可以传递Person本身的对象，同时也可以传递Person所有的子类对象
		System.out.println("姓名为"+ person.getName()+"的账户注册成功,账号"+person.getAccount()+",密码"+person.getPassword());
	    //传递不同的对象，调用不同类里面的work方法
		person.work();
	}
}
