package StringFunctions;

public class MayusculasMinusculas {
  public static String minusculasMaiusculas(String texto) {
    int len = texto.length() - 1;
    String newString = "";
    for (int i = 0; i < len; ++i) {
      if (i % 2 == 0) {
        char upper = texto.charAt(i);
        newString = newString + Character.toUpperCase(upper);
      } else {
        char upper = texto.charAt(i);
        newString = newString + Character.toLowerCase(upper);
      }
    }
    return newString;
  }
}
