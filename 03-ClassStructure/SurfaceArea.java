public class SurfaceArea {
    
    public static double rectangleArea(double a, double b){
        return a * b;
    }
  
    public static double circleArea(double r){
        return Math.PI * r * r;
    }

    public static double triangleArea(double a, double h){
        return a * h / 2.0;
    }

    public static double cuboidArea(double a, double b, double h){
        return a * b * h;
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double coneArea(double r, double t){
        return Math.PI * r * t + Math.PI * Math.pow(r, 2);
    }
}

