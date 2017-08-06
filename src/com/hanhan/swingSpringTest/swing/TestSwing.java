package com.hanhan.swingSpringTest.swing;

import javax.swing.JFrame;

import org.springframework.stereotype.Component;
@Component
public class TestSwing extends JFrame{
	public TestSwing(){
		this.setSize(400,300);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
