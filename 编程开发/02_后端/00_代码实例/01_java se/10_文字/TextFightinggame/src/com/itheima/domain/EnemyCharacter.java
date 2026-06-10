package com.itheima.domain;

/**
 * ClassName: EnemyCharacter
 * Package: com.itheima.domain
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/8 - 14:49
 * @Version: v1.0
 *
 */
//表示敌人游戏人物角色
public class EnemyCharacter extends Charaacter {
	//技能只有一个
	public String skill;
	//当前游戏人物是否拥有减少伤害的状态
	public boolean defending;
	//构造方法

	public EnemyCharacter() {
		super();
	}

	public EnemyCharacter(String name, int HP, int attack, int defense, String skill) {
		super(name, HP, attack, defense);
		this.skill = skill;
	}

	//重写父类方法
	@Override
	public void takeDamage(int damage) {
		if(defending) {
			//如果正在防御，那么只能受到1/2的伤害
			//true：处于防御状态
			//false：不处于防御状态
			damage = damage/ 2 > 1 ? damage/ 2 :1;
			//表示防御状态只能持续一个回合
			defending = false;
		}
		//调用父类的方法，扣除血量
		super.takeDamage(damage);
	}
}
