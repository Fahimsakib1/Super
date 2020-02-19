package Super_Using_Everything;

public class Vehicle 

{
      
	String Name;
	String Color;
	double Weight;
	
	
	public Vehicle(String name, String color, double weight) 
	{
		
		Name = name;
		Color = color;
		Weight = weight;
	}
	
   public void Show ()
	{
		System.out.println(" Name of the Vehicle Is : " + Name);
		System.out.println(" Color of the Vehicle Is : " + Color);
		System.out.println(" Weight of the Vehicle Is : " + Weight + " Kg");
	}
	
	
}
