package MG2;

/**
 * @author QiuQian
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("A");

        person.registerObserver(new Person("B1"));
        person.registerObserver(new Person("B2"));
        person.registerObserver(new Person("B3"));

        person.beat();
        person.notifyObservers();
    }
}
