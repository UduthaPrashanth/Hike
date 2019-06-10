package concept.thiskeyword;

public class ThisProgram {
	int a;
	//this.a= a;
	//this.b= b;
	int b;
	int c;
	/*ThisProgram(){
		super();
	}*/
	ThisProgram(int a, int b,int c ){
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a+b+c);
	}
ThisProgram(int a, int b ){
	this(2,3,4);
	this.a=a;
	this.b=b;
	//this(2,3,4);
	System.out.println(a+b);
		
	}
	/*void display() {
		System.out.println(a+b);
		
	}*/
public static void main(String[] args) {
	ThisProgram c=new ThisProgram(10,20);
	//ThisProgram c1=new ThisProgram();
	//c.add(1, 2);
	//c.display();
	//c.add(10, 20);
}
}
