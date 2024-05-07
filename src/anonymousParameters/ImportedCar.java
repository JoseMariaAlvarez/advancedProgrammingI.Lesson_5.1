package anonymousParameters;

public class ImportedCar extends Car{
	int tax;

	public ImportedCar(String brand, int price, int tax) {
		super(brand, price);
		this.tax = tax;
	}
}


