package ch03作业.ch06验证码生成;

import java.util.Random;

/**
 * ClassName: Test
 * Package: ch03作业.ch06验证码生成
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/3 - 12:32
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*
		验证码的内容：可以是小写字母，也可以是大写字母，还可以是数字验证码的规则：
		长度为5
		内容中是四位字母，1位数字。
		其中数字只有1位，但是可以出现在任意的位置。举例：
		正确的验证码：We1fg
		6gKoq tqB2p
		错误的验证码：iuybs（没有数字）
		j1s2u（两个数字）
		*/

		//先创建 随机字母数组
		char[] chs = new char[52];
		//随机对象
		Random r = new Random();
		//循环赋值
		for(int i = 0;i < chs.length/2;i++){
			chs[i] = (char)('A'+i);
			chs[i+26] = (char)('a'+i);
		}
		//前四位为随机字母
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i < 4;i++){
			sb.append(chs[r.nextInt(chs.length)]);
		}
		//最后一位为随机数字
		//位置是0到4随机插入
		sb.insert(r.nextInt(5),r.nextInt(10));
		//转为字符串
		String str = sb.toString();
		System.out.println(str);


	}
}
