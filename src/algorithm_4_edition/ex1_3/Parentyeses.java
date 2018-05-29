package algorithm_4_edition.ex1_3;

/**
 * @author bvvy
 * @date 2018/5/29
 */
public class Parentyeses {

    private String text;
    private FixedCapacityStackOfStrings stack;

    public Parentyeses(String text) {
        this.text = text;
        this.stack = new FixedCapacityStackOfStrings(text.length());
    }

    public boolean isPair() {
        for (String s : text.split("")) {
            if (s.equals("{") || s.equals("[") || s.equals("(")) {
                stack.push(s);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                String pop = stack.pop();
                if (pop.equals("{") && !s.equals("}")) {
                    return false;
                }
                if (pop.equals("(") && !s.equals(")")) {
                    return false;
                }
                if (pop.equals("[") && !s.equals("]")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Parentyeses parentyeses = new Parentyeses("[{}][(){()}()]");
        System.out.println(parentyeses.isPair());
    }

}
