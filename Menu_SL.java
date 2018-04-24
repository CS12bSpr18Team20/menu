// first we import all of the classes we will use
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.*;
import javax.sound.sampled.*;
import javax.swing.BorderFactory;

/**
* This demo creates .......
*/
public class Menu_SL{
	public static void main(String[] args){
    //Create a TreeMap for menu and a TreeMap for customer order
		//Menu TreeMap: key - food name; value - unit price
		//Order TreeMap: key - food name; value - amount ordered
		TreeMap<String,Integer> menu = new TreeMap<String,Integer>();
		TreeMap<String,Integer> order;
		//Load data from order.txt
		order = readMapFromFile("order.txt");

		//Fill out the Menu TreeMap
		for(int i=1; i<13; i++){
			menu.put("food"+i, i);
		}

//---------------------Stuff added by Sophie(above)----------------------------
//Create GUI Components
    JFrame window = new JFrame("A Server's ordering tool");
		JPanel content = new JPanel();
		JButton food1 = new JButton("food1 $1");
		JButton food2 = new JButton("food2 $2");
		JButton food3 = new JButton("food3 $3");
		JButton food4 = new JButton("food4 $4");
		JButton food5 = new JButton("food5 $5");
		JButton food6 = new JButton("food6 $6");
		JButton food7 = new JButton("food7 $7");
		JButton food8 = new JButton("food8 $8");
		JButton food9 = new JButton("food9 $9");
		JButton food10 = new JButton("food10 $10");
		JButton food11 = new JButton("food11 $11");
		JButton food12 = new JButton("food12 $12");
		JButton calculate = new JButton("Calculate & Print");
		JButton clear = new JButton("Clear");
		JLabel answer = new JLabel("<html><h1>Total Amount Due: $0.00</h1></html>");

		content.setLayout(new BorderLayout());

		JLabel label1 = new JLabel("<html><h1>COSI 12B Restaurant</h1></html>");
		label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		content.add(label1,BorderLayout.PAGE_START);

		JComboBox cb = new JComboBox();
				cb.setEditable(false);
				cb.addItem("Dine-In");
				cb.addItem("Take-Out");


		JPanel input = new JPanel();
		input.setLayout(new GridLayout(0,3));
		input.add(new JLabel(""));input.add(cb);input.add(new JLabel(""));
		input.add(food1);input.add(food2);input.add(food3);
		input.add(food4);input.add(food5);input.add(food6);
		input.add(food7);input.add(food8);input.add(food9);
		input.add(food10);input.add(food11);input.add(food12);
		input.add(calculate);input.add(answer);input.add(clear);
		input.add(new JLabel("Signature:"));
		content.add(input,BorderLayout.CENTER);

		//Add signature area
		MouseDrawDemo drawWidget1 = new MouseDrawDemo();
		drawWidget1.drawingColor = Color.BLUE;

		drawWidget1.setPreferredSize(new Dimension(300,100));
		content.add(drawWidget1,BorderLayout.PAGE_END);

 		//Add functionality
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
										else if (e.getSource() == clear) {
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
						clear.addActionListener(clickSound);

//-------------------------Stuff added by Sophie(below)--------------------------------
            /**
            Fill out the Order TreeMap by clicking on buttons 1-12
						NOTE: (The following code for JButton 1-12 is too redundant...
						But I don't know how to simplify them...)
						*/
						food1.addActionListener(new ActionListener(){
				      public void actionPerformed(ActionEvent e){
								Integer amount = order.get("food1");
								if (amount==null) {
									order.put("food1",1);
								} else {
									order.put("food1",amount+1);
								}
				      }
				    });
						food2.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								Integer amount = order.get("food2");
								if (amount==null) {
									order.put("food2",1);
								} else {
									order.put("food2",amount+1);
								}
							}
						});
						food3.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								Integer amount = order.get("food3");
								if (amount==null) {
									order.put("food3",1);
								} else {
									order.put("food3",amount+1);
								}
							}
						});
						food4.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								Integer amount = order.get("food4");
								if (amount==null) {
									order.put("food4",1);
								} else {
									order.put("food4",amount+1);
								}
							}
						});
						food5.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								Integer amount = order.get("food5");
								if (amount==null) {
									order.put("food5",1);
								} else {
									order.put("food5",amount+1);
								}
							}
						});
						food6.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								Integer amount = order.get("food6");
								if (amount==null) {
									order.put("food6",1);
								} else {
									order.put("food6",amount+1);
								}
							}
						});
						food7.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								Integer amount = order.get("food7");
								if (amount==null) {
									order.put("food7",1);
								} else {
									order.put("food7",amount+1);
								}
							}
						});
						food8.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								Integer amount = order.get("food8");
								if (amount==null) {
									order.put("food8",1);
								} else {
									order.put("food8",amount+1);
								}
							}
						});
						food9.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								Integer amount = order.get("food9");
								if (amount==null) {
									order.put("food9",1);
								} else {
									order.put("food9",amount+1);
								}
							}
						});
						food10.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								Integer amount = order.get("food10");
								if (amount==null) {
									order.put("food10",1);
								} else {
									order.put("food10",amount+1);
								}
							}
						});
						food11.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								Integer amount = order.get("food11");
								if (amount==null) {
									order.put("food11",1);
								} else {
									order.put("food11",amount+1);
								}
							}
						});
						food12.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								Integer amount = order.get("food12");
								if (amount==null) {
									order.put("food12",1);
								} else {
									order.put("food12",amount+1);
								}
							}
						});


            //NOTE: CRITICAL functionalities!!
						//Calculate total price for the meal and print the customer order
						//to order.txt
						calculate.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								int total = 0;
								Set<String> orderKeys = order.keySet();
								for(String foodName: orderKeys){
									total += menu.get(foodName)*order.get(foodName);
								}
								answer.setText("<html><h1>Total Amount Due: $"+total+"</h1></html>");
								writeMapToFile(order,"order.txt");
							}
						});

						//Empty the Order TreeMap and print the emptied order to order.txt
						clear.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								order.clear();
								answer.setText("<html><h1>Total Amount Due: $0.00</h1></html>");
								writeMapToFile(order,"order.txt");
							}
						});



		window.setContentPane(content);
		window.pack();
		window.setLocation(100,100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	public static void writeMapToFile(TreeMap<String,Integer>d,String filename){
		try {
			PrintWriter writer = new PrintWriter(filename, "UTF-8");
			writer.println("Customer Order\n");
			writer.println("Food name|Amount");
			Set<String> keys = d.keySet();
			for(String foodName: keys){
				writer.println(foodName+"|"+d.get(foodName));
			}
			writer.close();
		} catch (Exception e){
			System.out.println("Problem writing to file: "+e);
		}
	}

	public static TreeMap<String,Integer> readMapFromFile(String filename){
			TreeMap<String,Integer> d = new TreeMap<String,Integer>();
			try{
				File file = new File(filename);
				Scanner scanner = new Scanner(file);
				scanner.nextLine();
				scanner.nextLine();
				scanner.nextLine();
				while (scanner.hasNext()){
					String line = scanner.nextLine();
					int delimiter = line.indexOf("|");
					String key = line.substring(0,delimiter);
					Integer value = Integer.parseInt(line.substring(delimiter+1));
					d.put(key,value);
				}
				scanner.close();
			} catch (FileNotFoundException e){
				System.out.println("Problem reading map from file "+e);
			}
			return d;
	}
}


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
