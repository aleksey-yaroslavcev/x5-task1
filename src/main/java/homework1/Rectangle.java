package homework1;

public class Rectangle {
    private final String name;
    private final int height;
    private final int width;

    public Rectangle(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }
    public void printArea(){
        System.out.println("Area of rectange "+name +
                " = "+height*width);
    }
}
