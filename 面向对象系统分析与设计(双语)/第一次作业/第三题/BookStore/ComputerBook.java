package BookStore;

public class ComputerBook implements Book {

	public double calculate(double price) {
		System.out.println("所有计算机类图书(ComputerBook)每本都有10%的折扣");
		return price * 0.9;
	}

}
