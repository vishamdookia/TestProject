package myfirstjavaprogram;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		// This is a single-line comment
		/* This is 
		 * a multi-line comment
		 */
		String name = "John";
		System.out.println(name);

		int myNum = 15;
		System.out.println(myNum);

		char myLetter = 'D';
		System.out.println(myLetter);

		boolean myBool = true;
		System.out.println(myBool);

		String name2 = "Visham";
		System.out.println("Hello" +" "+ name2);

		int x = 5;
		int y = 10;
		System.out.println(x+y);

		int a = 2, b = 3, c = 4;
		System.out.println(a+b+c);

		int myint = 5;
		double mydouble = myint;
		System.out.println(myint);
		System.out.println(mydouble);

		double mydoub = 9.75;
		int myt = (int)mydoub;
		System.out.println(mydoub);
		System.out.println(myt);

		int n = 50 + 100;
		System.out.println(n);

		int m = 50;
		++m;
		System.out.println(m);

		int p = 50;
		--p;
		System.out.println(p);

		int r = 30;
		int t = 20;
		System.out.println(r==t);

		String txt = "ABCDEGGHI";
		System.out.println("The length of txt is:" +txt.length());

		String txt1 = "AbCdEf";
		System.out.println(txt.toUpperCase());

		String txt2 = "AbCdEf";
		System.out.println(txt2.toLowerCase());

		String txt3 = "Visham";
		System.out.println(txt3.indexOf("ham"));

		String firstname = "Visham";
		String lastname = "Dookia";
		System.out.println(firstname + " " + lastname);
		System.out.println(firstname.concat(lastname));

		String q = "My motto in life is \"Live and Let live\"";
		System.out.println(q);

		String u = "Hello\nWorld!";
		System.out.println(u);

		int l = 50;
		int o = 40;
		int e = 64;
		int k = -4 ;
		System.out.println(Math.max(l,o));
		System.out.println(Math.min(l, o));
		System.out.println(Math.sqrt(e));
		System.out.println(Math.abs(k));

		int s = 40;
		int j = 10;

		System.out.println( s > j);

		if (s > j) {
			System.out.println("s is greater than j");
		}



		if (s < j) {
			System.out.println("s is greater than j");
		}
		else {
			System.out.println("s is less than j");
		}



		int time = 22;
		if (time < 10) {
			System.out.println("Good Morning");
		}
		else if (time < 20) {
			System.out.println("Good day");
		}
		else {
			System.out.println("Good Evening");
		}



		int day = 4;
		switch(day) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Happy Weekend");

		}
		
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}


	
		int f = 0;
		do {
			System.out.println(f);
			f++;
		}
		while (f < 5);

		
		for (int s1 = 0; s1 < 10; s1++) {
			System.out.println(s1);
		}

		
		for (int s2 = 0; s2 < 10; s2++) {
			if (s2 == 5) {
				break;
			}
			System.out.println(s2);
		}
		
		
		for (int s2 = 0; s2 < 10; s2++) {
			if (s2 == 5) {
				continue;
			}
			System.out.println(s2);
		}
		
		
		int a1 = 0;
		while (a1 < 10) {
			System.out.println(a1);
			a1++;
		if (a1 == 5) {
			break;
		}
		}

		
		String[] cars = {"volvo", "bmw", "toyota", "honda", "mazda"};
		System.out.println(cars[0]);
		
		int[] x2 = {10, 20, 30, 40, 50};
		System.out.println(x2[3]);
		
		
		
		
		

		





	}

}
;
