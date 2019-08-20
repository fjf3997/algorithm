package niuke.jianzhioffer;

/**
 * 题目描述
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceKongge {
    public static void main(String[] args) {
        String str = "we are happy";
//        System.out.println(str.indexOf(" ",3));
        String newStr = replaceSpace(new StringBuffer(" hello "));
        System.out.println(newStr);
    }

    /**
     * 1.调用自带函数   str.toString().replace(" ","%20");
     * 2.用新的数组存
     * public String replaceSpace(StringBuffer str) {
     *         StringBuilder sb = new StringBuilder();
     *         for(int i=0;i<str.length();i++){
     *             char c = str.charAt(i);
     *             if(c == ' '){
     *                 sb.append("%20");
     *             }else{
     *                 sb.append(c);
     *             }
     *         }
     *         return sb.toString();
     *     }
     * @param str
     * @return
     */

    public static String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ","%20");
    }
}
