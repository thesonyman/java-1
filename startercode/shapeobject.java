//object example in java
package objectexample;

public class shapeobject {
private int sides; //creates side var as an int

public shapeobject(){
	
}
public void setSides(int x){
	this.sides = x; //gets set sides
}

public int getSides(){
	return this.sides; returns the amount of sides
}

public String classify(){
  sides = this.sides; // makes it a little shorter
	if (sides == 0){  //logic
		return "Circle";
	}
	else if (sides < 3){
		return "Not a Shape";
	}
	else if (sides == 4){
		return "Tetragon";
	}
	else if (sides == 5){
		return "Pentagon"; 
	}
	else if (sides == 6){
		return "Hexagon"; 
	}
	else if (sides == 7){
		return "Septagon"; 
	}
	else if (sides == 8){
		return "Octogon"; 
	}
	else if (sides == 9){
		return "Nonagon";
	
	}
	else if (sides == 10){
		return "Decagon";
	
	}
	else if (sides == 11){
		return "Hendecagon";
	
	}
	else if (sides == 12){
		return "Dodecagon";
	
	}
	else if (sides > 12){
		return sides + "-agon";
	
	}
	return "";
}

	public static void main(String[] args) {
	
	shapeobject shape = new shapeobject(); //creates object
	shape.setSides(8); //sets the int of sides
	System.out.print(shape.classify()); // prints resualt of the shapeclassify with x amount of sides
	
}


}
//by thesonyman
