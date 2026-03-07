package 专题综合练习.面向对象.案例01格斗游戏;

import java.util.Random;

/**
 * ClassName: Role
 * Package: 专题综合练习.面向对象.案例01格斗游戏
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/708:30
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class Role {
    private String name;
    private int blood;

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        //根据性别随机生成长相
        if (gender == "男") {
            //长相在boyfaces中随机生成
            this.face = boyfaces[new Random().nextInt(boyfaces.length)];
        } else if (gender == "女") {
            //长相在girlfaces中随机生成
            this.face = girlfaces[new Random().nextInt(girlfaces.length)];
        } else {
            this.face = "面目狰狞";
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //游戏更新新增性别，长相属性 攻击受伤描述
    private String gender;
    private String face;
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去",
            "%s使出了一招【游空探爪】,飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】,结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    //injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃一跤摔倒在地",
            "结果%s脸色一下变得惨白,连退了好几步",
            "结果『轰』的一声, %s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };



    public Role(){

    }
    public Role(String name,int blood,String gender){
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随机长相
        setFace(face);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法，用于攻击对方
    //谁攻击谁
    //调用者攻击参数
    public void attack(Role role){
        //开始输出攻击
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String Kungfu = attacks_desc[index];
        //输出攻击描述
        //%s 占位符，会被后面的参数替换
        System.out.printf(Kungfu,this.getName(),role.getName());
        System.out.println();

        //造成的伤害是随机的
        int hurt = r.nextInt(20)+1;

        //修改一下挨揍的人的血量
        //剩余血量 = 挨揍的人的血量 - 造成的伤害
        int remainBoold = role.getBlood() - hurt;
        //血量不可靠能以小于0 最大只能是0
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        //修改一下挨揍的人的血量
        role.setBlood(remainBoold);

        //受击反馈 根据受伤情况选择不同的描述
        //血量> 90 0索引的描述
        // 80 ~ 90 1索引的描述
        // 70 ~ 80 2索引的描述
        // 60 ~ 70 3索引的描述
        // 40 ~ 60 4索引的描述
        // 20 ~ 40 5索引的描述
        // 10 ~ 20 6索引的描述
        //小于10的  7索引的描述
        if(remainBoold>90){
            System.out.printf(injureds_desc[0],role.getName());
        }else if(remainBoold>80){
            System.out.printf(injureds_desc[1],role.getName());
        }else if(remainBoold>70){
            System.out.printf(injureds_desc[2],role.getName());
        }else if(remainBoold>60){
            System.out.printf(injureds_desc[3],role.getName());
        }else if(remainBoold>40){
            System.out.printf(injureds_desc[4],role.getName());
        }else if(remainBoold>20){
            System.out.printf(injureds_desc[5],role.getName());
        }else if(remainBoold>10){
            System.out.printf(injureds_desc[6],role.getName());
        }else{
            System.out.printf(injureds_desc[7],role.getName());
        }
        System.out.println();
    }
    //展示角色所有信息.
    public void showRoleinfo(){
        System.out.println("角色信息如下");
        System.out.println("角色姓名："+this.getName());
        System.out.println("角色血量："+this.getBlood());
        System.out.println("角色性别："+this.getGender());
        System.out.println("角色长相："+this.getFace());
    }
}


