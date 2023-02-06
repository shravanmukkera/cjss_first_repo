package org.example;
import java.util.HashMap;

public class Man {
    private String direction;
    private int dir_val;
    private static int x;
    private static int y;

    public void set_dir(String direction,int dir_val){
        this.direction= direction;
        this.dir_val= dir_val;
    }
    public String getDirection(){
        return direction;
    }
    public int get_dir_val(){
        return dir_val;
    }

    public void setInitialPosition(String direction,int dir_val){
        switch(direction){
            case "NORTH" : y = y+dir_val;
                break;
            case "SOUTH" : y = y - dir_val;
                break;
            case "WEST" : x = x-dir_val;
                break;
            case "EAST" : x = x+dir_val;
                break;
        }
    }

    public void set_final_dir(HashMap<String,Integer> moves){
        for(String mov : moves.keySet()){
            switch(direction){
                case "NORTH":{
                    if(mov.equals("LEFT")){
                        direction = "WEST";
                        x = x-moves.get(mov);
                    } else if(mov.equals("RIGHT")){
                        direction = "EAST";
                        x = x+moves.get(mov);
                    }
                }
                continue;
                case "SOUTH":{
                    if(mov.equals("LEFT")){
                        direction = "EAST";
                        x = x+moves.get(mov);
                    } else if(mov.equals("RIGHT")){
                        direction = "WEST";
                        x = x-moves.get(mov);
                    }
                }
                continue;
                case "WEST":{
                    if(mov.equals("LEFT")){
                        direction = "SOUTH";
                        y = y-moves.get(mov);
                    } else if(mov.equals("RIGHT")){
                        direction = "NORTH";
                        y = y+moves.get(mov);
                    }
                }
                continue;
                case "EAST":{
                    if(mov.equals("LEFT")){
                        direction = "NORTH";
                        y = y+moves.get(mov);
                    } else if(mov.equals("RIGHT")){
                        direction = "SOUTH";
                        y = y-moves.get(mov);
                    }
                }
            }
        }
    }

    public String get_final_dir()
    {
        return direction;
    }

    public Coordinate get_final_pos(){
        return new Coordinate(x, y);
    }
}
