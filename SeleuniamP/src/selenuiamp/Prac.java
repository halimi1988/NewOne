package selenuiamp;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Prac {
public static void main (String []arge) {
	
	
	
	
	String o = "rtrtrtrrtrrappppppppfklsdajfjsdakfjklsaj";
	
	Count(o);
	

	System.out.println(Count(o));
	System.out.println(Chow("abdulla", 'a'));
	
	int jaja = 5;
	//System.out.println);
	String abd = "ab";
	String abe = new String("ab");
	
	System.out.println(abd.hashCode());
	System.out.println(abe.hashCode());
  
}// Mean method end 


public static int Count (String st) {
	int c =0;
	for (int i =0; i <st.length(); i++) {
		
		c++;}

	return c;
}




public static int Chow(String st, char a) {
	
	int countc=0;
	for (int i =0; i <st.length(); i++) {
		if (st.charAt(i)== a) {
			countc++;
			System.out.println(st + countc);
			
		}
	}
	
	
	
	return  countc;
}


}
	






