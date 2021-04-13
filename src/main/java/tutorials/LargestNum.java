package tutorials;

public class LargestNum {
    public static int getLargest(int[] a){
        int temp;
        int total= a.length;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-1];
    }

    public static void main(String args[]){
        int a[]={1,2,555,6,3,2};
        int b[]={44,66,99,77,33,22,55,650};
        System.out.println("Largest: "+getLargest(a));
        System.out.println("Largest: "+getLargest(b));
}}
