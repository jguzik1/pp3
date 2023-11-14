public class SurfaceAreaTest {
    public static void main(String[] args) {
        System.out.print("Rectangle area (5,2): ");
        System.out.println(SurfaceArea.rectangleArea(5, 2));

        System.out.print("circle area (3): ");
        System.out.println((float)SurfaceArea.circleArea(3));

        System.out.print("Triangle area (3,4): ");
        System.out.println(SurfaceArea.rectangleArea(3, 4));

        System.out.print("cuboid area (3,4,5): ");
        System.out.println(SurfaceArea.cuboidArea(3, 4, 5));

        System.out.print("Sphere area (3): ");
        System.out.println(SurfaceArea.sphereArea(3));

        System.out.print("Cone area (3,4): ");
        System.out.println(SurfaceArea.coneArea(3, 4));
    }
}
