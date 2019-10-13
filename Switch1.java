// import java.lang.Math;

class Switch1{
	public static void main(String args[]){
		
		int a = 53;

		/*if(a > 10) {
			System.out.println("A is > 10");
		}

		if(a > 5) {
			System.out.println("A is > 5");
		}

		if(a < 5) {
			System.out.println("A is < 5");
		}*/

		switch(a) {
			case 10:
				System.out.println("A is > 10");
				break;
			case 5:
				System.out.println("A is > 5");
				break;
			default:
				System.out.println("in default");
				break;
		}

	}
}