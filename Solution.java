class Solution {
  public static String camelCase(String input) {
    char[] chrArr = input.toCharArray();
    String result = "";
    for (int i = 0; i < chrArr.length; i++) {
      if (chrArr[i] == input.toLowerCase().charAt(i)) {
        result = result + chrArr[i];
      } else {
        result = result + " " + chrArr[i];
      }
    }
    return result;
  }
}
//OR
interface Solution {
  static String camelCase(String input) {
    return input.replaceAll("([A-Z])", " $1");
  }
}
