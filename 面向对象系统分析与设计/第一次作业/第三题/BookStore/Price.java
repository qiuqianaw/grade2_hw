package BookStore;

public class Price {

	private Book book;

	public double sum(double price) {
		return this.book.calculate(price);
	}

}
