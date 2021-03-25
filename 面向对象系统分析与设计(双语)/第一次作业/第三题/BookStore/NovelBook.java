package BookStore;

public class NovelBook implements Book {

	public double calculate(double price) {
		System.out.println("小说类图书(NovelBook)每100元有10元的折扣");
		//计算有多少个100元
		int t = (int)price / 100;
		return price - t * 10;
	}

}
