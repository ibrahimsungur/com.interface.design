package interfacedesign;

public class Civic extends Car{

	@Override
	public String getMarka(String marka) {
System.out.println(marka);
		return marka;
	}

	@Override
	public int getModel(int model) {
	System.out.println(model);
		return model;
	}

}
