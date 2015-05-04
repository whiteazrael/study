package chapter10_Class.notGoodExchange;

public class NotGoodPortfolio {
	public int getTokyoExchange() {
		TokyoStockExchange exchange = new TokyoStockExchange();
		return  exchange.getTokyoStockExchange();
	}
	
	public int getExchange(TokyoStockExchange exchange) {
		return exchange.getTokyoStockExchange();
	}
}
