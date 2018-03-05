package cap02;

import java.util.*;
/*
You’re designing a new online board game in which Floozels are a type of Jammers, Jammers can
have Quizels, Quizels are a type of Klakker, and Floozels can have several Floozets. Which of the
following fragments represent this design? (Choose all that apply.)
RESPUESTA A, C
*/
interface Klakker { }
class Jammer { Set<Quizel> q; }
class Quizel implements Klakker { }
public class Ejercicio14 extends Jammer { List<Floozet> f; }
interface Floozet { }


class Floozet2 { }
class Quizel2 implements Klakker2 { }
class Jammer2 { List<Quizel> q; }
interface Klakker2 { }
class Floozel extends Jammer { List<Floozet> f; }
