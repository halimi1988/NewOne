package p;

public class Practice {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		byte ppo = 84;
		short i = 3546;
		double a;
		double e = 3;
		long aa = 45654L;
		float p = 66545455.2f;
		double kp = 4545465.21;
		char add = 'a', akf = 'F';
		boolean aad = false;
		double io = 0.0 / 0.0;
		String iii;
		int o = 8 + 55;

		a = 95;
		
			System.out.println("Out of Range");
			if (a >= 90 && a <= 100) {
				if (a >= 95 && a <= 100) {
					System.out.println("you kill it A++");
				} else {
					System.out.println("You got A");
				}
			} else if (a >= 80 && a <= 89) {
				if (a >= 85 && a <= 89) {
					System.out.println("you kill it B++");
				} else {
					System.out.println("You got B");
				}
			
		} else {
			System.out.println("You F");
		}
			
		
			int y =15;
			while (y < 18) {System.out.println("no access be"+y+"age");++y ;}
			{System.out.println("No you good"+ y);}
				
			int b = 0;
			
			for (int ii = 0; ii <= 2; ++ii) {System.out.println(b++);}
			for (int ii = 3; ii >= 0; ii--) {System.out.println(b--);}
			
			boolean test = false;
			int age = 63;
			
			{while (!test) {System.out.println("your not eligable age for reterment"+ age);
			++age;
			
			if (age >= 65) {
				test = true;
				System.out.println("your good eligble age for reterment "+ age);
			}
			}}
			
			{
			
		
			String [][] Arr = new String [2][5];
			
			Arr [0][1]= "Abdullahh";
			Arr [0][2]= "Halimii";
			Arr [1][0]= "Wardak";
			Arr [1][1]= "Jani";
			Arr [1][2]= "Abdullah";
			
			
			for (int ab = 0; ab < Arr.length; ab++) 
					for (int c = 0; c < Arr[ab].length; c++)  
				{System.out.println(Arr[ab][c]);}
			
			
			}
			
			
			// Pulimdram 
		/*	
			String plam = "moim";
			int lon = plam.length()-1;
			String rev = "";
			
			for (int plu = lon ; plu >= 0; plu--) {
				//System.out.print(plam.charAt(plu));
			
				rev = rev +plam.charAt(plu);
					}
			System.out.println(rev);
			
			if (plam.equals(rev)) {System.out.println(plam+"It is p");}
			else {System.out.println(plam+"It is Noott p");}
			*/
			Practice.Plandram("moooooooooooooooomi");
			
			int num = 1221;
			int temp =num;
			int reminder= 0;
			int s = 0;
			while (num >0) {
				
				reminder = num %10;
				num=num/10;
				s = s*10 +reminder;}
			if (temp == reminder) {System.out.println("Tr");} else {System.out.println("NOTR");}
				
			
			
			String Abu = "WoWe";
			StringBuffer abb = new StringBuffer(Abu);
			StringBuffer jp = abb.reverse();
			System.out.println(abb.reverse());
			
			if (Abu.equals(abb.reverse()))
			{System.out.println("It is pla");}
			else {System.out.println("It is not");}
			System.out.println(jp);
			
			}
			
			
			
	

public static void Plandram (String x) {
	
	String plam = x;
	int lon = plam.length()-1;
	String rev = "";
	
	for (int plu = lon ; plu >= 0; plu--) {
		//System.out.print(plam.charAt(plu));
	
		rev = rev +plam.charAt(plu);
			}
	System.out.println(rev);
	
	if (plam.equals(rev)) {System.out.println(plam+"It is p");}
	else {System.out.println(plam+"It is Noott p");}
	
	
}

}
			
			
			
			
			
			
			
			
			
			
	


