package LEVEL2;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * MaximizeFormulas
 */
public class MaximizeFormulas {

    public int Solution(String value) throws ScriptException{
        ScriptEngineManager sm = new ScriptEngineManager();
        if(value.contains("+")){
            // * > + > -
            String [] exsp = value.split("-");

            for (String index : exsp) {
                ScriptEngine se = sm.getEngineByName("js");
                Object obj = se.eval(index);
            }
        }else{
            // - > *
            System.out.println("this is a plus YES");
        }
        return 0;
    }

    public static void main(String[] args) throws ScriptException {
        MaximizeFormulas max = new MaximizeFormulas();
        String expression =  "100-200*300-500+20";
        // String expression =  "50*6-3*2";

        max.Solution(expression);
    }
}