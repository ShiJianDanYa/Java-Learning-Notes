package ch01课堂代码.ch06接口新特性.ch03私有方法;

/**
 * ClassName: Inter
 * Package: ch01课堂代码.ch06接口新特性.ch03私有方法
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 15:30
 * @Version: v1.0
 *
 */
public interface Inter {
	public static  void login(){
		check();
		System.out.println("执行登录逻辑");
	}

	public static  void register(){
		check();
		System.out.println("执行注册逻辑");
	}

	//jdk9：新增了私有的方法
	//普通的私有方法: private 返回值类型 方法名(形参){方法体}
	//静态的私有方法：private static 返回值类型 方法名(形参){方法体}
	private static void check(){
		System.out.println("检查网络");
		System.out.println("检查用户名和密码格式");
		System.out.println("检查用户名是否存在");
	}
}
