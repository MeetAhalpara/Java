import java.util.Stack;

public class genetic_type_tr {
    public static void main(String[] args) {
//  LIFO
        Stack<Character> tr = new Stack<>();
        tr.push('M');
        tr.push('e');
        tr.push('e');
        tr.push('t');
        tr.push('A');

        while (!tr.isEmpty()) {
            System.out.println(tr.pop());
        }
    }
}
