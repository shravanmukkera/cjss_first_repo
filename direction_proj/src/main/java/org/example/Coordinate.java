package org.example;

public class Coordinate{
    private int x_axis;
    private int y_axis;

    public Coordinate(int x_axis,int y_axis){
        this.x_axis = x_axis;
        this.y_axis = y_axis;
    }

    public int get_x()
    {
        return x_axis;
    }

    public int get_y()
    {
        return y_axis;
    }
}

