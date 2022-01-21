package com.administer;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;


public class WaitList {	
	
	private Queue<String> tep;
	private final JList<String> link;
	
	public WaitList(JList<String> ele) {
		tep  = new LinkedList<>();
		link = ele;
	}
	
	public void add(String rnew) {
		if(!rnew.equals("0:0")) {
			tep.add( rnew );
			make();
		}
	}
	
	public void poll() {
		tep.poll();
		make();
	}
	
	public void make() {
		link.setModel(applyL());
	}
	
	
	private ListModel<String> applyL(){
		DefaultListModel<String> list = new DefaultListModel<>();
		
		for(String h : tep) {
			list.addElement(h);
		}
		
		return list;
	}
}
