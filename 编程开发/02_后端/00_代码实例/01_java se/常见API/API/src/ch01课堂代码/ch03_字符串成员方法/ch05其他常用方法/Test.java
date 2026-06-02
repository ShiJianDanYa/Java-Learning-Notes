package ch01课堂代码.ch03_字符串成员方法.ch05其他常用方法;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch03字符串成员方法.ch05其他常用方法
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 08:32
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*
		String类当中常见的方法:
		比较                   equals equalsIgnoreCase
		长度                   length
		获取单个字符            charAt
		截取                   substring
		替换                   replace

		不需要背诵
		了解即可

		是否包含               contains
		判断开头、结尾          startsWith/endswith
		查找                   indexOf(int ch)     lastIndexOf(int ch)
		判断是否为空            isEmpty()
		转字符数组              toCharArray()
		大小写转换              toUpperCase()、toLowerCase()
		去除头尾空格            trim()
		*/
		//创建字符串
		String str = "hello world";
		//是否包含      contains
		//contains---敏感词过滤  tmd
		//替换之前判断是否存在 存在才替换
		System.out.println(str.contains("llo"));
		System.out.println(str.startsWith("nihc"));

		//判断开头、结尾          startsWith/endswith
		//判断文件的后缀名
		//比如判断是否为文本文件  str.endswith(".txt");
		//判断str是否以hello作为开头
		System.out.println(str.startsWith("hello"));
		//判断str是否以你好作为开头
		System.out.println(str.startsWith("你好"));
		//判断str是否以d作为结尾
		System.out.println(str.endsWith("d"));
		//判断str是否以世界作为结尾
		System.out.println(str.endsWith("世界"));
		//判断str从0索引开始，是否以hello开头
		System.out.println(str.startsWith("hello",0));
		//判断str从1索引开始，是否以hello开头
		System.out.println(str.startsWith("hello",1));


		//查找      indexOf(int ch)     lastIndexOf(int ch)
		//如果当前要查找的内容不存在，方法会返回-1
		//查找当前字符/字符串 第一次出现的索引
		str = "abcdefga";
		System.out.println(str.indexOf(97));
		//查找当前字符/字符串 最后一次出现的索引
		System.out.println(str.lastIndexOf(97));
		System.out.println(str.lastIndexOf('王'));

		//判断是否为空            isEmpty()
		//登录注册 判断用户是否输入
		System.out.println(str.isEmpty());
		str = "";
		System.out.println(str.isEmpty());

		//转字符数组       toCharArray()
		//"abcdaefg"---->['a','b','c','d','a','e','f',g]
		//"abc"-->0索引改为A 先变为字符数组.a变为A,在转为字符串
		str = "你好啊,世界";
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}

		//大小写转换        toUpperCase()、toLowerCase()
		//去除头尾空格      trim()
		//登录注册 用户开头误输入空格
		str = "   hello world   ";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());

	}
}
