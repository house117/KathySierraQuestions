package cap03;
/*
 * /*
Which two are true about the objects created within main() , and eligible for garbage collection
when line 14 is reached?
 A. Three objects were created
 B. Four objects were created
 C. Five objects were created
 D. Zero objects are eligible for GC
 E. One object is eligible for GC
 F. Two objects are eligible for GC
 G. Three objects are eligible for GC
RESPUESTA C Y F ya que se refiere a un objeto de tipo "Dozens array" y cada objeto Dozen que se crea viene con su propio objeto "int array".
Cuando se alcanza la línea 14, solo el segundo objeto Dozen (y su objeto "int array") no son accesibles.
*/
 */

class Dozens {
int[] dz = {1,2,3,4,5,6,7,8,9,10,11,12};
}
public class Ejercicio10 {
public static void main(String[] args) {
Dozens [] da = new Dozens[3];
da[0] = new Dozens();
Dozens d = new Dozens();
da[1] = d;
d = null;
da[1] = null;
// do stuff
}
}