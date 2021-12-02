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

    public void executeCommand(String command) {
        if (command.equals("M")) {
            this.move();
        } else if (command.equals("L")) {
            this.turnLeft();
        }
    }

    public void move() {
        if (this.direction.equals("N")) {
            this.locationY++;
        } else if (this.direction.equals("S")) {
            this.locationY--;
        } else if (this.direction.equals("E")) {
            this.locationX++;
        } else if (this.direction.equals("W")) {
            this.locationX--;
        }
    }

    public void turnLeft() {
        if (this.direction.equals("N")) {
            this.direction = "W";
        } else if (this.direction.equals("S")) {
            this.direction = "E";
        }
    }

    public String getStatus() {
        return String.format("%d %d %s", this.locationX, this.locationY, this.direction);
    }
}
