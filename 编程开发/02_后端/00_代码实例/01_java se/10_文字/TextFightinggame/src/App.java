import com.itheima.ui.FightingGame;
import com.itheima.ui.Login;

/**
 * ClassName: App
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/5 - 10:52
 * @Version: v1.0
 *
 */
public class App {
	static void main(String[] args) {
		//启动类
		//这个类只负责启动整个程序，里面不写任何的业务逻辑
		//启动登录注册的页面
		Login lg = new Login();
		lg.start();


	}
}
