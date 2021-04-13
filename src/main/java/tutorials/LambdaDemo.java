package tutorials;
interface A{
    void show(int i);
}

//class Xyz implements A{
//
//    @Override
//    public void show() {
//        System.out.println("Hello");
//    }
//}


public class LambdaDemo {
    public static void main(String[] args) {
        A obj;
        //obj=new Xyz();
        obj=(int i)->
            System.out.printf("I am lambda"+i);



        obj.show(6);
    }
}

