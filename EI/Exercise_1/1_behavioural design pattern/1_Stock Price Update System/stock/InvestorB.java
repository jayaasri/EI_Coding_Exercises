package stock;

import java.util.logging.Logger;

public class InvestorB implements Investor {
    private static final Logger LOGGER = Logger.getLogger(InvestorB.class.getName());

    public void update(double stockPrice) {
        LOGGER.info("Investor B: New stock price: " + stockPrice);
    }
}
