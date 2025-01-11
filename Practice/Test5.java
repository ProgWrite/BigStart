

public class Test5 {
    String s = "non-static parent class";
    {
        System.out.println(s);
    }
    Test5(){
        System.out.println("this is constructor");
    }

    static {
        System.out.println("this is static block");
    }

    static class B extends Test5{
        static{
            System.out.println("this is child static block");
        }
        B(){
            System.out.println("eto child constructor");
        }
        {
            System.out.println("eto child block");
        }

    }

    public static void main(String[] args) {
        B b = new B();


    }


}


