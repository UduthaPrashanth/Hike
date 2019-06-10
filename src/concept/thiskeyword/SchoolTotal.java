package concept.thiskeyword;

public class SchoolTotal extends School{
	int sum=600;
	void Total(){
	
	int sum=250+300;
	System.out.println(sum);
	System.out.println(this.sum);
	System.out.println(super.sum);
	}
public static void main(String[] args) {
	SchoolTotal c=new SchoolTotal();
	c.Total();
			
}
}
