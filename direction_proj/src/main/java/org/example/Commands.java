package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Commands {
    private List<HashMap<String,Integer>> commands = new ArrayList<>();

    public void setCommands(String[] command){
        for (int i = 1; i < command.length; i++) {
            HashMap<String,Integer> direct = new HashMap<>();
            String move = command[i].split(":")[0];
            int move_val = Integer.parseInt(command[i].split(":")[1]);
            direct.put(move, move_val);
            commands.add(direct);
        }
    }

    public List<HashMap<String,Integer>> getCommands()
    {
        return commands;
    }
}
