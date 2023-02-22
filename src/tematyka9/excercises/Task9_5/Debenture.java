package tematyka9.excercises.Task9_5;

import java.math.BigDecimal;

/**
 * Created by BIURO22 on 2023-02-07
 */
public class Debenture extends Securities {

    double interestRate;

    public Debenture(BigDecimal value, int id, double interestRate) {
        super(value, id);
        this.interestRate = interestRate;
    }


    @Override
    protected void step() {
        BigDecimal intRate = new BigDecimal(interestRate);
        BigDecimal interest = getValue().multiply(intRate);
        setValue(getValue().add(interest));
    }
}
