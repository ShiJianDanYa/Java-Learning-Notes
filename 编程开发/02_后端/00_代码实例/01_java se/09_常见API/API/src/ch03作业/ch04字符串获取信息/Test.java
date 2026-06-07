package ch03作业.ch04字符串获取信息;

/**
 * ClassName: Test
 * Package: ch03作业.ch04字符串获取信息
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/3 - 10:58
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*我们的身份证号码拥有一定的规则：
		1、2位：省份
		3、4位：城市
		5、6位：区县
		7-14位：出生年、月、日
		15、16位：所在地派出所
		17位：性别（奇数男性，偶数女性）
		18位：个人信息码（随机产生）

		要求：
		假设有身份证：321104200801121234，获取人物的出生年月日和性别进行输出。

		输出结果：
		出生年月日：2008年01月12日性别为：男*/
		//创建字符串
		String idCard = "321104200801121234";
		//输出语句
		System.out.println("出生年月日："+idCard.substring(6,10)+"年"
			+idCard.substring(10,12)+"月"
			+idCard.substring(12,14)+"日性别为："+(((idCard.charAt(16)-'0')%2 == 0)?"女":"男"));





	}
}