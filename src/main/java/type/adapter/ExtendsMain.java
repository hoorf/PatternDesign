package type.adapter;

public class ExtendsMain {

	public static void main(String[] args) {
		Printer printer = new TargetPrinter2();
		printer.printHello();
		printer.printWorld();
	}

}
