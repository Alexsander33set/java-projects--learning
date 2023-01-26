package learning1;

public class user {
	String name;
	String course;
	avaliacao notas;
	
	public user(String name, String course, avaliacao notas) {
		this.name = name;
		this.course = course;
		this.notas = notas;
	}


	void printData(){
		System.out.println("---------------");
		System.out.println("Nome:  " + name);
		System.out.println("Curso: " + course);
		System.out.println("Media Aritmetica: " + notas.mediaAritmetica());
		System.out.println("Media Ponderada:  " + notas.mediaPonderada());
	}
}
