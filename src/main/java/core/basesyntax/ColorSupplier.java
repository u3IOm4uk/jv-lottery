package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    Color color;

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        color = Color.values()[index];
        return color.name();
    }
}
