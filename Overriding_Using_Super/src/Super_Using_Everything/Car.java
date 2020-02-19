package Super_Using_Everything;

public class Car extends Vehicle
{
      int Gear;
      double Price;
      
      
	    public Car(String name, String color, double weight, int gear, double price) 
	    {
	    	
		super(name, color, weight);
		Gear = gear;
		Price = price;
		
	    }
	    
	    public void Show ()
		{    
	    	super.Show();
			System.out.println(" Gear of the Vehicle Is : " + Gear + "th");
			System.out.println(" Price of the Vehicle Is : " + Price + " Taka");
			
		}
      
      
}
