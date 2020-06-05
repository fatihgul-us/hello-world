package ReplitOdev2.Soru1;

public abstract class Cats {
    /*
    Create two method in the cat class.

     1)  create a method name is walk , return type is void
                in this method print "Cat is walking"

     2) abstract method name is talk return type is void
               NOTE : because this method is abstract there is no any body
     */
    void walk(){
        System.out.println("Cat is walking");
    }
    abstract void talk();
}
