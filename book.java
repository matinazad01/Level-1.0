import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
 import javax.swing.JFrame;
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/



public class book extends MouseAdapter {

	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want to get out of the
	 * static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		book illusions = new book();
		illusions.createBook();
	}

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
JFrame jf = new JFrame();
int w = 500;
int l = 500;
	private void createBook() {
		// 2. make the frame visible
		jf.setVisible(true);
		// 3. set the size of the frame
		jf.setSize(w, l);
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String ill1 = "ill1.jpg";
		
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		JLabel jlbl;
		// 7. use the "loadImage..." methods below to initialize your JLabel
		
		jlbl = loadImageFromComputer(ill1);
	
		// 8. add your JLabel to the frame
		jf.add(jlbl);
		
		// 9. call the pack() method on the frame
		jf.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		jf.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("Clicked!");
		// 12. remove everything from the frame that was added earlier
		jf.removeAll();
		// 13. load a new image like before (this is more than one line of code)
		String ill2 = "ill2.jpg";
		JLabel jbj;
		jbj = loadImageFromComputer(ill2);
		jf.add(jbj);
		// 14. pack the frame
		jf.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
