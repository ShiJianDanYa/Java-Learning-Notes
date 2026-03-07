package 自我练习.字符串.练习04单词长度;

/**
 * ClassName: 单词长度
 * Package: 自我练习.字符串.练习04单词长度
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1215:57
 * @Version1.0
 */
    
    /*
    需求如下
    给你一个字符串s，由若干单词组成，单词前后用一些空格字符隔开。
    返回字符串中最后一个单词的长度。
    单词是指仅由字母组成、不包含任何空格字符的最大子字符串。
    示例1：输入：s="HelloWorld输出：5
    解释：最后一个单词是"World"，长度为5。
    */
public class 单词长度 {
    public static void main(String[] args) {
        String s = "Hello World wwwwwwww";
        //调用方法返回最后一个单词的长度
        int i = lastWordLength(s);
        System.out.println("最后一个单词长度为："+i);
    }
    //获取最后一个单词长度
    public static int lastWordLength(String s){
        int count = 0;
        //单词字符串
        String word = "";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                System.out.println("最后一个单词是"+word);
                break;
            }
            word = s.charAt(i) + word;
            count++;
        }
        return count;
    }
}
