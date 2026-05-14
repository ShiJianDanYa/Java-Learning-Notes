package 课堂练习.ch02_分支结构.ch03多分支.ch01_多分支判断语句;

import java.util.Scanner;

/**
 * ClassName: ch04_充卡赠送
 * Package: 课堂练习.ch02分支结构.ch03多分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/21 - 17:26
 * @Version: v1.0
 *
 */
public class ch04_充卡赠送 {

	/*储值卡 冲卡规则
	1000元赠送200元
	2000元赠送500元
	3000元赠送700元
	5000元赠送1300元
	10000元赠送2500元
	20000元赠送6000元
	50000元赠送15000元

	请计算充值不同的额度，卡里余额是多少？*/
	public static void main(String[] args){
		//定义价格
		int price = 0;
		//用户输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入充值金额");
		price = sc.nextInt();
		if(price>0){
			if(price>=50000) price+=15000;
			else if(price>=20000) price+=6000;
			else if(price>=10000) price+=2500;
			else if(price>=5000) price+=1300;
			else if(price>=3000) price+=700;
			else if(price>=2000) price+=500;
			else if(price>=1000) price+=200;
			//else price+=0;
			System.out.println("充值后余额为："+price);
		}else{
			System.out.println("输入金额有误");
		}
		//错误一
		// System.out.println("充值后余额为："+price);
	}
}
