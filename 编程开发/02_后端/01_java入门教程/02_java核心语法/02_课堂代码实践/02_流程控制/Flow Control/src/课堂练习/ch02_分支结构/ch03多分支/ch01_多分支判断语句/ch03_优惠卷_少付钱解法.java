package 课堂练习.ch02_分支结构.ch03多分支.ch01_多分支判断语句;

import java.util.Scanner;

/**
 * ClassName: ch03优惠卷_少付钱解法
 * Package: 课堂练习.ch02分支结构.ch03多分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/21 - 16:56
 * @Version: v1.0
 *
 */
public class ch03_优惠卷_少付钱解法 {
	/*
	需求：很多App都有不同的优惠券假设，现在有以下优惠券
	全场商品满10减8
	全场商品满50减30
	全场商品满100减50
	全场商品满200减90

	会员卡：全场8折
	请问：会员卡和优惠券不能同时使用，最优惠的价格是多少？
	*/
	public static void main(String[] args){
		//输入商品总价格
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入商品总价");
		int price = sc.nextInt();
		//开始分别计算少付的价格
		//计算会员卡少付的价格
		double membershipCard = price*0.2;
		//定义优惠券少付的价格变量
		double couPon = 0;
		//计算优惠券少付的价格
		if(price>0){
			if(price>=200)couPon=90;
			else if(price>=100)couPon=50;
			else if(price>=50)couPon=30;
			else if(price>=10)couPon=8;
			else couPon=0;
		}
		System.out.println("会员卡少付的价格："+membershipCard);
		System.out.println("优惠券少付的价格："+couPon);
		if (membershipCard > couPon) System.out.println("会员卡优惠后价格更优惠");
		else if(couPon>membershipCard) System.out.println("优惠券优惠后价格更优惠");
		else System.out.println("会员卡和优惠券优惠后价格一样");

	}
}
