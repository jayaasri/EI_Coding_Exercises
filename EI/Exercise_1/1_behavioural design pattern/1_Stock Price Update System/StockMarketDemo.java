package stock;

public class StockMarketDemo {
    public static void main(String[] args) {
        // StockMarket instance
        StockMarket stockMarket = new StockMarket();

        // Investor instances
        Investor investorA = new InvestorA();
        Investor investorB = new InvestorB();

        // Register investors with the stock market
        stockMarket.registerInvestor(investorA);
        stockMarket.registerInvestor(investorB);

        // Simulate stock price changes
        System.out.println("Setting stock price to 150.75");
        stockMarket.setStockPrice(150.75);
        System.out.println("Setting stock price to 160.30");
        stockMarket.setStockPrice(160.30);

        // Remove an investor and simulate another stock price change
        stockMarket.removeInvestor(investorA);
        System.out.println("Setting stock price to 170.90 after removing Investor A");
        stockMarket.setStockPrice(170.90);
    }
}
