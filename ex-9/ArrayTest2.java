class Human {

   // Properties of the class...
   String name;

   // Constructor of the class...
   public Human(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a human and my name is " + name;
   }
}

class ArrayTest2 {

   public static void main(String[] args) {
      ArrayTest2 x = new ArrayTest2();
      x.doStuff();
   }

   public void doStuff() {

      // insert your code here:
        Human[] threesome = new Human[3];
        threesome[0] = new Human("Angus");
        threesome[1] = new Human("Brian");
        threesome[2] = new Human("Charles");
        for (int i=0; i < threesome.length; i++){
          System.out.println(tostring(threesome[i]);
        }

        public void printArray(human[] x){
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

        printArray(threesome);

   }
}
