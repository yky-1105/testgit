package service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import data.CellArray;

public class GameServiceTest {

	public static GameService gs=new GameService();
	public static GameService gs2=new GameService();
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testInitMap() {
		CellArray cells=gs.initMap(3,3,0);
		CellArray cells2=gs.initMap(3,3,0);

		assertEquals(cells,cells2);
	}

	@Test
	public void testGenerate() {
		
	}

	@Test
	public void testCountNumber() {
		C
	}

}
