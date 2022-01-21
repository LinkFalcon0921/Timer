package com.administer;

import javax.swing.JLabel;

import com.worker.Clockers;

public class ColaCounters extends Thread {
	
	private Clockers colia;
	private final AddingColl elements; 
	
	
	public ColaCounters(JLabel m, JLabel s) {
		elements = new AddingColl(m, s);
	}
	
	public ColaCounters(AddingColl coll) {
		elements = coll;
	}
	
	public void add(int min, int seg) {
		colia = new Clockers(min,seg);
	}
	
	//Hilo
	public void run() {
		
			if(colia != null) {
				 while(!colia.isEnded()) {
					 colia.cont();
					 elements.setMinutos(colia.getMins());
					 elements.setSegundos(colia.getSegs());
					 
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
			}
			}
		}
		 
		 
	 }
	
	@Override
	public String toString() {
		return colia.toString();
	}
//	@Deprecated
//	public void remove(){
//		if(conts.peek().isEnded()) {
//			conts.poll();
//		}
//	}

//	public static void main(String[] args) throws InterruptedException {
//		
//	}
//	
	
	
}
