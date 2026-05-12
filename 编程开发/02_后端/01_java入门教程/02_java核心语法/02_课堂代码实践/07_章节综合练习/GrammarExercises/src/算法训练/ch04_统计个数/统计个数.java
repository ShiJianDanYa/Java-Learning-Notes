package 算法训练.ch04_统计个数;
//导包
import java.util.Random;

/**
 * ClassName: 统计个数
 * Package: 算法训练.ch04_统计个数
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/4 - 16:24
 * @Version: v1.0
 *
 */
public class 统计个数 {
	public static void main(String[] args){
		/*学校选举学生会主席，有5个候选人
		全校1000名同学参与投票（每人一票，可以弃权，或者选1-5号）。
		投票使用Random模拟。0：弃权，1~5：给对应的候选人投票
		要求1:
		统计每个候选人的得票数和得票率，找出得票最多的候选人？
		要求2:
		统计弃票数和弃票率是多少？*/
		Random random = new Random();
		//存储投票结果 大量同类型数据
		int[] vote = new int[6];
		//开始模拟
		for (int i = 0; i < 1000; i++) {
			int index = random.nextInt(0,6);
			/*switch (index){
				//使用新写法提高代码可读性
				case 0->vote[0]++;//弃权
				case 1->vote[1]++;//给1号投票
				case 2->vote[2]++;//给2号投票
				case 3->vote[3]++;//给3号投票
				case 4->vote[4]++;//给4号投票
				case 5->vote[5]++;//给5号投票
				default -> System.out.println("程序出错");
			}*/
			//index的含义
			//1. 投票的数据
			//2. 同样也是数组的索引
			vote[index]++;
		}
		//调用方法打印得票人和得票律
		printResult(vote);
		//调用方法，统计得票最多的候选人
		int theHighest = printMax(vote);
		//输出
		for (int i = 1; i < vote.length; i++) {
			if(vote[i] == theHighest){
				System.out.println("得票的最高候选人是"+i+"他的得票数是"+theHighest);
			}
		}
	}
	//打印结果
	public static void printResult(int[] vote){
		for (int i = 0; i < vote.length; i++) {
			if(i==0){
				System.out.println("弃权的人数是"+vote[i]+"弃票率为"+(double)vote[i]/10+"%");
			}else{
				System.out.println("第"+(i)+"号候选人的得票数是："+vote[i]+"得票率是："+(double)vote[i]/10+"%");
			}
		}
	}
	//打印最高人
	public static int printMax(int[] vote){
		//定义变量存储最高票和候选人
		int max = vote[1];
		int candidate = 1;
		//为什么从1开始，因为0是弃权
		for (int i = 2; i < vote.length; i++) {
			if(max<vote[i]){
				max = vote[i];
			}
		}
		return max;

	}
}
