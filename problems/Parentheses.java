class Parentheses {

  static boolean isValid(String s) {
    if (s.length() <= 1) return false;
    if (s.equals("()")) return true;
    String t = s.substring(1, s.length() -1);
    if (s.equals("(" + t + ")") && isValid(t)) return true;
    return isValidEnhanced(s, 2);
  }

  static boolean isValidEnhanced(String s, int index) {
    if (index >= s.length() - 1) return false;
    return (isValid(s.substring(0, index)) && isValid(s.substring(index))) || isValidEnhanced(s, index+1);
  }

  public static void main(String[] args) {
    String[] inlist = {"()", "()()()", ")(", "(()()())()", ")()("
      ,"())()", "()(()", "()()()()(())(()())()()(()())((()()))",
"()()()()((())(()())()()(()())((()()))",
"()()()()()())(()())()()(()())((()()))",
"()()()(())((((()))))(((((((((())))))))))()",
"()()()(()))(((((()))))(((((((((())))))))))()",
"())))(((()",
"))((()",
"())(()"


};
    for (String input : inlist) {
      if (isValid(input)) System.out.println("valid");
      else System.out.println("invalid");
    }
  }

}
