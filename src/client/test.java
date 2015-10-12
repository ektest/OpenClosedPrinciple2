package client;

import domain.File;
import progress.Progress;

public class test {

	public static void main(String[] args) {
		File file = new File();
	    file.setLength(200);
	    file.setSent(100);
	 
	    Progress progress = new Progress(file);
	    System.out.println(progress.getAsPercent());
	}

}
