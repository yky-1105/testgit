package lifeGame;

import static org.junit.Assert.*;

import javax.swing.JButton;

import org.junit.Before;
import org.junit.Test;

public class MainTest {
	private JButton[][] btnss;
	private String[] args;
	
	public static Main main = new Main("title");

	@Before
	public void setUp() throws Exception {
	}
	

	@Test
	public void testInitGUI() {
		main.initGUI();
	}

	@Test
	public void testInitMap() {
		int r=60;
		int c=60;
		btnss = new JButton[r][c];
		main.initMap(btnss);
	}

	@Test
	public void testGenerate() {
		int r=60;
		int c=60;
		btnss = new JButton[r][c];
		main.generate(btnss);
	}

	@Test
	public void testMain1() {
		main.main(args);
	}

}
