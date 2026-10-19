import java.util.ArrayList;
import java.util.List;

import observing.Observable;
import observing.Observer;

public class SportvereineControl implements Observable {

	List<Observer> observers = new ArrayList<>();
	private SportvereineModel sportvereineModel;
	private SportvereineView sportvereineView;

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

	public SportvereineControl() {
		this.sportvereineModel = new SportvereineModel();
		this.sportvereineView = new SportvereineView(this.sportvereineModel, this);
	}

	public void fuelleSportvereine() {
		this.sportvereineModel.fuelleSportvereine();
		this.notifyObservers();
	}

	public void zeigeSportvereineAn() {
		this.sportvereineView.zeigeSportvereineAn();
	}

	public void gibAttributeInKosoleAus() {
		Sportverein sp1 = new Sportverein("Mustersportverein1", 654321, 500000);
		NachhaltigerSportverein sp2 = new NachhaltigerSportverein("Mustersportverein2", 123456, 120000, true, true);
		
		SportvereinKonsole<Sportverein> sp1Konsole = new SportvereinKonsole<Sportverein>(sp1);
		SportvereinKonsole<Sportverein> sp2Konsole = new SportvereinKonsole<Sportverein>(sp2);
		
		sp1Konsole.gibAttributeInKonsoleAus();
		sp2Konsole.gibAttributeInKonsoleAus();
	}
}
