package com.administer;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JLabel;
import javax.swing.JList;

public class AdminCola extends Thread {

	private final Queue<ColaCounters> cola;
	private final AddingColl labels;
	final WaitList list;

	public AdminCola(JList<String> lis,JLabel m, JLabel s) {
		cola = new LinkedList<ColaCounters>();
		labels = new AddingColl(m, s);
		list = new WaitList(lis);
	}

	public void add(int m, int s) {

		ColaCounters u = new ColaCounters(labels);

		u.add(m, s);
		cola.add(u);
		list.add(u.toString());

		if (!isAlive())
			start();
	}

	public void started() {
		try {	
			list.poll();
			cola.peek().start();
			try {
				cola.poll().join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (NullPointerException e) {
			
		}
		
	}

	@Override
	public void run() {
		while (true) {
			started();
		}
	}

}
