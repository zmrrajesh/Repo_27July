class XYZ {
       ABC ab;
       //...
       void send(ABC ab) { // 5
         this.ab = ab;
         System.out.println("inside send");
         callme(); 
       }
       //...
       void callme() { // 6
           System.out.println("A is : "+ab.a);
           System.out.println("b is : "+ab.b);
          // do something with instance variable ab
       } 
    }