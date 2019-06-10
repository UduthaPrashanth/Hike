package concept.thiskeyword;

public class Parent {
int x=100;

public static void main(String[] args) {
	int x=1000;
	Child c= new Child();
	c.m1();
}
}
class Child extends Parent{
	int x=1000;
	void m1(){
float x=super.x;
		x=6000;
		//int x=2000;
		this.x=5000;
	System.out.println(x);
	System.out.println(this.x);
		System.out.println(super.x);
		
	}
	
	}
 