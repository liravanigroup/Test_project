package com.company;/* Created by Sergej on 28.08.2016. Bottega IT Solutions */

public interface Direct {
    void move(Position position);

    Direct setNextRight();

    Direct setNextLeft();
}
