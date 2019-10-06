package models;

import java.util.List;
import java.util.ArrayList;

public abstract class Combination {
	
	private static final int WIDTH = 4;

	protected List<Color> colors;
	
	protected Combination (){
		this.colors = new ArrayList<Color>();
	}
	
	public static int getWidth() {
		return Combination.WIDTH;
	}
	
	public List<Color> getCombination() {
		return this.colors;
	}
	
}
