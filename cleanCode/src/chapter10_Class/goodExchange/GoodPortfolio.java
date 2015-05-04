package chapter10_Class.goodExchange;

public class GoodPortfolio {
	private StockExchange exchange;
	
	public GoodPortfolio(StockExchange exchange) {
		this.exchange = exchange;
	}
	
	public int getStockExchage() {
		return exchange.getExchange();
	}
	
	public int getExchange(StockExchange stockExchange) {
		return stockExchange.getExchange();
	}
}
