package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.File;
import progress.Progress;

public class testProgress {

	@Test
	public void test() {
		File file = new File();
	    file.setLength(200);
	    file.setSent(100);
	    Progress progress = new Progress(file);
		assertEquals(50, progress.getAsPercent());
	}

}
