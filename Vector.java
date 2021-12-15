package rt;

import java.util.*;
import java.util.stream.Stream;
import java.lang.*;

class Vector{
    private double x;
    private double y;
    private double z;

    Vector(){
        x=y=z=0;
    }

    Vector(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    void set(double x,double y,double z){
        this.x=this.x + x;
        this.y=this.y + y;
        this.z=this.z + z;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getZ(){
        return z;
    }

    Vector multiply(double i){
        return new Vector(this.getX() * i ,this.getY() * i ,this.getZ() * i);
    }


    Vector add(Vector secondVector){
        return new Vector(this.getX() + secondVector.getX(),this.getY() + secondVector.getY(),this.getZ() + secondVector.getZ());
    }

    Vector substract(Vector secondVector){
        return new Vector(this.getX() - secondVector.getX(),this.getY() - secondVector.getY(),this.getZ() - secondVector.getZ());
    }

    double dotProduct(Vector secondVector){
        return this.getX() * secondVector.getX() + this.getY() * secondVector.getY()+ this.getZ() * secondVector.getZ();
    }

    double getNorm(){
        double normSquared=this.getX() * this.getX() + this.getY()*this.getY() + this.getZ()*this.getZ();
        return  Math.sqrt(normSquared);
    }


    public boolean equals(Vector secondVector){
        return this.getX() == secondVector.getX() && this.getY() == secondVector.getY() && this.getZ() == secondVector.getZ();    
    }

}