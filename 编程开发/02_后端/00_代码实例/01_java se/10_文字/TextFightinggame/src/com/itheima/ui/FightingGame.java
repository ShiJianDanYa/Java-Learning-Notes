package com.itheima.ui;

import com.itheima.domain.EnemyCharacter;
import com.itheima.domain.HeroCharacter;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: Fig
 * Package: com.itheima.ui
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/8 - 15:50
 * @Version: v1.0
 *
 */
public class FightingGame {
	//启动游戏
	public void gameStart(String username){
		//显示游戏的标题
		System.out.println("╔═════════════════════════════╗");
		System.out.println("    🎮"+username+" 欢迎来到文字格斗游戏 🎮   ");
		System.out.println("╚═════════════════════════════╝");

		//创建玩家角色(名字+属性分配)
		HeroCharacter player = createPlayerCharacter(username);
		//显示创建角色的信息和技能列表
		System.out.println("角色创建成功！");
		System.out.println("\uD83C\uDF1F 初始属性:"+player.show());
		System.out.println("\uD83C\uDF1F 拥有技能:"+player.showSkill());

		//创建敌人角色
		//name     hp   atk    def   ski1l
		//初级战士   80   15   10   猛击
		//敏捷刺客   60   20   5    快速攻击
		//重装坦克   120  10   20   防御姿态
		//神秘法师   70   25   8    火球术（180%伤害）
		ArrayList<EnemyCharacter> enemyList = new ArrayList<EnemyCharacter>();
		enemyList.add(new EnemyCharacter("初级战士",80,15,10,"猛击"));
		enemyList.add(new EnemyCharacter("敏捷刺客",60,20,5,"快速攻击"));
		enemyList.add(new EnemyCharacter("重装坦克",120,10,20,"防御姿态"));
		enemyList.add(new EnemyCharacter("神秘法师",70,25,8,"火球术"));

		//准备战斗（依次跟多个敌人战斗）
		//定义变量
		int count = 1; //记录战斗场数
		int wins = 0;  //统计战斗胜利的场数
		//游戏当中，我是依次跟多个敌人进行战斗，直到我方的生命值为0，游戏才会结束
		while(player.isAlive()){
			//进入循环开始准备战斗

			//重置敌人的属性，敌人属性每场HP+10，ATK+3，DEF+2（敌人：越来越打）（第二场的时候开始增加）
			//wins 统计战斗胜利的场数 不等于 1就是 已经胜利了一场
			if(wins !=0){
				//获取到每一个敌人的信息，进行属性点的增加
				for (int i = 0; i < enemyList.size(); i++) {
					EnemyCharacter c = enemyList.get(i);
					// 每场生命值+10
					// 并且重置生命值
					c.maxHP += 10;
					c.HP = c.maxHP;
					// 每场攻击力+3
					c.attack += 3;
					// 每场防御力+2
					c.defense += 2;
					//清空减伤buffer
					c.defending = false;
				}
			}
			//随机选择敌人(Random)
			Random r = new Random();
			int index = r.nextInt(enemyList.size());
			EnemyCharacter enemy = enemyList.get(index);
			System.out.println(enemy.show());
			//开始战斗
			System.out.println("═══════════════════════════════════════");
			System.out.println("⚔\uFE0F 第 "+count+" 场战斗开始！对手: "+enemy.name);
			//定义变量 记录和当前敌人回合数
			int round = 1;
			while (player.isAlive()){
				//显示双方的状态(生命值)
				System.out.println("---------------------------------------");
				System.out.println("⚔\uFE0F 第 "+round+" 回合开始！");
				//打印敌我 双方的血条
				System.out.println(getHealthBar(player.name, player.HP, player.maxHP));
				System.out.println(getHealthBar(enemy.name, enemy.HP, enemy.maxHP));
				//玩家回合：
				//选择行动（1 普通攻击／2强力一击／3生命汲取）
				playerTurn(player,enemy);
				//判断敌人血量是否为0
				if(!enemy.isAlive()){
					//🎉 你击败了 敏捷刺客！
					System.out.println("🎉 你击败了 "+enemy.name+"！");
					//我方胜利了，连胜的计数器自增一次
					wins++;
					//显示战斗胜利
					System.out.println("恭喜你，战斗胜利！");
					//结束循环，下方的代码就不需要再运行了
					break;
				}

				//政人回合：选择行动（50%几率普通攻击／ 50%的几率技能攻击/ 不同的敌人采取不同的技能进行攻击）
				enemyTurn(enemy,player);
				//判断玩家是否被击败（判断玩家的血量是否为0）
				if(!player.isAlive()){
					System.out.println("💀 你被"+enemy.name+"击败了...");
					//战斗停止
					break;
				}
				//如果玩家没有被击败，回合数+1，继续下一个回合
				round++;
			}

			//和单个敌人战斗结束
			//玩家胜利（继续战斗）
			//玩家失败 （游戏停止）
			if(player.isAlive()){
				//恢复玩家血量
				//计算恢复血量数值
				int hea1HP = r.nextInt(20, 41);
				//开始恢复血量
				player.heal(hea1HP);
				//提示
				System.out.println("💗 战斗结束!你恢复了"+hea1HP+"点生命值");
				System.out.println("当前胜场:"+wins);
				System.out.println("═══════════════════════════════════════");

				//每胜利三场，人物的属性就需要增加
				if(player.isAlive() && wins % 3 == 0 && wins > 0){
					//获取到当前角色的信息，进行属性点的增加
					System.out.println("🎉 恭喜你，获得属性提升！");
					//提升最大生命
					player.maxHP += 30;
					//提升攻击力
					player.attack += 5;
					//提升防御力
					player.defense += 3;
					//提示
					System.out.println("角色属性提升成功！");
					System.out.println("最大生命值+30 + 攻击力+5，防御力+3");
					System.out.println("\uD83C\uDF1F 最大生命值:"+player.maxHP);
					System.out.println("\uD83C\uDF1F 攻击力:"+player.attack);
					System.out.println("\uD83C\uDF1F 防御力:"+player.defense);
				}
				//询问玩家是否继续
				if(player.isAlive()){
					System.out.println("是否继续战斗？(Y/N)");
					Scanner sc = new Scanner(System.in);
					String choose = sc.next();
					if("Y".equalsIgnoreCase(choose)){
						//战斗继续
						count++;
						//继续战斗
						continue;
					}else if("N".equalsIgnoreCase(choose)){
						System.out.println("战斗结束，游戏结束！");
						break;
					}else {
						System.out.println("无效的选择，默认游戏继续！");
						continue;
					}
				}


			}
		}

		//游戏的都最终结算
		System.out.println("═══════════════════════════════════════");
		System.out.println("战斗结束，游戏结束！");
		System.out.println("战斗胜利的场数:"+wins);
		System.out.println("🙏游玩本游戏");
		//停止虚拟机运行
		System.exit(0);
	}

