  public class A {
        public void m1() {
            System.out.println("inside m1 method");
            ABC ab = new ABC(); // 2 object is made and reference is given to ab 
            XYZ xyz = new XYZ();  // 3 object is made and reference is given to xyz 
            xyz.send(ab); // 4 THIS IS WHAT YOUR QUESTION MEANS
        }
  } 