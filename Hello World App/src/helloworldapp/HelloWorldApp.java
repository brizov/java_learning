package helloworldapp;



public class HelloWorldApp {


	public static void main(String[] args) {
        
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
        int[] _ebanie = {1, 2, 3, 4, 5, 6,1, 2, 3, 4, 5, 6};
        //string systemname = System.getenv();
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        java.util.Arrays.parallelSort(copyTo);
        System.out.println(new String(copyTo));
        System.out.println(_ebanie[5-3]);
        System.out.print(copyTo);
	}

}
