package observing;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements Observable {
	
	List<Observer> observers = new  ArrayList<>();
	@Override
	public void addObserver(Observer obs) {
		observers.add(obs);

	}

	@Override
	public void removeObserver(Observer obs) {
		observers.remove(obs);

	}

	@Override
	public void notifyObservers() {
		observers.forEach(observer -> observer.update());

	}

}
