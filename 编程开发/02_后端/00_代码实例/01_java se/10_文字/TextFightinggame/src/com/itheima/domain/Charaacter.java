package com.itheima.domain;

/**
 * ClassName: Charaacter
 * Package: com.itheima.domain
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/8 - 14:38
 * @Version: v1.0
 *
 */
public class Charaacter {
	public String name;
	public int HP;
	public int maxHP;
	public int attack;
	public int defense;

	//构造方法
	public Charaacter() {
	}

	//刚创建人物的时候，血量是满的
	public Charaacter(String name, int HP, int attack, int defense) {
		this.name = name;
		this.HP = HP;
		this.maxHP = HP;
		this.attack = attack;
		this.defense = defense;
	}

	//判断是否存活
	public boolean isAlive() {
		return HP > 0;
	}

	//恢复血量
	//作用：恢复血量
	//形参：具体回多少血
	public void heal(int amount){
		HP += amount;
		//不能超过最大值
		if(HP > maxHP){
			HP = maxHP;
		}

	}
	//受到伤害
	//作用：受到了N点伤害之后，还有多少点血
	//形参：具体受到了多少点伤害
	public void takeDamage(int amount){
		HP -= amount;
		//不能小于0
		if(HP < 0){
			HP = 0;
		}
	}

	//展示人物属性
	public String show(){
		return "名称：" + name + "\n" +
				"当前血量：" + HP + "\n" +
				"攻击力：" + attack + "\n" +
				"防御力：" + defense;
	}







}
