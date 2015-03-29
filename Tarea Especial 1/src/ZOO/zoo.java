import java.util.*;
public class zoo {
	public static void especies(){
		//Este metodo es el encargado de mostrar el listado de especies con las que cuenta el Zoologico, 
		//mostrando el nombre en espa�ol, el nombre cientifico y una descripcion en general. 
		//Similar al ejemplo que se muestra.
		System.out.println("1. TIGRE"+"\n"+"Nombre cientifico:  Trigis Mantis"+"\n"+"Descripcion: El tigre es el f�lido m�s grande del mundo, comparable en tama�o con los grandes f�lidos f�siles."+"\n"+"El tama�o de los tigres y dem�s caracter�sticas var�an de una subespecie a otra. En estado salvaje, los tigres machos tienen un peso que oscila entre los 100 y los 360 kg y una longitud de 220-380 cm incluyendo la cola, que mide entre 60 y 110 cm y de 70 hasta 122 cm de altura a la cruz.");
	}
	public static void habitats(){
		//Este metodo debe mostrar el listado de h�bitats naturales que vienen definidos por el nombre, el
		//clima y el tipo de vegetaci�n predominantes, as� como el continente o
		//continentes en los que se encuentran.
		//Similar al ejemplo que se muestra.
		System.out.println("1. PRADERAS"+"\n"+"Clima: Templado continental"+"\n"+"Vegetacion predominante: Herbazales"+"\n"+"Continente donde se encuentran: Ameria, Asia, Europa");
	}
	public static void zonas(){
		//las zonas del parque en las que se encuentran las distintas especies
		//vienen definidas por el nombre y la extensi�n que ocupan
		//similar al ejemplo que se muestra.
		System.out.println("1. Zona de Reptiles"+"\n"+"Extension: 30mts cuadrados");
	}
	public static void itinerarios(){
		//Este metodo muestra el listado de itinerarios con los que cuenta
		//el zoo, mostrando por cada uno, c�digo de itinerario, la duraci�n
		//del recorrido, la longitud del itinerario, el m�ximo n�mero de visitantes
		//autorizado y el n�mero de distintas especies que visita
		//Similar al ejemplo que se muestra 
		System.out.println("1. 0100"+"\n"+"Duracion: 20min"+"\n"+"Longitud: 160m"+"\n"+"No. Max de visitantes: 12"+"\n"+"Especies visitadas: 24");
	}
	public static void guias(){
		//definidos por el nombre, direcci�n, tel�fono
		//y fecha en la que comenzaron a trabajar en el zoo. Interesa saber qu� gu�as
		//llevan qu� itinerarios, teniendo en cuenta que un gu�a puede llevar varios
		//itinerarios y que un itinerario puede ser asignado a diferentes gu�as en
		//diferentes horas, siendo �stas un dato de inter�s.
		//similar al ejemplo que se muestra 
		System.out.println("1. Jose Luis Perez"+"\n"+"lote 26 mz17 zona1"+"\n"+"Tel: 22605264"+"\n"+"Inicio: 02/03/2013");
	}
	public static void cuidadores(){
		//definidos por el nombre, direcci�n, tel�fono
		//y fecha de ingreso en el parque
		//Similar al ejemplo que se muestra
		System.out.println("1. Pedro Pablo Paiz"+"\n"+"lote 3 mz 10 zona 3"+"\n"+"Ingreso: 02/05/2002");
	}
	public static void main(String[] args) {
	String Especies="a", Habitats="b", Zonas="c", Itinerarios="d", Guias="e", Cuidadores="f", op;
	Scanner info=new Scanner(System.in);
	System.out.println("Escoja la opci�n de la cual quiere informaci�n");
	System.out.println("(a) Especies");
	System.out.println("(b) Habit�ts");
	System.out.println("(c) Zonas");
	System.out.println("(d) Itinerarios");
	System.out.println("(e) Gu�as");
	System.out.println("(f) Cuidadores");
	op=info.nextLine();
	if(op.equals(Especies)){
		especies();
	}else if(op.equals(Habitats)){
		habitats();
	}else if(op.equals(Zonas)){
		zonas();
	}else if(op.equals(Itinerarios)){
		itinerarios();
	}else if(op.equals(Guias)){
		guias();
	}else if(op.equals(Cuidadores)){
		cuidadores();
	}
	}

}
