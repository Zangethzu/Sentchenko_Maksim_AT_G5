package main.java.tasks.classwork.day7;

public class Runner {

    public static void main(String[] args){


        A a2 = new A(){
            public int foo(int x){
                int y = super.foo(x);
                System.out.println(y);
                return y;
            }
        };
        a2.foo(5);
    }
}
