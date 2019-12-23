class Cars {
	// 1 - Slim; 2 - Average; 3 - Long
	static int BODY_TYPE_SLIM = 1;
	static int BODY_TYPE_AVERAGE = 2;
	static int BODY_TYPE_LONG = 3;

	static int ENGINE_TYPE_DISEL = 1;
	static int ENGINE_TYPE_PETROL = 2;
	static int ENGINE_TYPE_GAS = 3;

	public static void main(String[] args) {
		String carBodyType,engineType;

		Car objCar = new Car();
		
		// objCar.setCarBody(2);
		objCar.setCarBody(Cars.BODY_TYPE_LONG);
		objCar.setEngine(1);
		
		carBodyType = objCar.getCarBody();
		engineType = objCar.getEngine();

		System.out.println("Car Body Type: " + carBodyType);
		System.out.println("Car Engine Type: " + engineType);
		objCar.builtCar();


		// System.out.println("Car Built");
		// System.out.println("Car Body Type : " + carBodyType);

	}
}

class Car extends CarBody {

	void builtCar() {
		System.out.println("Car Built");
	}
}

class CarBody extends Engine{
	public String carBodyType;

	void setCarBody(int type) {
		
		if(type == 1) {
			carBodyType = "Slim";
		} else if(type == 2) {
			carBodyType = "Average";
		} else {
			carBodyType = "Long";
		}

	}

	String getCarBody() {
		return carBodyType;
	}

	/*void carBodyTypeSlim() {
		carBodyType = "Slim";
		System.out.println("Car Body Type : " + carBodyType);
	}

	void carBodyTypeAverage() {
		// carBodyType = "Average";
	}

	void carBodyTypeLong() {
		// carBodyType = "Long";
	}*/
}
class Engine {
	public String engineType;

	void setEngine(int type) {
		
		if(type == 1) {
			engineType = "Disel";
		} else if(type == 2) {
			engineType = "Petrol";
		} else {
			engineType = "Gas";
		}

	}

	String getEngine() {
		return engineType;
	}

	/*void carBodyTypeSlim() {
		carBodyType = "Slim";
		System.out.println("Car Body Type : " + carBodyType);
	}

	void carBodyTypeAverage() {
		// carBodyType = "Average";
	}

	void carBodyTypeLong() {
		// carBodyType = "Long";
	}*/
}