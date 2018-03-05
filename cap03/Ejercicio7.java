package cap03;

public class Ejercicio07 {
	
	/*
	Which are true? (Choose all that apply.)
	 A. The output could contain 30
	 B. The output could contain @bf73fa
	 C. The output could contain DIAMONDS
	 D. Compilation fails due to an error on line 6
	 E. Compilation fails due to an error on line 7
	 F. Compilation fails due to an error on line 8
	 G. Compilation fails due to an error on line 9
	 H. Compilation fails due to an error within lines 12 to 14
	RESPUESTA A Y B ya que El código se compila y se ejecuta sin excepción. Los valores()
	método devuelve una referencia de matriz, no el contenido de la enumeración, por lo que DIAMANTES nunca
	impreso.
	*/
	 public enum Suits {
	 CLUBS(20), DIAMONDS(20), HEARTS(30), SPADES(30),
	 NOTRUMP(40) { public int getValue(int bid) {
	 return ((bid-1)*30)+40; } };
	 Suits(int points) { this.points = points; }
	 private int points;
	 public int getValue(int bid) { return points * bid; }
	}
	public static void main(String[] args) {
	// linea removida para el correcto funcionamiento System.out.println(Suits.NOTRUMP.getBidValue(3));
	System.out.println(Suits.SPADES + " " + Suits.SPADES.points);
	System.out.println(Suits.values());
	 }
	}