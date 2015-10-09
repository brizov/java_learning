package helloworldapp;

public class TestInnerAnon {
	   public interface IInnerAnon {
		      public void run();
		   }

		   private static Integer a = 5;

		   public static void main(String[] args) {
		      final Integer b = 3;

		      IInnerAnon innerAnon = new IInnerAnon() {
		          public void run() {
		              System.out.println("Hello World!");
		              System.out.println(a);
		              System.out.println(b);
		          }
		      };

		      innerAnon.run();
		   }

}