	//定义一个方法 显示血条
	//zhangsan: [████████████████████] 100/100 HP
	//初级战士: [████████████████████] 80/80 HP
	public String getHealthBar(String name,int HP,int maxHP){
		//满血状态下,打印20个方块
		int barLength = 20;
		//计算在不同的血量当中，一共打印多少个方块
		// 最大血量：200
		//当前血量：100
		//为什么要 * 1.0 ➗中纯整数运算结果也一定为整数
		int filled = (int) ((HP *1.0 / maxHP) * barLength);
		//字符拼接
		StringBuffer sb = new StringBuffer();
		// append 方法的返回值 是调用者
		sb.append(name).append(":[");
		//利用循环不断拼接方块 空格
		for (int i = 0; i < 20; i++) {
			if(i<filled){
				sb.append("█");
			}else {
				sb.append(" ");
			}
		}
		// ] 100/100 HP
		sb.append(" ").append(HP).append("/").append(maxHP).append("H");
		return sb.toString();
	}


	//作用:创建玩家角色
	//参数:用户名
	//返回值（结果）：创建好的玩家角色
	public HeroCharacter createPlayerCharacter(String username){
		System.out.println("创建你的角色");
		System.out.println("你的角色名称为:"+ username);
		//属性分配
		int points = 20;
		//生命值分配

		//提示:
		System.out.println("请分配你的属性点(共20点):");
		System.out.println("1.生命值（每点+10HP）");
		System.out.println("2.攻力力（每点+2ATK）");
		System.out.println("3.防御力（每点+1DEF）");
		//输入
		Scanner sc = new Scanner(System.in);
		//定义数组存储提示语句
		String[] attributes = {"生命值","攻击力","防御力"};
		//定义数组记录三个属性分配的属性点
		int[] values = new int[3];
		//利用循环分配属性点
		for (int i = 0; i < attributes.length; i++) {
			System.out.println("分配点数到"+attributes[i]+"(剩点数："+points+"):");
			//input表示当前用户⌨️录入的数据(要分配的属性点)
			int input = sc.nextInt();
			//判断数据合法性
			//数据必须大于0
			if(input<0){
				System.out.println("无效输入！默认分配0点");
				input = 0;
			}
			//分配点数超出剩余点数
			if(input>points){
				System.out.println("分配点数超出剩余点数！默认分配"+points+"点");
				input = points;
			}
			//计算剩余点数
			points -= input;
			//存储属性点
			values[i] = input;
		}
		//用户分配属性点存储在values数组中

		//创建玩家角色
		HeroCharacter player = new HeroCharacter(
			username,  //角色名字
			100+values[0]*10, //角色生命值
			10+values[1]*2,   //角色攻击力
			0+values[2]     //角色防御力
			);
		//添加玩家技能
		player.skillList.add("普通攻击");
		player.skillList.add("强力一击");
		player.skillList.add("生命汲取");
		//返回玩家对象
		return player;
	}

