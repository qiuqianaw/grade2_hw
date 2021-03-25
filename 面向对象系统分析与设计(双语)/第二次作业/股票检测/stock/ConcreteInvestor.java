package stock1;

/**
 * @author QiuQian
 */
public class ConcreteInvestor implements Investor {

	private String name;

	public ConcreteInvestor(String name) {
		this.name = name;
	}

	@Override
	public void response() {
		System.out.println(name + "请注意，您购买的股票价格浮动超过了5%");
	}

}
