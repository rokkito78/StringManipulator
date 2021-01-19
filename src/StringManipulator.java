
public class StringManipulator {
	 public  String stringManipulator(){
		String hola = (" Hola ".trim().concat(" Mundo"));

		char letter = 'n';
		int a =("Coding".indexOf(letter));
		int b =("Hola Mundo".indexOf(letter));
		int c = ("Saludar".indexOf(letter));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);	


		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		int X = (word.indexOf(subString) );
		int Y = (word.indexOf(notSubString));
		System.out.println(X);
		System.out.println(Y); 

		String con = ("Hola".substring(1, 3).concat( "mundo"));
		System.out.println(con);

		return hola+","+String.valueOf(a)+","+String.valueOf(b)+","+String.valueOf(c)+","+String.valueOf(X)+","+String.valueOf(Y)+","+con;

	}
	}