	//玩家回合
	public void playerTurn(HeroCharacter player,EnemyCharacter enemy) {
		System.out.println("===== 你的回合 =====");
		System.out.println("1. 普通攻击");
		System.out.println("2. 强力一击 (消耗10HP)");
		System.out.println("3. 生命汲取 (消耗10HP，恢复生命)");
		System.out.println("选择行动 (1-3): ");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		switch (choice) {
			//case 穿透 其他选择默认普通攻击
			default:
				System.out.println("没有这个操作，默认使用普通攻击");
			case "1":
				//我方的攻击力－对方的防御力= 伤害
				int damage1 = calculateDamage(player.attack,enemy.defense);
				//⚔️你对 敏捷刺客 使用了普通攻击，造成 31 点伤害！
				System.out.println("⚔\uFE0F你对 "+enemy.name+"使用了普通攻击，造成"+damage1+"点伤害！");
				//扣血操作
				enemy.takeDamage(damage1);
				break;
			case "2":
				//先判断当前生命值是否可以发动强力一击
				// 强力一击发动代价  生命值 - 10;
				if(player.HP >= 10){
					//扣血
					player.takeDamage(10);
					//计算我方技能技能的伤害
					int damage2 = calculateDamage((int)(player.attack*1.8),enemy.defense);
					//💥 消耗10HP，你对 敏捷刺客 使用了强力一击，造成 31 点伤害！
					System.out.println("💥消耗10HP，你对 "+enemy.name+"使用了强力一击，造成"+damage2+"点伤害！");
					//给敌人扣血
					enemy.takeDamage(damage2);
				}else{
					System.out.println("体力不足,攻击失败");
				}
				break;
			case "3":
				//条件判断,是否可以发动
				if(player.HP >= 10){
					//消耗我方10HP
					player.takeDamage(10);
					//恢复随机HP
					Random random = new Random();
					int healHP = random.nextInt(30)+1;
					//恢复我方随机HP
					player.heal(healHP);
					//💚 消耗10HP,你使用了生命恢复,恢复了10点血
					System.out.println("\uD83D\uDC9A 消耗10HP,你使用了生命恢复,恢复了"+healHP+"点血");
				}else{
					System.out.println("体力不足,技能失败");
				}
				break;
			}
		}

		//伤害计算
		// 作用：用来计算双方战斗的时候，造成的伤害
	public int calculateDamage(int attack,int defense){
		//普通攻击的调用方式 攻击力 - 防御力 = 造成的伤害
		//技能攻击的调用方式 攻击力 * 技能倍率 - 防御力 = 造成的伤害
		int damage = attack - defense;
		if(damage <1){
			damage = 1;
		}
		return  damage;
	}

	//敌人回合
	private void enemyTurn(EnemyCharacter enemy, HeroCharacter player){
		System.out.println("===== "+enemy.name+" 的回合 =====");
		//计算当前是普通攻击50%
		// 还是技能攻击50%    --- 猛击    快速攻击    防御姿态    火球术
		//表示敌人要采取的攻击手段
		String action = "普通攻击";
		//进行几率计算
		Random random = new Random();
		int chance = (random.nextInt(2))+1;
		//if判断  1是技能 2是普通攻击
		if(chance == 1){
			action = enemy.skill;
		}
		//根据不同情况,采取不同的攻击手段
		switch (action){
			case "普通攻击"->{
				//计算敌人普通攻击的伤害
				int damage1 = calculateDamage(enemy.attack, player.defense);
				//⚔️ 敏捷刺客 对你使用了普通攻击，造成 15 点伤害！
				System.out.println("⚔\uFE0F"+enemy.name+" 对你使用了普通攻击，造成"+damage1+"点伤害！");
				//我方扣血
				player.takeDamage(damage1);
			}
			case "猛击"->{
				//计算敌人猛击的伤害
				int damage2 = calculateDamage((int)(enemy.attack*1.5), player.defense);
				//💥  战士 对你使用了猛击，造成 23 点伤害！
				System.out.println("\uD83D\uDCA5 "+enemy.name+" 对你使用了猛击，造成"+damage2+"点伤害！");
				//我方扣血
				player.takeDamage(damage2);
			}
			case "快速攻击"->{
				int damage3 = 0;
				for (int i = 0; i < 2; i++) {
					int temp = calculateDamage((int)(enemy.attack*0.5), player.defense);
					damage3 += temp;
				}
				// ⚡ 敏捷刺客 对你使用了快速攻击，造成 10 点伤害！
				System.out.println("\uD83D\uDCA5 "+enemy.name+" 对你使用了快速攻击，造成"+damage3+"点伤害！");
				//我方扣血
				player.takeDamage(damage3);
			}
			case "防御姿态"->{
				//修改变量
				enemy.defending = true;
				// 🛡️ 坦克 对你使用了防御姿态！
				 System.out.println("\uD83D\uDEE1 "+enemy.name+" 使用了防御姿态！");
			}
			case "火球术"->{
				//计算敌人火球术的伤害
				int damage4 = calculateDamage((int)(enemy.attack*1.8), player.defense);
				// 🔥 法师 对你使用了火球术，造成 23 点伤害！
				System.out.println("\uD83D\uDD25 "+enemy.name+" 对你使用了火球术，造成"+damage4+"点伤害！");
				//我方扣血
				player.takeDamage(damage4);

			}
		}



	}

	}
