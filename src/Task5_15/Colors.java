package Task5_15;

import java.util.Comparator;

/**
 * Created by BIURO22 on 2023-01-24
 */
public enum Colors implements Comparator<String> {

    WHITE("white"),
    BLACK("black"),
    GREEN("green"),
    BLUE("blue"),
    RED("red"),
    YELLOW("yellow"),
    ORANGE("orange"),
    PINK("pink");

    private final String description;

    Colors(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
