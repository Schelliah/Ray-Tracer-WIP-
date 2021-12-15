package rt;

public class Sphere implements Shape{
    Vector origin;
    double radius;

    Sphere(Vector origin, double radius){
        this.origin=origin;
        this.radius=radius;
    }
    public Vector[] intersect(Line line){
        ParametricLine parametricLine=line.parametricRepresentation();
        Vector startMinusOrigin = parametricLine.getStartVector().substract(origin);

        Double a=parametricLine.getDirectionVector().dotProduct(parametricLine.getDirectionVector());
        Double b =  parametricLine.getDirectionVector().dotProduct(startMinusOrigin);
        double c = startMinusOrigin.dotProduct(startMinusOrigin);

        return getSolutionQuadatricFormula(a, b, c,parametricLine);
    }


    Vector[] getSolutionQuadatricFormula(double a, double b, double c,ParametricLine parametricLine){
        double discrimnant = b*b - 4*a*c;
        Vector[] result;

        if(discrimnant<0){ //no intersection
            return null;
        } else if(discrimnant==0){
            double t=-b/(2*a);
            
            result = new Vector[1];
            result[0] = parametricLine.getStartVector().add(parametricLine.getDirectionVector().multiply(t));
        } else {
            double t1=(-b + Math.sqrt(discrimnant))/(2*a);
            double t2=(-b - Math.sqrt(discrimnant))/(2*a);

            result = new Vector[2];
            result[0] = parametricLine.getStartVector().add(parametricLine.getDirectionVector().multiply(t1));
            result[1] = parametricLine.getStartVector().add(parametricLine.getDirectionVector().multiply(t2));
        }
        return result;
    }
}