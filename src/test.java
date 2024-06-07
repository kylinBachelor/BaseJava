import java.util.function.Consumer;
class test {
    public static void main(String[] args) {
        String str = "fjsldjflsdfk>sdlfjksdfjlkf";
        String insert = "插入的值";
        int index = str.indexOf(">11111111");
        System.out.println(index);

        StringBuilder sb = new StringBuilder(str);
        sb.insert(index, insert);
        System.out.println(sb.toString());


        
    }
}