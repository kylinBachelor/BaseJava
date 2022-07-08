package Sorts;

public class SelectSort {
    public static void main(String[] args) {
        int[] ints = new int[]{2,4,1,52,12,42,65,67};
        Select(ints);
    }
    public static void Select(int[] s){
       int a;
       for (int i = 0; i < s.length ; i++){
           for (int j=i+1 ; j < s.length ; j++){
               if(s[i] < s[j]){
                   s[i] = s[i] + s[j];
                   s[j] = s[i] - s[j];
                   s[i] = s[i] - s[j];
                   //a = s[i] ;
                   //s[i] = s[j];
                   //s[j] = a;
               }
           }
       }
        for (int i = 0; i < s.length ; i++) {
            System.out.print(s[i]+" ");
        }
    }
}
