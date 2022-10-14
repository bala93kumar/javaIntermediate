package org.java.ops;

public class Fan {

   private String make;
   private int radius ;
   private String color ;

   private boolean isOn;
   private int speed;

   public Fan(String make, int radius, String color) {
      this.make = make;
      this.radius = radius;
      this.color = color;
   }

   // behaviour
     //isOn

//   public  void isOn(boolean isOn){
//      this.isOn = isOn;
//   }

    public void switchOn(){
      this.isOn = true;
    }

    public void switchOff(){
      this.isOn = false;
    }
   @Override
   public String toString() {
      return "Fan{" +
              "make='" + make + '\'' +
              ", radius=" + radius +
              ", color='" + color + '\'' +
              ", isOn=" + isOn +
              ", speed=" + speed +
              '}';
   }
}
