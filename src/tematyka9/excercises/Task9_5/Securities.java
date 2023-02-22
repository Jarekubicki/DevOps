package tematyka9.excercises.Task9_5;
import java.math.BigDecimal;

/**
 * Created by BIURO22 on 2023-02-07
 */
public abstract class Securities {

    private BigDecimal value;
    private int id;

    public Securities(BigDecimal value, int id) {
        this.value = value;
        this.id = id;
    }


    protected abstract void step();


    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
