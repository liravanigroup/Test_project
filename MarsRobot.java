package com.company;/* Created by Sergej on 28.08.2016. Bottega IT Solutions */

import com.company.stain.Direct0;

public class MarsRobot implements Robot {

    private Position position;
    private Direct direction;

    public MarsRobot(Position position) {
        this.position = position;
        this.direction = new Direct0();
    }

    @Override
    public void move() {
        direction.move(position);
    }

    @Override
    public void rotateRight() {
       direction = direction.setNextRight();
    }

    @Override
    public void rotateLeft() {
        direction = direction.setNextLeft();
    }

    @Override
    public String toString() {
        return "MarsRobot{" +
                "position=" + position +
                ", direction=" + direction +
                '}';
    }
}
