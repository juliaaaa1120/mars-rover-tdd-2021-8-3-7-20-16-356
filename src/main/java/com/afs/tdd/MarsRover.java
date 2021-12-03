package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;
    private List<String> directionList = Arrays.asList("N", "E", "S", "W");

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    private void executeCommands(char command) {
        switch (command) {
            case 'M':
                this.move();
                break;
            case 'L':
                this.turnLeft();
                break;
            case 'R':
                this.turnRight();
                break;
        }
    }

    public void executeCommand(String commands) {
        for (char command : commands.toCharArray()) {
            executeCommands(command);
        }
    }

    public void move() {
        switch (this.direction) {
            case "N":
                this.locationY++;
                break;
            case "S":
                this.locationY--;
                break;
            case "E":
                this.locationX++;
                break;
            case "W":
                this.locationX--;
                break;
        }
    }

    public void turnLeft() {
        int currentIndex = directionList.indexOf(this.direction);
        int newIndex = currentIndex == 0 ? directionList.size() - 1 : (currentIndex - 1);
        this.direction = directionList.get(newIndex);
    }

    public void turnRight() {
        int currentIndex = directionList.indexOf(this.direction);
        int newIndex = currentIndex == directionList.size() - 1 ? 0 : (currentIndex + 1);
        this.direction = directionList.get(newIndex);
    }

    public String getStatus() {
        return String.format("%d %d %s", this.locationX, this.locationY, this.direction);
    }
}
