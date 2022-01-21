package com.administer;

import javax.swing.JLabel;

public class AddingColl {
	final private JLabel min;
	final private JLabel seg;
	
	public AddingColl(JLabel m, JLabel s) {
		min = m;
		seg = s;
	}
	
	public void setMinutos(int in) {
		min.setText( String.valueOf( in) );
	}
	
	public void setSegundos(int in) {
		seg.setText( String.valueOf( in ) );
	}
	
}
