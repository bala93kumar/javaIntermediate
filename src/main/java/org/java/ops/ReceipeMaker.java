package org.java.ops;

public class ReceipeMaker extends  Receipe{
    @Override
    void heatDist() {
      System.out.println("heat the dish");
    }

    @Override
    void cleanCups() {
       System.out.println("clean the utensils");
    }
}
