package flight;

import java.rmi.RemoteException;

public class ServerTest {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		FlightFactory factory=(FlightFactory) new FlightFactoryImpl();

	      Flight flight1 = factory.getFlight("795");
	      flight1.setOrigin("Shanghai");
	      flight1.setDestination("Beijing");
	      System.out.println("Flight "+flight1.getFlightNumber()+":");
	      System.out.println("From "+flight1.getOrigin()+" to "+
	                                        flight1.getDestination());
	      
	      Flight flight2 = factory.getFlight("795");
	      System.out.println("Flight "+flight2.getFlightNumber()+":");
	      System.out.println("From "+flight2.getOrigin()+" to "+
	                                        flight2.getDestination());
	      System.out.println("flight1是"+flight1.getClass().getName()+"的实例");
	      System.out.println("flight2是"+flight2.getClass().getName()+"的实例");
	      System.out.println("flight1==flight2:"+(flight1==flight2));
	      System.out.println("flight1.equals(flight2):"+(flight1.equals(flight2)));
	}

}
