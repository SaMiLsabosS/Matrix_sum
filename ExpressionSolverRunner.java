import java.util.ArrayList;
import static java.lang.System.*;
public class ExpressionSolverRunner
{
    public static void main(){
        ExpressionSolver list = new ExpressionSolver("3 + 5");
        list.solveExpression();
        out.println(list);
        list.setExpression("3 * 5");
        list.solveExpression();
        out.println(list);
        list.setExpression("3 - 5");
        list.solveExpression();
        out.println(list);
        list.setExpression("3 / 5");
        list.solveExpression();
        out.println(list);
        list.setExpression("5 / 5 * 2 + 8 / 2 + 5");
        list.solveExpression();
        out.println(list);
        list.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
        list.solveExpression();
        out.println(list);
    }
}
