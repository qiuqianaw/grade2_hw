package stock1;

/**
 * @author QiuQian
 */
public class Client {
    public static void main(String[] args) {
        Stock stock = new Stock("Neusoft", 100);

        stock.attach(new ConcreteInvestor("A"));
        stock.attach(new ConcreteInvestor("B"));
        stock.notifyInvestor(98);

//        stock.attach(new ConcreteInvestor("C"));
//        stock.attach(new ConcreteInvestor("D"));
//        stock.notifyInvestor(92);


    }
}
