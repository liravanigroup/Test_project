package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Robot robot = new MarsRobot(new Position(50, 50));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String cmd = scanner.next();
            System.out.println(cmd);
             if (cmd.equals("rr")) {
                robot.rotateLeft();
            } else if (cmd.equals("rl")) {
                robot.rotateLeft();
            } else if (cmd.equals("move")) {
                robot.move();
            }
        }
    }
}
