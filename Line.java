package rt;


public class Line{
    private Vector startPoint;
    private Vector endPoint;


    Line(Vector startPoint, Vector endPoint){
        this.startPoint=startPoint;
        this.endPoint=endPoint;
    }

    public Vector getStartPoint(){
        return startPoint;
    }

    public Vector getEndPoint(){
        return endPoint;
    }

    ParametricLine parametricRepresentation(){
        Vector directionVector=this.endPoint.substract(this.startPoint);
        return new ParametricLine(startPoint, directionVector);
    }

   // double calculateAngle(Line secondLine){
   //     return null;
    //S}

}
