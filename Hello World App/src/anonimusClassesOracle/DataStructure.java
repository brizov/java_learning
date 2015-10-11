package anonimusClassesOracle;

import javax.rmi.CORBA.Util;

public class DataStructure {
    
   // Create an array
   private final static int SIZE = 15;
   private int[] arrayOfInts = new int[SIZE];
    
   public DataStructure() {
       // fill the array with ascending integer values
       for (int i = 0; i < SIZE; i++) {
           arrayOfInts[i] = i;
       }
   }
   public void print(DataStructureIterator iterator){
	   while(iterator.hasNext()){
		   System.out.print(iterator.next() + " ");
	   }
	   System.out.println();
   }
   public void print(java.util.function.Function<Integer, Boolean> function){
	   for (int i = 0; i < SIZE; i++) {
		if (function.apply(i)) {
			System.out.print(arrayOfInts[i] + " ");
		}
	}
	   System.out.println();
   }
   public static Boolean isEvenIndex(Integer index){
	   if (index % 2 ==0) return Boolean.TRUE;
	   return Boolean.FALSE;
   }
   public static Boolean isODDIndex(Integer index){
	   if (index % 2 ==0) return Boolean.FALSE;
	   return Boolean.TRUE;
   }
   public void printEven() {
        
       // Print out values of even indices of the array
       DataStructureIterator iterator = this.new EvenIterator();
       while (iterator.hasNext()) {
           System.out.print(iterator.next() + " ");
       }
       System.out.println();
   }
    
   interface DataStructureIterator extends java.util.Iterator<Integer> { } 

   // Inner class implements the DataStructureIterator interface,
   // which extends the Iterator<Integer> interface
    
   private class EvenIterator implements DataStructureIterator {
        
       // Start stepping through the array from the beginning
       private int nextIndex = 0;
        
       public boolean hasNext() {
            
           // Check if the current element is the last in the array
           return (nextIndex <= SIZE - 1);
       }        
        
       public Integer next() {
            
           // Record a value of an even index of the array
           Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
           // Get the next even element
           nextIndex += 2;
           return retValue;
       }
   }
   public DataStructureIterator getEvenIterator(){
	   return new EvenIterator();
   }
    
   public static void main(String s[]) {
        
       // Fill the array with integer values and print out only
       // values of even indices
       DataStructure ds = new DataStructure();
       ds.printEven();
       ds.print(ds.getEvenIterator());
       ds.print(new DataStructure.DataStructureIterator() {
		
    	   private int nextIndex = 1;
		
		public Integer next() {
			// TODO Auto-generated method stub
			int returnValue = ds.get(nextIndex);
			nextIndex += 2;
			return returnValue;
		}
		
		
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (nextIndex <= ds.size() -1);
		}
	});
       ds.print(DataStructure::isEvenIndex);
       ds.print(DataStructure::isODDIndex);
       ds.print(index -> {
    	   if (index %2 ==0) return Boolean.TRUE;
    	   return Boolean.FALSE;
    	   
       });
       ds.print(index -> {
    	   if (index %2 ==0) return Boolean.FALSE;
    	   return Boolean.TRUE;
    	   
       });
       
   }
protected int get(int nextIndex) {
	// TODO Auto-generated method stub
	return arrayOfInts[nextIndex];
}
protected int size() {
	// TODO Auto-generated method stub
	return SIZE;
}

}
