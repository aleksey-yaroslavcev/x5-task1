package homework1;

public class Brick {
    private final String name;
    private final int height;
    private final int width;
    private final int depth;

    public Brick(String name, int height, int width, int depth) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public void printVolume(){
        System.out.println("Volume of brick "+name +
                " = "+height*width*depth);
    }

    public void printAreaOfAllEdges(){
        int area=2*height*width + 2*width*depth + 2*depth*height;
        System.out.println("Area of all edges = " +
                area);
    }
}
