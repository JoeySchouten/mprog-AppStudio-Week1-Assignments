class ArrayTest {

   public static void main(String[] args) {
      ArrayTest x = new ArrayTest();
      x.doStuff();
   }

   public void doStuff() {

      // creates the array fred of ten integers.
      int[] fred = new int[10];

      // sets the values of the fred array
      for (int i=0; i<10; i++) {
         fred[i] = i;
      }

      // prints the values of the fred array
      for (int i=0; i<10; i++) {
         System.out.println(fred[i]);
      }

      // insert your code for the nums array here:
      double[] nums = new double[10];
      for (int i=1; i<10; i++){
        nums[i] = 1+(0.1*i);
      }
      for (int n = 0; n<10; n++){
        System.out.println(nums[n]);
      }

      ArrayPrint.printArray(nums);
      printArray(nums);
   }

   public void printArray(int[] x){
     if (x.length = 0){
       System.out.println("this array is empty");
       break;
     }
     else{
       int len = x.length;
       for (int i=0; i < len; i++){
         System.out.println(x[i]);
       }
    }
   }
}
