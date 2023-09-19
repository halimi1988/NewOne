package selenuiamp;

public class P {

	public static void main(String[] args) {
		
		
		String a = "Abdullah";
		String b = "Halimi";
		
		
		a = a+b;
		System.out.println(a);
		b = a.substring(0,(a).length()- b.length());
		System.out.println(b);
		a = a.substring(b.length());
		System.out.println(a);
	
	int ab = 10;
	int bb = 5;
	
	ab = ab +bb;     // 15
	bb = ab -bb;     // 15 -5 = 10 
	ab = ab - bb;    // 15-10
	
	System.out.println(ab +" "+ bb);
	
	
	
	
	
	
	
	int t = 100;
	int y = 200;
	
	t = t+y;  // 100 + 200 t = 300
	
	System.out.println(t);
	y = t-y;  // 300-200   y=100
	System.out.println(y);
	t = t-y;  // 300 - 100  t 200
	
	System.out.println("t"+t+ " "+ y);
		
	
	
	String i = "abdullah";
	String r = "halimi";
	
	i = i+r;
	System.out.println(i);
	
	r = i.substring(0, i.length()- r.length());
	 System.out.println(r);
	 
	i = i.substring(r.length());
	System.out.println(i);
	
	int yy = 10;
	int zz = 10;
	
	String j = "Ab";
	String jj = "Ab";
	String jjj = new String ("Ab");
	
	if (yy ==zz) {System.out.println("Equl");}else {System.out.println("not");}
	
	// we can use the equle option with pramitive date typeif (yy.) {System.out.println("E");}else {System.out.println("n");}
	if (jj ==j) {System.out.println("Equl");}else {System.out.println("not");}
	if (jjj ==j) {System.out.println("Equl");}else {System.out.println("not");}
	if (jjj.equals(j)) {System.out.println("Equl");}else {System.out.println("not");}
	//the equal check the value of it 
	// == assing me check the referecnac of it
	// 
	/*
	String bbi = "Jamal";
	int ha = 65;
	
	String oo = "123";
 
	
	ha=Integer.parseInt(oo);
	System.out.println(ha); */
	
	String ja = "Abdullah";
	
	
		for (int ii = 0; ii<70; ii++) {
			
			
		}
	double jjjj = 4;
		double p = jjjj/5;
		System.out.println(p);
	
	}

}
