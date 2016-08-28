package com.company.stain;/* Created by Sergej on 28.08.2016. Bottega IT Solutions */

import com.company.Direct;
import com.company.Position;

public class Direct90 implements Direct{
    @Override
    public void move(Position position) {
        position.setX(position.getX());
        position.setY(position.getY() + 1);
    }

    @Override
    public Direct setNextRight() {
        return new Direct135();
    }

    @Override
    public Direct setNextLeft() {
        return new Direct45();
    }
}
