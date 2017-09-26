package example;

import example.values.CannedWalrusFood;
import example.values.Walrus;

public class FeedsWalrus {

	OpensCan opensCan = new OpensCan();
//TODO fix it immediately
	public void feed(Walrus gary, CannedWalrusFood can) {
		gary.addToStomach(opensCan.open(can));
	}

}
