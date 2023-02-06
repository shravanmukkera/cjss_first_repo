package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static String direction;
    private static int direction_value;
    public static HashMap<String,Integer> moves = new HashMap<>();
    private static List<HashMap<String,Integer>> cmd;
    private static String final_dir;

        public static void main (String[]args)
        {

            data();
            Man shr = new Man();
            shr.set_dir(direction, direction_value);
            //shr.get_final_pos(shr.get_dir(), shr.get_dir_val());
            shr.set_dir(direction,direction_value);

            for(HashMap<String,Integer> i:cmd){
                shr.set_final_dir(i);
            }
            Coordinate final_pos = shr.get_final_pos();
            int x_axis = final_pos.get_x();
            int y_axis = final_pos.get_y();

            if (x_axis>0&&y_axis>0){
                final_dir="NORTH-EAST";
            } else if (x_axis<0&&y_axis>0){
                 final_dir="NORTH-WEST";
            }else if (x_axis<0&&y_axis<0){
                 final_dir="SOUTH-WEST";
            }else if (x_axis>0&&y_axis<0){
                final_dir="SOUTH-EAST";
            }else if (x_axis==0&&y_axis>0){
                final_dir="NORTH";
            } else if (x_axis==0&&y_axis<0){
                final_dir="SOUTH";
            }else if (x_axis>0&&y_axis==0){
                final_dir="EAST";
            }if (x_axis<0&&y_axis==0){
                final_dir="WEST";
            }

            System.out.print("he is at ["+ final_dir+ "] with the coordinates ");
            System.out.println(":["+x_axis+","+y_axis+"]");
        }


    public static void data() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the command:");
        String str = scan.next();
        String[] command = str.split("-");
        direction = command[0].split(":")[0];
        direction_value = Integer.parseInt(command[0].split(":")[1]);

        Commands direct = new Commands();
        direct.setCommands(command);
        cmd = direct.getCommands();
        System.out.println(cmd);
    }
}