package xujia.yang;

class HelloA {
	 
	 {
		 System.out.println("I'm A class ");
	 }
	 
	 static {
		 System.out.println("static A");
	 }
	 
	 public HelloA() {
		 System.out.println("struct A");
	 }
}

public  class HelloB extends HelloA{
	 {
		 System.out.println("I'm B class ");
	 }
	 static {
		 System.out.println("static B");
	 }
	 
	 public HelloB() {
		 System.out.println("struct B");
	 }
	 
	 public static void main(String[] args) {
		new HelloB();
		//
		
	}
}
