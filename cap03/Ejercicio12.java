package cap03;




class Box {
 int size;
 Box(int s) { size = s; }
 }
 public class Ejercicio12 {
 public static void main(String[] args) {
 Box b1 = new Box(5);
 Box[] ba = go(b1, new Box(6));
 ba[0] = b1;
 for(Box b : ba) System.out.print(b.size + " ");
 }
 static Box[] go(Box b1, Box b2) {
 b1.size = 4;
 Box[] ma = {b2, b1};
 return ma;
 }
 }
/*
What is the result?
 A. 4 4
 B. 5 4
 C. 6 4
 D. 4 5
 E. 5 5
 F. Compilation fails
RESPUESTA ES A 4 4
*/