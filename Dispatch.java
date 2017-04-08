// Dynamic Method Dispatch
class Parent {
	void callme() {
		System.out.println("Inside Parent's callme method");
	}
}
class Child extends Parent {
// override callme()
	void callme() {
		System.out.println("Inside Child's callme method");
	}
}
class GrandChild extends Child {
	// override callme()
	void callme() {
		System.out.println("Inside GrandChild's callme method");
	}
}
class Dispatch {
	public static void main(String args[]) {
		Parent a = new Parent(); // object of type Parent
		Child b = new Child(); // object of type Child
		GrandChild c = new GrandChild(); // object of type Grandchild
		Parent r; // obtain a reference of type Parent
		r = a; // r refers to an Parent object
		r.callme(); // calls Parent's version of callme
		r = b; // r refers to a Child object
		r.callme(); // calls Child's version of callme
		r=c;
		r.callme();

}
}
