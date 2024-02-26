package model;

import enums.PaintColor;

public class Ceiling {

    private int height;

    private PaintColor paintColor;

    public Ceiling(int height, PaintColor paintColor) {
        this.height = height;
        this.paintColor = paintColor;
    }


    public int getHeight(){
        return height;
    }

    public PaintColor getPaintColor(){
        return  paintColor;
    }

    public void create(){
        System.out.println(" height: " + height + " - paintedColor " + paintColor);
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "height=" + height +
                ", paintColor=" + paintColor +
                '}';
    }
}
