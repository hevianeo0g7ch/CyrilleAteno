package cfranc.kata.yahtzee;

import static org.junit.Assert.*;

import org.junit.Test;

public class YahtzeeTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}


    @Test
    public void chance_scoresSumOfAllDice_15() {
        int expected = 15;
        int actual = Yahtzee.chance(2,3,4,5,1);
        assertEquals(expected, actual);
    }

}
