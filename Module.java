import java.util.Scanner;

class Module{

	public static void main(String args[]){

		int value,total=0,twonum,fnum,snum,tnum;
		
		Scanner obj=new Scanner(System.in);

		value=obj.nextInt();

		twonum=value%100;	
		fnum=value/100;		
		tnum=twonum%10;		
		snum=twonum/10;		

		// tnum=value%10;
		// fnum=twonum/10;
		// tnum=twonum%10;
		// snum=twonum/10;
	
		total=(fnum*fnum*fnum)+(snum*snum*snum)+(tnum*tnum*tnum);

		System.out.println("Fisrst number :"+fnum);
		System.out.println("Second number :"+snum);
		System.out.println("Third number :"+tnum);
		System.out.println(total);

		if(value==total)
			System.out.println("Enetered value is armstrong");
		else
			System.out.print("entered value is not an armstrong");

		
	}
}