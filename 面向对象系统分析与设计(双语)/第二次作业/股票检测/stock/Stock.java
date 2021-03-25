package stock1;

/**
 * @author QiuQian
 */
public class Stock extends Subject {

	private String stockName;
	private double price;

	public Stock(String stockName, double price) {
		this.stockName = stockName;
		this.price = price;
	}

	@Override
	public void notifyInvestor(double newPrice) {
		if ( Math.abs(newPrice - price) > price * 0.05 ) {
			for ( Investor investor : investorList ) {
				investor.response();
			}
		}
	}

}
