package progress;

import domain.IMesaurable;

public class Progress {

	private IMesaurable progressBar;

	public Progress(IMesaurable progressBar) {
		this.progressBar = progressBar;
	}

	public int getAsPercent() {
		return (int) this.progressBar.getSent() * 100 / progressBar.getLength();
	}
}
