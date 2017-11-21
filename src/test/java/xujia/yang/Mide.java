package xujia.yang;

public class Mide {
	StringBuffer str = new StringBuffer ("good");
	char [] ch = {'a','b','c'};
	
	private void change(StringBuffer str2,char ch[] ) {
		str2 = str2.append("test ok");
		ch[0] = 'g';
	}
	
	public static void main(String args[]) {
		Mide ex = new Mide();
		ex.change(ex.str, ex.ch);
		System.out.println(ex.str+" and "); //good and gbc
		System.out.println(ex.ch);
	}
}
