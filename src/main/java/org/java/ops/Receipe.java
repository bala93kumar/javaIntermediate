package org.java.ops;

public abstract  class Receipe {

    //prepare

    //recipe

    public void execute(){
        heatDist();
        cleanCups();
    }


     abstract void heatDist();

    //cleanup

    abstract  void cleanCups();

    
}
