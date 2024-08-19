class CircleArea {
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(int diameter) {
        double radius = diameter / 2.0;
        return Math.PI * radius * radius;
    }
}

class mover{
    public static void main(String[] args) {
        CircleArea circle = new CircleArea();
        
        double radius = 5.0;
        int diameter = 10;

        double areaByRadius = circle.area(radius);
        System.out.println("Area using radius: " + areaByRadius);

        double areaByDiameter = circle.area(diameter);
        System.out.println("Area using diameter: " + areaByDiameter);
    }
}