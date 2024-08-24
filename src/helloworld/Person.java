package helloworld;

public class Person {
	static int id;
	
	public static void main(String[] args) {
		Person[] p = new Person[200];
		Sorter s = new Sorter();
		s.sort(p);
	}
}
