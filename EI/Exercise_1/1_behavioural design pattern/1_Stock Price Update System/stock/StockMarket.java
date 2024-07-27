package stock;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class StockMarket {
    private static final Logger LOGGER = Logger.getLogger(StockMarket.class.getName());
    private List<Investor> investors = new ArrayList<>();
    private double stockPrice;

    public void registerInvestor(Investor investor) {
        if (investor == null) {
            throw new IllegalArgumentException("Investor cannot be null");
        }
        investors.add(investor);
        LOGGER.info("Investor registered: " + investor.getClass().getSimpleName());
    }

    public void removeInvestor(Investor investor) {
        if (investor == null) {
            throw new IllegalArgumentException("Investor cannot be null");
        }
        investors.remove(investor);
        LOGGER.info("Investor removed: " + investor.getClass().getSimpleName());
    }

    public void setStockPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Stock price cannot be negative");
        }
        this.stockPrice = price;
        notifyInvestors();
    }

    private void notifyInvestors() {
        for (Investor investor : investors) {
            try {
                investor.update(stockPrice);
            } catch (Exception e) {
                LOGGER.severe("Error updating investor: " + e.getMessage());
            }
        }
    }
}
