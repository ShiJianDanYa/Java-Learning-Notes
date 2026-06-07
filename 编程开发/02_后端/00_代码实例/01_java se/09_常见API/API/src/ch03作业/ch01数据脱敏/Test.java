package ch03作业.ch01数据脱敏;

/**
 * ClassName: Test
 * Package: ch03作业.ch01数据脱敏
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 20:21
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*把任意手机号中间四位变成****
		  保留邮箱名第一个字母，保留@后面的内容

		13112345678             131****5678
		zw1234@163.com          z***@163.com
		*/
		//创建手机号
		String phone = "13112345678";
		//邮箱
		String email = "zw1234@163.com";
		//处理手机号
		//手机长度
		int length = phone.length();
		int start = (length-4)/2;
		//开始截取替换
		phone = phone.substring(0,start) + "****" + phone.substring(start+4);
		System.out.println(phone);
		//处理邮箱
		//定义变量存储截取从1开始的结束位置
		int end = 0;
		//循环遍历直到=='@'
		for (int i = 1; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				end = i;
				break;
			}
		}
		//截取 从1开始 截取到end
		email = email.substring(0,1) + "***" + email.substring(end);
		//输出
		System.out.println(email);


	}
}
