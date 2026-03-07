public static void main(String[] args){
    /*
    给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引l。
    如果目标值不存在于数组中，打印应插入的位置举例1:
    数据： nums =[1,3,5,6];    target = 5
    输出：2

    举例2:
    数据: nums = [1,3,5,6], target = 2
    输出：1

    举例3:
    数据: nums = [1,3,5,6], target = 7
    输出：4
    */
    int[] arr = {1, 3, 5, 6};
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入 target 的值");
    int target = scanner.nextInt();
    
    // 遍历数组，找到第一个大于等于 target 的位置
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] >= target) {
            System.out.println(i);
            return; // 找到后直接结束
        }
    }
    // 如果所有元素都比 target 小，插入到末尾
    System.out.println(arr.length);
}
