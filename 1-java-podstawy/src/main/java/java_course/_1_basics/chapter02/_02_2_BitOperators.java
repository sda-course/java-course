package java_course._1_basics.chapter02;

public class _02_2_BitOperators {
    public static void main(String[] args) {
        //Operatory bitowe działają na bitach liczb
        //liczba 255 w zapisie binarnym
        System.out.println(0b11111111);

        //liczb 255 w zapisie ósemkowym
        System.out.println(0377);

        //ta sama liczba w zapisie szesnastkowym
        System.out.println(0xFF);

        //Operator & (AND) działa zgodnie ze schematem
        // 0 & 0 => 0
        // 0 & 1 => 0
        // 1 & 0 => 0
        // 1 & 1 => 1
        System.out.println("Operator & (AND)");
        System.out.println("0 & 0 = " + (0b0 & 0b0));
        System.out.println("0 & 1 = " + (0b0 & 0b1));
        System.out.println("1 & 0 = " + (0b1 & 0b0));
        System.out.println("1 & 1 = " + (0b1 & 0b1));

        //Operator | (OR) działa zgodnie ze schematem
        // 0 | 0 => 0
        // 0 | 1 => 1
        // 1 | 0 => 1
        // 1 | 1 => 1
        System.out.println("Operator | (OR)");
        System.out.println("0 | 0 = " + (0b0 | 0b0));
        System.out.println("0 | 1 = " + (0b0 | 0b1));
        System.out.println("1 | 0 = " + (0b1 | 0b0));
        System.out.println("1 | 1 = " + (0b1 | 0b1));

        //Operator ^ (XOR) działa zgodnie ze schematem
        // 0 ^ 0 => 0
        // 0 ^ 1 => 1
        // 1 ^ 0 => 1
        // 1 ^ 1 => 0
        System.out.println("Operator ^ (XOR)");
        System.out.println("0 ^ 0 = " + (0b0 ^ 0b0));
        System.out.println("0 ^ 1 = " + (0b0 ^ 0b1));
        System.out.println("1 ^ 0 = " + (0b1 ^ 0b0));
        System.out.println("1 ^ 1 = " + (0b1 ^ 0b1));

        //Operator negacji bitowej ~
        System.out.println("Operator ~ (NOT)");
        System.out.println("!0 = " + (~0b0 & 0b1));
        System.out.println("!1 = " + (~0b1 & 0b1));

        //Operatory przesunięcia << i >>
        System.out.println("Operatory << i >> ");
        System.out.println("0010 << 1 = " + "0" + Integer.toBinaryString(0b0010 << 1));
        System.out.println("0010 >> 1 = " + "000" + Integer.toBinaryString(0b0010 >> 1));

        //Przesunięcie o n bitów w lewo jest równoważne mnożeniu przez 2^n
        System.out.println("5 << 4 = 5 * 2^4 = 5 * 16 = " + (5 << 4));

        //Przesunięcie o n bitów w prawo jest równoważne dzieleniu przez 2^n
        System.out.println("80 >> 4 = 80 / 2^4 = 80 / 16 = " + (80 >> 4));

        //Operacje bitowe wykorzystywane są najczęściej przy współpracy ze sprzętem.
        //Np. wyświetlacz operuje na ciągu 32 bitów (typ int), które opisują kolor jednego piksela.
        //Aby wygenerować kolor na podstawie składowych, trzeba podzielić te 32-bity na bajty
        //gdyż trzy z tych bajtów to wartości składowych RGB
        System.out.println("(0xFABB134F & 0x00FF0000) >> 16 = " + ((0xFABB134F & 0x00FF0000) >> 16));
        System.out.println(0xBB);
    }
}
