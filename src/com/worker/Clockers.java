package com.worker;

import com.Interfaces.Counters.ICounters;

import counts.Counter;

public class Clockers {
	ICounters conter;
	
	public Clockers(int min,int seg) {
		conter = new Counter(min, seg);
	}
	
	public void cont() {
		conter.reduce();
	}
	
	public int getMins() {
		return conter.getMins();
	}
	
	public int getSegs() {
		return conter.getSegs();
	}
	
	public boolean isEnded() {
		return conter.isEnded();
	}
	
	@Override
	public String toString() {
		return conter.toString();
	}
	
}

