
package Interface;

public interface InterfaceA {
    public static final int x = 10;
    public abstract void m1();
    public abstract void m2();
    static void m3(){};
    default void m4(){};
}
interface InterfaceB{
    
}
interface InterfaceC extends InterfaceA,InterfaceB{
    
}

