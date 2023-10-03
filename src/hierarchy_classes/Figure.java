package hierarchy_classes;

 public class Figure { // package-private class

     public static class A{}
     public class B{}
     class C{}
    enum Shape {CIRCLE, RECTANGLE}

    final Shape shape;
    double length;
    double width;

    double radius;

    Figure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    Figure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch(shape) {
            case RECTANGLE:
                return length * width;
         //   break;
            case CIRCLE:
                return Math.PI * (radius * radius);
         //   break;
            default:
                throw new AssertionError(shape);
        }
    }
}
