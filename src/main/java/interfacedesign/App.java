package interfacedesign;

public class App {

	public static void main(String[] args) {
Car kartal=new Kartal();
Car civic=new Civic();

kartal.getMarka("Kartal");
kartal.setFren(new FrenImp());
kartal.car_brake();


System.out.println("********************************");

civic.getMarka("Civic");
civic.setFren(new FrenABSImp());
civic.car_brake();
civic.setSunroof(new SunroofImp());
civic.car_openSunroof();
		
	}

}
