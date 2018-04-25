// first we import all of the classes we will use
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.BorderFactory;

/**
* This demo creates a telephone keyboard of buttons.
*/
public class Menu{
	public static void main(String[] args){
		//JFrame frame = new JFrame("Virtual Piano + Other Things");
    JFrame window = new JFrame("A Server's ordering tool");
		JPanel content = new JPanel();
		JButton food1 = new JButton("Garlic bread $1");
		JButton food2 = new JButton("Soup of the day $2");
		JButton food3 = new JButton("Tuna melt $3");
		JButton food4 = new JButton("Hot dog $4");
		JButton food5 = new JButton("Hamburger $5");
		JButton food6 = new JButton("Two-patty burger $6");
		JButton food7 = new JButton("Fish and chips $7");
		JButton food8 = new JButton("Personal pizza $8");
		JButton food9 = new JButton("12 pieces of fried chicken $9");
		JButton food10 = new JButton("Medium pizza $10");
		JButton food11 = new JButton("Large pizza $11");
		JButton food12 = new JButton("BLT Deluxe $12");
		JButton calculate = new JButton("Calculate");
		JLabel answer = new JLabel("<html><h1>Total Amount Due: $10</h1></html>");

		JTextField nameField = new JTextField("Tim");
		JTextField numberField = new JTextField("781-736-2706");

		content.setLayout(new BorderLayout());

		JLabel label1 = new JLabel("<html><h1>CoSi 12B Restaurant</h1></html>");
		label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		content.add(label1,BorderLayout.PAGE_START);

		JComboBox cb = new JComboBox();
				cb.setEditable(false);
				cb.addItem("Dine-In");
				cb.addItem("Take-Out");
			/*	cb.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent event) {
								JComboBox cb = (JComboBox) event.getSource();
								Object selected = cb.getSelectedItem();
								if(selected.toString().equals("blue")){
									drawWidget1.drawingColor = Color.BLUE;
								}else if(selected.toString().equals("red")){
									drawWidget1.drawingColor = Color.RED;
						}
				});*/

		JPanel input = new JPanel();
		input.setLayout(new GridLayout(0,3));
		input.add(new JLabel(""));input.add(cb);input.add(new JLabel(""));
		input.add(food1);input.add(food2);input.add(food3);
		input.add(food4);input.add(food5);input.add(food6);
		input.add(food7);input.add(food8);input.add(food9);
		input.add(food10);input.add(food11);input.add(food12);
		input.add(calculate);input.add(answer);input.add(new JLabel(""));
		input.add(new JLabel("Signature:"));
		content.add(input,BorderLayout.CENTER);

		//JPanel signature = new JPanel();
		MouseDrawDemo drawWidget1 = new MouseDrawDemo();
		drawWidget1.drawingColor = Color.BLUE;
		//JButton clear = new JButton("Clear");
		//bottom.add(new JLabel("<html><h1>Draw your musical mascot!</h1></html>"),BorderLayout.LINE_START);
		//bottom.setLayout(new GridLayout(1,2));
		//rightSide.setLayout(new GridLayout(2,0));
		//bottom.add(drawWidget1, BorderLayout.CENTER);
		//rightSide.add(clear,BorderLayout.CENTER);
		drawWidget1.setPreferredSize(new Dimension(300,100));
		content.add(drawWidget1,BorderLayout.PAGE_END);

		ActionListener clickSound = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == food1) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/click.wav").getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        }catch(Exception x) { x.printStackTrace(); }
                    }
                    else if (e.getSource() == food2) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/click.wav").getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        }catch(Exception x) { x.printStackTrace(); }
                    }
                    else if (e.getSource() == food3) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/click.wav").getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        }catch(Exception x) { x.printStackTrace(); }
                    }
                    else if (e.getSource() == food4) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/click.wav").getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        } catch(Exception x) { x.printStackTrace(); }
                    }
                    else if (e.getSource() == food5) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/click.wav").getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        } catch(Exception x) { x.printStackTrace(); }
                    }
										else if (e.getSource() == food6) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/click.wav").getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        }catch(Exception x) { x.printStackTrace(); }
                    }
                    else if (e.getSource() == food7) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/click.wav").getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        } catch(Exception x) { x.printStackTrace(); }
                    }
                    else if (e.getSource() == food8) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/click.wav").getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        } catch(Exception x) { x.printStackTrace(); }
                    }
										else if (e.getSource() == food9) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/click.wav").getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        } catch(Exception x) { x.printStackTrace(); }
                    }
										else if (e.getSource() == food10) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/click.wav").getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        } catch(Exception x) { x.printStackTrace(); }
                    }
                    else if (e.getSource() == food11) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/click.wav").getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        } catch(Exception x) { x.printStackTrace(); }
                    }
										else if (e.getSource() == food12) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/click.wav").getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        } catch(Exception x) { x.printStackTrace(); }
                    }
										else if (e.getSource() == calculate) {
                        try {
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/click.wav").getAbsoluteFile());
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                        } catch(Exception x) { x.printStackTrace(); }
                    }
                }
            };
            // Register buttons to listener
            food1.addActionListener(clickSound);
            food2.addActionListener(clickSound);
            food3.addActionListener(clickSound);
            food4.addActionListener(clickSound);
            food5.addActionListener(clickSound);
						food6.addActionListener(clickSound);
            food7.addActionListener(clickSound);
            food8.addActionListener(clickSound);
						food9.addActionListener(clickSound);
						food10.addActionListener(clickSound);
            food11.addActionListener(clickSound);
						food12.addActionListener(clickSound);
						calculate.addActionListener(clickSound);

		//content.add(answerL,BorderLayout.PAGE_END);

		// add functionality
		/*clearB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				mealCostTF.setText("");
				taxRateTF.setText("");
				tipRateTF.setText("");
			}
		});

    save.addActionListener(new ActionListener(){
    			public void actionPerformed(ActionEvent event){
    				String mealCostText = mealCostTF.getText();
    				String taxRateText = taxRateTF.getText();
    				String tipRateText = tipRateTF.getText();
    				double mealCost = Double.parseDouble(mealCostText);
    				double taxRate = Double.parseDouble(taxRateText);
    				double tipRate = Double.parseDouble(tipRateText);
    				double tip = mealCost*(tipRate/100);
    				double tax = mealCost*(taxRate/100);
    				double total = mealCost+tip+tax;
    				String response = "Your tip is "+tip+" and your tax is "+tax+" and your meal cost is "+mealCost+" and your total is "+total;
    				//answerL.setText(response);
    			}
    		});*/


		window.setContentPane(content);
		window.pack();
		//window.setSize(250,300);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
