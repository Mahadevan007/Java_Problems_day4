package day4_labbook;

public class CommandLineArguments {
	public static void main(String[] args) {
		if(args.length > 0) {
			System.out.print(args[0]+"\t"+args[1]);
		}
	}
}
