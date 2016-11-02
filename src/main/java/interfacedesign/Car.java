package interfacedesign;

public abstract class Car {

public abstract String getMarka(String marka);	
public abstract int getModel(int model);

//data alani

private Fren fren;
private Sunroof sunroof;

public void car_brake(){
getFren().brake();	
}

public void car_openSunroof(){	
getSunroof().openSunroof();	
}

public Fren getFren() {
	return fren;
}
public void setFren(Fren fren) {
	this.fren = fren;
}
public Sunroof getSunroof() {
	return sunroof;
}
public void setSunroof(Sunroof sunroof) {
	this.sunroof = sunroof;
}


}
