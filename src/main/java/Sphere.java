public class Sphere extends Circle{

    public Sphere(double radius){
        super(radius);
    }

    @Override
    public double area(){
        return (4.0*Math.PI*(Math.pow(this.radius, 2.0)));
    }

    public double volume(){
        return((4.0/3.0)*Math.PI*(Math.pow(this.radius, 3.0)));
    }
}