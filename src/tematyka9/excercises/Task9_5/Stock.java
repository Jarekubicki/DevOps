package tematyka9.excercises.Task9_5;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by BIURO22 on 2023-02-08
 */
public class Stock extends Securities{


    public Stock(BigDecimal value, int id) {
        super(value, id);

    }


    @Override
    protected void step() {
        final double POSITIVE_INTEREST_RATE = 0.1;
        final double NEGATIVE_INTEREST_RATE = -0.1;
        double[] interestList = {POSITIVE_INTEREST_RATE, NEGATIVE_INTEREST_RATE};

        Random random = new Random();
        int index = random.nextInt(interestList.length);

        double interest = interestList[index];
        BigDecimal percentage = new BigDecimal(interest);
        BigDecimal interestRate = getValue().multiply(percentage);
        setValue(getValue().add(interestRate));

    }
}
