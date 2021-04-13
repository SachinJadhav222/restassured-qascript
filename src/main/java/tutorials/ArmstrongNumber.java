package tutorials;

public class ArmstrongNumber {
    public static void getArmstrongNumber(int number[]){
//        int c=0,a,temp;
//        int n=153;//It is the number to check armstrong  e.g 153 = (1*1*1)+(5*5*5)+(3*3*3)
//        temp=n;
//        while(n>0)
//        {
//            a=n%10;
//            n=n/10;
//            c=c+(a*a*a);
//        }
//        if(temp==c)
//            System.out.println(temp+ " is armstrong number");
//        else
//            System.out.println(temp+ " is Not armstrong number");

        for(int i=0;i<number.length;i++){

            int c=0,a,temp;
            int n=number[i];//It is the number to check armstrong  e.g 153 = (1*1*1)+(5*5*5)+(3*3*3)
            temp=n;
            while(n>0)
            {
                a=n%10;
                n=n/10;
                c=c+(a*a*a);
            }
            if(temp==c)
                System.out.println(temp+ " is armstrong number");
            else
                System.out.println(temp+ " is Not armstrong number");

        }

    }


    public static void main(String[] args) {
        int numbers[] = {0, 1, 153, 370, 371, 407, 500, 300};
        getArmstrongNumber(numbers);
    }
}
