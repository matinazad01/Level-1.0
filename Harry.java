package duelll;

import javax.swing.JOptionPane;

public class Harry {

	void castSpell(String spell) {

		if (spell == null) {
			System.out.println("Mission Failed! We'll Get 'em Next Time.");
		}else{

			System.out.println("casting spell: " + spell);
		}  while (spell.equals("")) {
			spell = JOptionPane.showInputDialog(null, "Enter a spell please!");
			if (spell == null) {
				System.out.println("Mission Failed! We'll Get 'em Next Time.");}
			System.out.println("casting spell: " + spell);
		}

		
	}

	private boolean cloakOn;

	Harry() {
		System.out.println("making Harry Potter...");
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;

		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {

		// 1. make harry potter
		Harry harryPotter = new Harry();
		// 2. become invisible
		harryPotter.makeInvisible(true);
		// 3. spy on professor snape
		harryPotter.spyOnSnape();
		// 4. become visible again
		harryPotter.makeInvisible(false);
		// 5. cast a “stupefy” spell
		String sp = JOptionPane.showInputDialog(null, "What spell should Harry use");
		harryPotter.castSpell(sp);
	}

}
