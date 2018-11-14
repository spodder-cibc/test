/**
 * The <code> Javadoc </code> 
 * @author sushil
 * @version 1.0
 * 
 */
public class Javadoc {
	private String make;
	private int year;
	private int milage;

	/**
	 * This constructs a car with
	 * 
	 * @param make
	 *            the make of the car
	 * @param year
	 * @param milage
	 */
	public Javadoc(String make, int year, int milage) {
		super();
		this.make = make;
		this.year = year;
		this.milage = milage;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * 
	 * @return year
	 */
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public static void main(String[] args) {
		Javadoc javadoc = new Javadoc("Toyota", 1, 1990);
		int x = 12;
		int y = 34;
		
		if (x > y) {

		}
	}

}