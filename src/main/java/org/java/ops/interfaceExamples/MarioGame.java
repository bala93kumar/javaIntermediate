package org.java.ops.interfaceExamples;

public class MarioGame implements  GamingConsole{
    @Override
    public void up() {
        System.out.println("jump up");
    }

    @Override
    public void down() {

        System.out.println("go down");

    }
}
