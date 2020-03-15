package homework1;

public class Main {
    public static void main(String[] args) {
        HomeWork1.method1();

        System.out.println(HomeWork1.method2(10));

        HomeWork1.method3(2,3);

        HomeWork1 homeWork1=new HomeWork1();
        homeWork1.method4();

        homeWork1.method5("строка",3);

        System.out.println(homeWork1.method6(12));

        Integer[] array={1,2,3,4};
        HomeWork1.printArray(array);

        System.out.println(HomeWork1.isParity(64));

        System.out.println(HomeWork1.canDivide3(27));

        System.out.println(HomeWork1.canDivide5(3245));
        System.out.println(HomeWork1.capacity(2134));

        Rectangle rectangle=new Rectangle("1st",3,6);
        rectangle.printArea();

        Brick brick=new Brick("some brick",1,2,3);
        brick.printVolume();
        brick.printAreaOfAllEdges();

        Champion.printWinner(new Champion("Ivan",1,2,3),
                new Champion("Petr",2,2,3));

        Champion.printWinner(new Champion("Ivan",1,2,3),
                new Champion("Petr",3,2,1));
    }
}
