package niuke.jianzhioffer;

/**
 * 题目描述
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */
public class FindInTwoDimArray {
    public static void main(String[] args) {

    }

    /**
     *  思路
     * 矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，
     * 因此从左下角开始查找，当要查找数字比左下角数字大时。右移
     * 要查找数字比左下角数字小时，上移
     *
     * @param target
     * @param array
     * @return
     */

    public boolean Find(int target, int [][] array) {
        int rowCount = array.length;
        int colCount = array[0].length;
        for(int row = rowCount-1,col = 0;row>=0&&col<colCount;){
            if(target == array[row][col])
                return true;
            if(target < array[row][col]){
                row --;
                continue;
            }
            if(target > array[row][col]){
                col ++;
                continue;
            }
        }
        return false;
    }
}
