package Sorts;
public class MaoPao {
    public static void main(String[] args) {
        /*int result = 2+2;
        System.out.println("result=" + result);
        System.out.println(2+2); */
        int[] ints = new int[]{2,4,1,52,12,42,65,67};
        MaopaoSort(ints);
    }
    public static void MaopaoSort(int[] s){
        //int a;
        for (int i = 1; i < s.length ; i++) {
            for (int j = 0; j < s.length - i ; j++) {
                if(s[j] < s[j+1]){
                    s[j] = s[j] + s[j+1];
                    s[j+1] = s[j] - s[j+1];
                    s[j] = s[j] - s[j+1];
                    //a = s[j];
                    //s[j] = s[j+1];
                    //s[j+1] = a;
                }
            }
        }
        for (int i = 0; i < s.length ; i++) {
            System.out.print(s[i]+" ");
        }
    }
}
