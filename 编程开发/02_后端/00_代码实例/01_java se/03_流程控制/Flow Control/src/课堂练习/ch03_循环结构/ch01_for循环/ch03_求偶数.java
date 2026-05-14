package 课堂练习.ch03_循环结构.ch01_for循环;

/**
 * ClassName: ch04_求偶数
 * Package: 课堂练习.ch03_循环结构.ch01_for循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/23 - 20:17
 * @Version: v1.0
 *
 */
public class ch03_求偶数 {
	public static void main(String[] args){
		/*求1-100之间的偶数和*/
		//定义变量保存结果
		int sum = 0;
		/*for(int i = 1;i <= 100;i++){
			//判断是否为偶数
			if(i%2 == 0){
				sum+=i;
			}
		}*/
		//累加求和法
		for(int i = 2;i <= 100;i+=2){
			sum+=i;
		}

		//输出结果
		System.out.println("求1-100之间的偶数和为"+sum);
	}
}
