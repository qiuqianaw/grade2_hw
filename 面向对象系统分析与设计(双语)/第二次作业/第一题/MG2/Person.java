package MG2;

/**
 * @author QiuQian
 */
public class Person extends Subject implements Observer, Member {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void beat() {
		System.out.println(name + "受到了攻击\n");
	}

	@Override
	public void action() {
		System.out.println(name + "做出了反应\n");
	}

	@Override
	public void update() {
		System.out.println(name + "收到了通知");
		action();
	}

	@Override
	public void notifyObservers() {
		for ( Observer observer : observerList ) {
			observer.update();
		}
	}
}
