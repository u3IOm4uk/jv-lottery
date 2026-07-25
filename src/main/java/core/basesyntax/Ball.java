package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(new ColorSupplier().getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
