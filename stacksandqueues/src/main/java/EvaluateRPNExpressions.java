import java.util.Stack;

public class EvaluateRPNExpressions {

    /*
    9.2
    */
    public static Integer eval(String RPNExpression) {
        Stack<String> stack=new Stack<>();
        int val=0;
        String[] str=RPNExpression.split(",");
        for(int i=0;i<str.length;i++){
            if(str[i].equals("+")||str[i].equals("-")||str[i].equals("x")||str[i].equals("/")){
                String val2=stack.pop();
                String val1=stack.pop();
                switch (str[i]){
                    case "+":
                        val=(Integer.parseInt(val1)+Integer.parseInt(val2));
                        break;
                    case "-":
                        val=(Integer.parseInt(val1)-Integer.parseInt(val2));
                        break;
                    case "x":
                        val=(Integer.parseInt(val1)*Integer.parseInt(val2));
                        break;
                    case "/":
                        val=(Integer.parseInt(val1)/Integer.parseInt(val2));
                        break;
                }
                stack.push(String.valueOf(val));
            }
            else{
                stack.push(str[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
