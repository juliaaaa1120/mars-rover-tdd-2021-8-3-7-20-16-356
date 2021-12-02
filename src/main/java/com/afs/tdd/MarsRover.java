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
        move();
    }

    public void move() {
        if (this.direction == "N") {
            this.locationY++;
        } else if (this.direction == "S") {
            this.locationY--;
        }
    }

    public String getStatus() {
        return String.format("%d %d %s", this.locationX, this.locationY, this.direction);
    }
}
