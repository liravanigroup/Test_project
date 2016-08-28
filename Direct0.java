package com.company.stain;/* Created by Sergej on 28.08.2016. Bottega IT Solutions */

import com.company.Direct;
import com.company.Position;

public class Direct0 implements Direct {
    @Override
    public void move(Position position) {
        position.setX(position.getX() + 1);
        position.setY(position.getY());
    }

    @Override
    public Direct setNextRight() {
        return new Direct45();
    }

    @Override
    public Direct setNextLeft() {
        return new Direct270();
    }
}
