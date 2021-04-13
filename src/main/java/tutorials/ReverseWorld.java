package tutorials;

import java.util.Scanner;

public class ReverseWorld {
    public static void main(String[] args) {
        char[] name=new char[]{};
        String name1;
        System.out.println("Enter your name");
        Scanner tim=new Scanner(System.in);
        name1=tim.next();
        int len=name1.length();
        for(int i=0;i<=len;++i){
            char b=name1.charAt(i);
            System.out.println(b+" ");
        }
    }

}
