package cap01;

public class Ejercicio6 implements Device {
/*
 6. Given:
 1. public class Electronic implements Device
 { public void doIt() { } }
 2.
 3. abstract class Phone1 extends Electronic { }
 4.
 5. abstract class Phone2 extends Electronic
 { public void doIt(int x) { } }
 6.
Self Test Answers 81
82 Chapter 1: Declarations and Access Control
 7. class Phone3 extends Electronic implements Device
 { public void doStuff() { } }
 8.
 9. interface Device { public void doIt(); }
  What is the result? (Choose all that apply.)
A. Compilation succeeds
B. Compilation fails with an error on line 1
C. Compilation fails with an error on line 3
D. Compilation fails with an error on line 5
E. Compilation fails with an error on line 7
F. Compilation fails with an error on line 9
respuesta: A

 */
	abstract class phone1 extends Electronic{}
	abstract class Phone2 extends Electronic
	 { public void doIt(int x) { } }
	abstract class Phone1 extends Electronic { }
	abstract class Phone3 extends Electronic
	{ public void doIt(int x) { } }
	abstract class Phone4 extends Electronic
	{ public void doIt(int x) { } }
}
