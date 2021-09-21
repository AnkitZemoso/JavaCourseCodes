public class Proj_Circle {
    private double radius;

    public Proj_Circle(){
        this(1.0);
    }
    public Proj_Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circumference(){
        return 2* Math.PI *radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius,2);
    }

    public static void printCircleData(Proj_Circle circle){
        System.out.println("radius: "+String.format("%.2f",circle.getRadius()));
        System.out.println("circumference: "+String.format("%.2f",circle.circumference()));
        System.out.println("area: "+String.format("%.2f",circle.area()));
        System.out.println();
    }
    public static void main(String[] args) {
        Proj_Circle unitCircle=new Proj_Circle();
        Proj_Circle myCircle=new Proj_Circle(5);
        Proj_Circle yourCircle=new Proj_Circle(12.75);

        printCircleData(unitCircle);
        printCircleData(myCircle);
        printCircleData(yourCircle);
    }
}
