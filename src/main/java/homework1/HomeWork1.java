package homework1;

public class HomeWork1 {
    public static void method1(){

    }
    public static int method2(int a){
        return 2*a;
    }
    public static void method3(int a, int b){
        System.out.println(a+b);
    }

    public void method4(){
        System.out.println("method4 run");
    }

    public void method5(String string, int count){
        while (count>0){
            System.out.println(string);
            count--;
        }
    }
    public boolean method6(int a){
        return a>0;
    }

    public static void printArray(Object[] array){
        for (Object object:
             array) {
            System.out.println(object);
        }
    }
    public static boolean isParity(int a){
        return (a % 2) == 0;
    }
    public static boolean canDivide3(int a){
        return (a % 3) == 0;
    }
    public static boolean canDivide5(int a){
        return (a % 5) == 0;
    }

    public static int capacity(int a){
        int result=0;
        while (a!=0){
            result++;
            a/=2;
        }
        return result;
    }
}
