// Sample for method,Global variables

class Method{

	public int number;

	public static void main(String args[]) {

		Method obj = new Method();

		obj.someFunction();

		// int num = obj.valFun();
		// System.out.println(num);

		obj.glFun(15);

		obj.printGlValue();

	}

	public void someFunction() {
		System.out.println("Some Function");
	}

	public int valFun() {
		return 10;
	}

	public void glFun(int number) {
		this.number = number;
	}

	public void printGlValue() {
		System.out.println(this.number);
	}

}