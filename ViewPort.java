package rt;

class ViewPort {
    Coordinate pixels;
    Vector point1; //use point1 as starting point
    Vector point2;
    Vector point3;
    Vector horizontalSideScreen;
    Vector verticalSideScreen;
    //Vector point4;

    ViewPort(Vector point1,Vector point2,Vector point3, Coordinate coord){
        pixels= coord;
        this.point1=point1;
        this.point2=point2;
        this.point3=point3;
        getSidesofScreen();
    }

    ViewPort(Vector point1,Vector point2,Vector point3){
        pixels= new Coordinate();
        this.point1=point1;
        this.point2=point2;
        this.point3=point3;
        getSidesofScreen();
    }

    void set(Vector point1, Vector point2, Vector 3){
        this.point1=point1;
        this.point2=point2;
        this.point3=point3;
        getSidesofScreen();
    }

    Coordinate getPixels() {
        return pixels;
    }

    private void getSidesofScreen(){
        horizontalSideScreen=point2.substract(point1);
        verticalSideScreen=point3.substract(point1);
    }


    Vector getVector(Coordinate coord){
        double scalarX=coord.getX() /pixels.getX();
        double scalarY=coord.getY() / pixels.getY();
        Vector horizontalVector=horizontalSideScreen.multiply(scalarX);
        Vector verticalVector =verticalSideScreen.multiply(scalarY);
        return horizontalVector.add(verticalVector).add(point1); 
    }


    
}