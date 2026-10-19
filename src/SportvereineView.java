import javax.swing.JOptionPane;

import observing.Observer;

public class SportvereineView implements Observer {

	@Override
	public void update() {
		this.zeigeSportvereineAn();
	}

	SportvereineModel sportvereineModel;
	SportvereineControl sportvereineControl;

	public SportvereineView(SportvereineModel sportvereineModel, SportvereineControl sportvereineControl) {
		this.sportvereineModel = sportvereineModel;
		this.sportvereineControl = sportvereineControl;
		this.sportvereineControl.addObserver(this);
	}

	public void zeigeSportvereineAn() {
		JOptionPane.showMessageDialog(null, this.sportvereineModel.gibSportvereineAus());
	}
}
