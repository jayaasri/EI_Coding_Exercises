package stock;

import java.util.logging.Logger;

public class InvestorA implements Investor {
    private static final Logger LOGGER = Logger.getLogger(InvestorA.class.getName());

    public void update(double stockPrice) {
        LOGGER.info("Investor A: New stock price: " + stockPrice);
    }
}
