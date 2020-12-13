package Base.Base;
public class StringEqual {
//    public static void main(String[] args) {
//    String s1 = "abc";
//    String s2 = "a";
//    String s3 = s2 + "bc";  //abc
//    String s4 = "a" + "bc";   //abc
//    String s5 = s3.intern();
//    System.out.println(s1==s3);
//    System.out.println(s1==s4);
//    System.out.println(s1==s5);
//    //字符串的反转
//    StringBuffer stringBuffer = new StringBuffer();
//    stringBuffer.append("abcdefg");
//    System.out.println(stringBuffer.reverse());
//    StringBuilder stringBuilder = new StringBuilder();
//    stringBuilder.append("abcdefg");
//    System.out.println(stringBuilder.reverse());
//    System.out.println(3*0.1 == 0.3);
//
//
//}
public static void main(String[] args) {
    String string = "  cOng .txt ";
    System.out.println("查找最后一个字符出现的位置 " + string.lastIndexOf("."));
    System.out.println("查找文件扩展名 " + string.substring(string.lastIndexOf(".")+1));
    System.out.println("转变为全小写 " + string.toLowerCase());
    System.out.println("转变为全大写 " + string.toUpperCase());
    System.out.println("去除前后的空格 " + string.trim());
    System.out.println(string.isEmpty());
    String string1 = "2345";
    System.out.println(string1);
}

}
