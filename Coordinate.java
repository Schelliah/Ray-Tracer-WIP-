package rt;

import java.util.*;
import java.util.stream.Stream;
import java.lang.*;

class Coordinate{
    private int x;
    private int y;

    Coordinate(){
        x=y=100;
    }

    Coordinate(int x,int y){
        this.x=x;
        this.y=y;
    }

    void set(int x,int y){
        this.x=this.x + x;
        this.y=this.y + y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    
    Coordinate multiply(int i){
        return new Coordinate(this.getX() * i ,this.getY() * i);
    }


    Coordinate add(Coordinate secondCoordinate){
        return new Coordinate(this.getX() + secondCoordinate.getX(),this.getY() + secondCoordinate.getY());
    }

    Coordinate substract(Coordinate secondCoordinate){
        return new Coordinate(this.getX() - secondCoordinate.getX(),this.getY() - secondCoordinate.getY());
    }



    public boolean equals(Coordinate secondCoordinate){
        return this.getX() == secondCoordinate.getX() && this.getY() == secondCoordinate.getY();    
    }


    
    

}