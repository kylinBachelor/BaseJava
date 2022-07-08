package Sorts;
public class InsertSort {
    public static void main(String[] args) {
        int[] a = new int[]{34,1234,3,2,67,3,1,24,5,9};
        insertFor(a);
         for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
    public static int[] insertFor(int[] a){
        int insertNode,j;
        for (int i = 1; i < a.length; i++) {
           insertNode = a[i];
           for (j = i; j>0 && insertNode<a[j-1]; j--){
               a[j] = a[j-1];
           }
           a[j] = insertNode;
        }
        return a;
    }
    public static int[] insertWhile(int[] a){
        int insertNode,j;//要插入的数据
        for (int i = 1; i < a.length; i++) { //从数组的第二个元素开始循环将数组中的元素插入
            insertNode = a[i];//设置数组中的第二个元素为第一次循环要插入的数据
            j = i-1;
            while (j>=0 && insertNode < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNode;

        }
        /*for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        } */
        return a;
    }
}
