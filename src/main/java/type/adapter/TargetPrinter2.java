package type.adapter;

public class TargetPrinter2 implements Printer {

	private SourcePrinter printer;

	public TargetPrinter2() {
		this.printer = new SourcePrinter();
	}

	public void printHello() {
		printer.printSourceHello();

	}

	public void printWorld() {
		printer.printSourceWorld();

	}

}
