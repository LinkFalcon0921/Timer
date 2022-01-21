package counts;

import com.Interfaces.Counters.ICounters;

public class Counter implements ICounters{

	private int seg,min;
	
	public Counter(int m,int s) {
		seg = (s >= 0) ? s : 0;
		min = (m > 0) ? m : 0;
	}

	public int getSeg() {
		return seg;
	}

	public int getMin() {
		return min;
	}
	
	public void reduce() {
		
		if(seg == 0) {
			if(min>0) {
				--min;
				seg = 60;
			}
		}
		seg--;
		
	}
	
	public boolean isEnded() {
		return (seg == 0 && min == 0) ? true :false;
	}

	@Override
	public int getMins() {
		return min;
	}

	@Override
	public int getSegs() {
		return seg;
	}
	
	@Override
	public String toString() {
		return String.format("%s:%s",min,seg);
	}
}
