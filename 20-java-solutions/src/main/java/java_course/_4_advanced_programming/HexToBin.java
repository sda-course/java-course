package java_course._4_advanced_programming;

public class HexToBin {

    private static String characterToHexString(int c){
        String nibble = Integer.toBinaryString(Character.isDigit(c) ? c - '0' : c - 'A' + 10);
        return "0".repeat(4 - nibble.length()) + nibble;
    }

    public static String hexToInt(String input){
        String cleanInput = clean(input);
        String result = cleanInput.chars()
                .takeWhile(HexToBin::isHexDigit)
                .mapToObj(HexToBin::characterToHexString)
                .reduce("", String::concat);
        return result.length() == cleanInput.length() * 4 ? result : "";
    }

    private static String clean(String input){
        return input.toUpperCase().replace("0x","").replace("0X", "").trim();
    }

    private static boolean isHexDigit(int c){
        return Character.isDigit(c) || c >= 'A' && c <= 'F';
    }

    public static void main(String[] args) {
        System.out.println(hexToInt("0x34DFa124"));
        System.out.println(hexToInt("0X34DFa124v"));
    }

}
