package tutorial1;

public class Inner_classes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        OuterClass out = new OuterClass();
        out.inner(); // Since the inner class is private, we have to use the outer class to access it.

        OuterClass.InnerClass in = out.new InnerClass(); // This is how we create an inner class object.
        in.display();

        OuterClass out2 = new OuterClass();
        out2.inner2();
    }
}
