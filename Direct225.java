package com.company.stain;/* Created by Sergej on 28.08.2016. Bottega IT Solutions */

import com.company.Direct;
import com.company.Position;

public class Direct225 implements Direct {
    @Override
    public void move(Position position) {
        position.setX(position.getX() + 1);
        position.setY(position.getY() + 1);
    }

    @Override
    public Direct setNextRight() {
        return new Direct270();
    }

    @Override
    public Direct setNextLeft() {
        return new Direct180();
    }
}
