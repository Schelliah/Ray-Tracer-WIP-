package rt;

public class Lightsource {
   private Vector position;
   private double brightness;

   Lightsource(Vector position, double brightness){
       this.position=position;
       this.brightness=brightness;
   }

   public double getBrightness() {
       return brightness;
   }

   public Vector getPosition() {
       return position;
   }
}




