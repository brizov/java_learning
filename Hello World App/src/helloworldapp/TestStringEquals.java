package helloworldapp;

public class TestStringEquals {

	   public static void main(String[] args) {
	      String a = "String";
	      String b = "String";
	      String c = new String("String");
	      String d = new String("String");

	      if (a.equals(b)) {
	          System.out.println("We are equal!");
	      }

	      if (c.equals(d)) {
	          System.out.println("We are also equal!");
	      }

	      if (a == b) {
	          System.out.println("What do you think?");
	          System.out.println(d);
	          System.out.println(c);
	          System.out.println(a);
	          System.out.println(b);
	      }

	      if (c == d) {
	          System.out.println("How about now?");
	      }
	      
	   }
}
