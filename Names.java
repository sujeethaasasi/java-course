class Names{
	public static void main(String args[]){
		String phone = "+919876543210";
		String name1 = "Ram";
		String name2 = " Kumar";
		String fullname = "";

		System.out.println("Phone Number : " + phone);
		System.out.println("Phone Location : " + phone.charAt(7));
		System.out.println("Phone Location : " + phone.substring(3, 5));
		System.out.println("Phone Location : " + phone.length());
		
		System.out.println("Name : " + name1);
		
		fullname = name1.concat(name2.trim());
		System.out.println("Name : " + fullname);


	}
}