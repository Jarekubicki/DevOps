package tematyka9.excercises.Task9_5;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by BIURO22 on 2023-02-08
 */
public class Test {
    public static void main(String[] args) {

        Securities deb1 = new Debenture(new BigDecimal(93250.32), 424, 0.12);
        Securities stock1 = new Stock(new BigDecimal(232839.32), 32);

        ArrayList<Securities> portfolio = new ArrayList<>();
        portfolio.add(deb1);
        portfolio.add(stock1);

        SecuritiesPortfolio securitiesPortfolio = new SecuritiesPortfolio(portfolio);

        securitiesPortfolio.step();
        double totalValue = securitiesPortfolio.showPortfolioValue().doubleValue();

        System.out.println("Total securities portfolio value = " + totalValue);
    }
}
