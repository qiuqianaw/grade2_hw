package MG2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author QiuQian
 */
public abstract class Subject {

	protected List<Observer> observerList = new ArrayList<>();

	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	public void deleteObserver(Observer observer) {
		observerList.remove(observer);
	}

	public void notifyObservers() {

	}

}
