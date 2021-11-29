package kj.car.info;

public class GetCars {
	// https://private-anon-57910c7319-carsapi1.apiary-mock.com/cars
	
	private float
		year,
		id,
		horsepower,
		price
	;
		
	private String 
		make,
		model,
		img_url
	;


	// Getter Methods 

	public float getYear() {
		return year;
	}

	public float getId() {
		return id;
	}

	public float getHorsepower() {
		return horsepower;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public float getPrice() {
		return price;
	}

	public String getImg_url() {
		return img_url;
	}

/*	// Setter Methods 

	public void setYear(float year) {
		this.year = year;
	}

	public void setId(float id) {
		this.id = id;
	}

	public void setHorsepower(float horsepower) {
		this.horsepower = horsepower;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
*/
}
