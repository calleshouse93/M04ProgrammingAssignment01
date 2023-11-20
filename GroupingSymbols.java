
import java.io.*;
import java.util.*;

public class GroupingSymbols {

	public static void main(String[] args) throws Exception  {
		
	}
	
	Stack<Character> symbols = new Stack<>() {
		
		{
	try (Scanner input = Scanner(file); ){
		
	}
	
		while (input.hasNext()) {
			String line = input.nextLine();
			for (int i = 0; i < line.length(); i++) {
				char ch = line.charAt(i);
				if (ch == "(" || ch == "{" || ch == "[") {
				symbols.push(ch);
				}
			
				else if (ch == ")" || ch == "}" || ch == "]") {
					processSymbols(symbols, ch);
				}
			}
		}
	
		
	System.out.println 
	("The source-code " + (symbols.isEmpty() ? "does have" : "does not have") + " correct pairs.");
	
	private static void processSymbols(Stack<Character> stack, Character ch) {
		if ((stack.peek() == "(" && ch == ")" ) ||
				(stack.peek() == "{" && ch == "}" ) ||
				(stack.peek() == "[" && ch == "]" )) {
			stack.pop();
		}
		
		else if ((stack.peek() != "(" && ch == ")" ) ||
				(stack.peek() != "{" && ch == "}" ) ||
				(stack.peek() != "[" && ch == "]" )) {
			System.out.println("The source-code does not have" + " correct pairs.");
			System.exit(1);
		}
		}
		}
}
