import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class Deck 
{
	private Deque<City> cards;
	private Deque<City> discards;
	
	public Deck() {
		cards = new ArrayDeque<City>(Arrays.asList(City.values()));
		discards = new ArrayDeque<City>();
	}
	
	public void infect() {
		
	}
}
