package parts;

import java.text.MessageFormat;

public class Headlights {
	
	String status = "off";
	String color = "Bright White";
	
	public String toString() {
		return MessageFormat.format("\nHeadlights are {0}. Light color is {1}.", status, color);
		
	}
	
	public Headlights(String color) {
		this.status = "off";
		this.color = color;
	}
	
	public void switchLights() {
		if(this.status == "off") 
			{ 
				this.status = "on";
			}
		else if(this.status == "on") 
			{
			this.status = "off";
			}
	}
	
}
