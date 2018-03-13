import java.util.*;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
/**
 * Write a description of class Taller8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taller8
{   
    //Punto 1
    public static Stack<Integer> inversa (Stack<Integer> stack){
        Stack<Integer> Stack = new Stack<Integer>();   
        for(int i = stack.size()-1; i >= 0; i--){
            Stack.push(stack.pop());
        }
        return Stack;
    }
    //Punto 2
    public static void cola(Queue<String>  a){
        int algo=a.size();
        while(a.size()>0){
            System.out.println("Atendiendo a "+ a.remove());
        }
    }

    public static int polaca(String str){
        Stack<Integer> stack = new Stack();
        str.split(" ");
        for(String x: str.split(" ")){
            if (x.equals("+")) 
                stack.push(stack.pop() + stack.pop());
            else if (x.equals("*"))
                stack.push(stack.pop() * stack.pop());
            else if (x.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push( a / b);
            }
            else if (x.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push( a - b);
            }
            else
                stack.push(Integer.parseInt(x));

        }

        return(stack.pop());
    }
   
}

