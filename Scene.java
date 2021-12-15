package rt;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    //private final int MAX_OBJECTS=10; 
    //private final int MAX_LIGHTSOURCE=10;
    ViewPort viewPort;
    Vector viewPoint;
    List<Shape> shapes;
    List<Lightsource> lightSources;

    Scene(ViewPort viewPort,Vector viewPoint){
        shapes= new ArrayList<Shape>()
        lightSources = new ArrayList<Lightsource>();
        this.viewPort =viewPort;
        this.viewPoint = viewPoint;
    }

    private  hasePoint(Vector beginPoint, Vector endPoint){
        Line line=new Line(beginPoint,endPoint);
        return getNearestIntersection(line).size();
    }


    List<Vector[]> getNearestIntersection(Line pixelLine){
        List<Vector[]> intersectionsPointsList = new ArrayList<Vector[]>();
        for (int i =0;i<shapes.size();i++){
            Vector[] intersections =shapes.get(i).intersect(pixelLine);
            if(!(  intersections==null)){
                intersectionsPointsList.add(intersections);
            }
        }
        return intersectionsPointsList;
    }

    void getB(int i, int j){
        Coordinate coord = new Coordinate(i,j);
        Vector intersectionPort =viewPort.getVector(coord);
        Line pixelLine = new Line(viewPoint, intersectionPort);
    }



    void getBrightness(){ //change name later
        for (int i=0;i<viewPort.getPixels().getX();i++){
            for (int j=0;i<viewPort.getPixels().getY();j++){
                getB(i,j);
            }

        }
    }

    public static void main(String[] args){


    }




}
