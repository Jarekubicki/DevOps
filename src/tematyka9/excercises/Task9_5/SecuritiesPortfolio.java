package tematyka9.excercises.Task9_5;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by BIURO22 on 2023-02-08
 */
public class SecuritiesPortfolio {

    private ArrayList<Securities> securitiesPortfolio;


    public SecuritiesPortfolio(ArrayList<Securities> securitiesPortfolio) {
        this.securitiesPortfolio = securitiesPortfolio;
    }

    public void step() {
        for (Securities securities : securitiesPortfolio) {
            securities.step();
        }
    }

    public BigDecimal showPortfolioValue() {
        BigDecimal valueOfSecurities = new BigDecimal(0.0);
        for (Securities sec : securitiesPortfolio) {
            valueOfSecurities = valueOfSecurities.add(sec.getValue());
        }
        return valueOfSecurities;
    }

}
