package ch01课堂代码.ch04_StringBuilder;

/**
 * ClassName: StringBuilder
 * Package: ch01课堂代码.ch04StringBuilder
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 09:41
 * @Version: v1.0
 *
 */
public class ch01_ConcatenateStrings {

	static void main(String[] args) {
		long start = System.currentTimeMillis();
			String s = "";
			for (int i = 0;i < 1000000;i++) {
				s = s + "abc";
			}
				System.out.println(s);
		long end = System.currentTimeMillis();
		System.out.println("耗时：" + (end - start));
	}
}
