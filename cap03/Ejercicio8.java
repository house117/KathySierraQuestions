package cap03;

public class Ejercicio08 {
	
	/*
	What is the result?
	 A. 5 7
	 B. 5 8
	 C. 8 7
	 D. 8 8
	 E. Compilation fails
	 F. An exception is thrown at runtime
	RESPUESTA E hay un error pero componiendolo imprime 6,7 
	*/
	 static int ouch = 7;
	 public static void main(String[] args) {
		 new Ejercicio08().go(ouch);
		 System.out.print(" " + ouch);
	 }
	 void go(int ouch) {
		 ouch++;
	 for(ouch = 3; ouch < 6; ouch++)
	 ;
	 System.out.print(" " + ouch);
	 }
}
