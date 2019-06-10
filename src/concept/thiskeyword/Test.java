package concept.thiskeyword;

public class Test {
int x=100;
void method(){
	int x=50;
	System.out.println(this.x);
	}
	public static void main(String[] args) {
	C t= new C();
	t.method();
	t.method2();
}
}
class C extends Test{
	int x=100;
	void method2()
	{
		x=2000;
		System.out.println(this.x);
	}
	
	}
