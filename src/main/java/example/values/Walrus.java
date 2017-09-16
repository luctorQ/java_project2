package example.values;

import java.util.HashSet;
import java.util.Set;

public class Walrus {
ddd
	private Set<WalrusFood> stomach = new HashSet<WalrusFood>();

	public Boolean hasEaten(WalrusFood food) {
		return stomach.contains(food);
	}

	public void addToStomach(WalrusFood food) {
		stomach.add(food);
	}

}
