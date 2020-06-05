package Inheritance;

public class PrintContinuesString {

    public static void main(String[] args) {
        String a="Merhaba.. Hola.. Salam.. ";
        int row =10, coloum = 101;
        System.out.println( printContinuousString(a,row,coloum) );

    }

    public static String printContinuousString(String text, int row, int coloum) {

        int count = 0;
String ret="";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                if (count == text.length()) {
                    count=0;
                }
  //              System.out.print(text.charAt(count));
                ret+=""+text.charAt(count);
                count++;
            }
            ret=ret+"\n";
 //           System.out.println();
        }
return ret;
    }
}
