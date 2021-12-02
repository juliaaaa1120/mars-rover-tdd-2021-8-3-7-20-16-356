package com.afs.tdd;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    private void executeCommands(char commands) {
        switch (commands) {
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

    public void executeCommand(String command) {
        for (char ch : command.toCharArray()) {
            executeCommands(ch);
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
        switch (this.direction) {
            case "N":
                this.direction = "W";
                break;
            case "S":
                this.direction = "E";
                break;
            case "E":
                this.direction = "N";
                break;
            case "W":
                this.direction = "S";
                break;
        }
    }

    public void turnRight() {
        switch (this.direction) {
            case "N":
                this.direction = "E";
                break;
            case "S":
                this.direction = "W";
                break;
            case "E":
                this.direction = "S";
                break;
            case "W":
                this.direction = "N";
                break;
        }
    }

    public String getStatus() {
        return String.format("%d %d %s", this.locationX, this.locationY, this.direction);
    }
}
