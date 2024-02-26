package model;

import enums.PaintColor;

public class Carpet {

    private int width;
    private int height;

    private PaintColor paintColor;

    public Carpet(int width, int height, PaintColor paintColor) {
        this.width = width;
        this.height = height;
        this.paintColor = paintColor;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintColor() {
        return paintColor;
    }

    public void lying(){
        System.out.println(" Carpet is lying on Bedroom floor. ");
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", height=" + height +
                ", paintColor=" + paintColor +
                '}';
    }
}
