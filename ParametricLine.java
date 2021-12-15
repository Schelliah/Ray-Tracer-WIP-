
package rt;

public class ParametricLine{
    Vector startVector;
    Vector directionVector;

    ParametricLine(Vector startVector, Vector directionVector){
        this.startVector=startVector;
        this.directionVector=directionVector;
    }

    Vector getStartVector() {
        return startVector;
    }

     Vector getDirectionVector() {
        return directionVector;
    }


    Vector intersect(ParametricLine secondLine){ //still has to test case, same line
        Vector dVector1 =this.getDirectionVector();
        Vector dVector2 = secondLine.getDirectionVector();
        Vector constantVector= secondLine.getStartVector().substract(this.getStartVector());

        double num=constantVector.getX() - constantVector.getY() / dVector2.getY();
        double denom = dVector1.getX() - dVector1.getY() / dVector2.getY();
        double t=num/denom;
        double s = (t* dVector1.getY() + dVector1.getZ() )/ dVector2.getY();

        Vector interSectionPoint1= dVector1.multiply(t).add(this.getStartVector());
        Vector interSectionPoint2 =dVector2.multiply(s).add(secondLine.getStartVector());

        if(interSectionPoint1.equals(interSectionPoint2)){
            return interSectionPoint1;
        }
        return null;
    }

    double getAngle(ParametricLine secondLine){
        Vector v1=this.directionVector;
        Vector v2 = secondLine.getDirectionVector();
        double cosTheta=v1.dotProduct(v2)/(v1.getNorm()*v2.getNorm());
        return Math.acos(cosTheta);
    }





    

}
