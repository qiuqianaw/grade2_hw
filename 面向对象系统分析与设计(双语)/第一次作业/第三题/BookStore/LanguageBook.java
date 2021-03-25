package BookStore;

public class LanguageBook implements Book {

	public double calculate(double price) {
		System.out.println("所有语言类图书(LanguageBook)每本都有2元的折扣");
		return price - 2;
	}

}
