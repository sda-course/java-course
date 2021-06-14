package java_course._1_basics.step01;

public class _01_3_SimpleAnimation {
    //za metoda main trzeba dodać throws InterruptedException
    public static void main(String[] args) throws InterruptedException {
        int delay = 300;
        System.out.print("#######");
        //Ta instrukcja generuje opóźnienie o 100 ms
        Thread.sleep(delay);
        //To powoduje usunięcie znaku przed kursorem.
        System.out.print("\b");
        Thread.sleep(delay);
        System.out.print("\b");
        Thread.sleep(delay);
        System.out.print("\b");
        Thread.sleep(delay);
        System.out.print("\b");
        Thread.sleep(delay);
        System.out.print("\b");
        Thread.sleep(delay);
        System.out.print("\b");
        Thread.sleep(delay);
        System.out.print("\b");
        Thread.sleep(delay);
        System.out.print("#");
        Thread.sleep(delay);
        System.out.print("#");
        Thread.sleep(delay);
        System.out.print("#");
        Thread.sleep(delay);
        System.out.print("#");
        Thread.sleep(delay);
        System.out.print("#");
    }
}
