package com.company;

import java.util.ArrayList;

public class LittleGuy {
    private ArrayList<Integer> levels;
    private int possibleLevels;

    public int getPossibleLevels() {
        return possibleLevels;
    }

    public void setPossibleLevels(int possibleLevels) {
        this.possibleLevels = possibleLevels;
    }

    public LittleGuy() {
        levels = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getLevels() {
        return levels;
    }


    public void addLevel(int level) {
        if(!this.levels.contains(level))
            this.levels.add(level);
    }

}
