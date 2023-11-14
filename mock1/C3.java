public class C3 {


    public static boolean isAlphabet(String t){
        t.toLowerCase();
        for(int a = 0; a < t.length()-1; a++){
            if(t.charAt(a) > t.charAt(a + 1)){
                return false;
            }
        }
        return true;
    } 

    public static String hideText(String t){
        String result = "";

        for(int a = 0; a < t.length(); a++){
            if(a == 0 || a == t.length()-1){
                result += t.charAt(a);
            }else{
                result += '*';
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(C3.isAlphabet("abegsw"));
        System.out.println(C3.isAlphabet("abcmhsw"));
        System.out.println(C3.hideText("apple"));
        System.out.println(C3.hideText("OK"));
    }
}
