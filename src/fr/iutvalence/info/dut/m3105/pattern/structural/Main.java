package fr.iutvalence.info.dut.m3105.pattern.structural;

public class Main
{

	public static void main(String[] args)
	{
		Stack<String> stack = new ArrayStack<String>(args, 0);
		new StackOfStringTester(stack).testStack();
	}

}
