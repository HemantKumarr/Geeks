import java.util.ArrayDeque;

public class BalancedParanthesis {

    public static void main(String[] args) {
        String s = "[)";
        boolean res;
        res = isBalanced(s);
        System.out.println(res);
    }

    private static boolean isBalanced(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            else {
                if (stack.isEmpty()) return false;
                else if (s.charAt(i) != stack.peek()) {
                    return false;
                }
                else
                    stack.pop();;
            }
        }
        return stack.isEmpty();
    }
}