package data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CellArrayTest {
	public static CellArray at = new CellArray(40,40);

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testGetRow() {
		at.getRow();
	}

	@Test
	public void testSetRow() {
		at.setRow(60);
	}

	@Test
	public void testGetCol() {
		at.getCol();
	}

	@Test
	public void testSetCol() {
		at.setCol(60);
	}

	@Test
	public void testGetCell() {
		at.getCell(5, 5);
	}

	@Test
	public void testSetCell() {
		at.setCell(32,32, 1);
	}

}
