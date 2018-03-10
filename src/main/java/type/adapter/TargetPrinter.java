package type.adapter;

public class TargetPrinter extends SourcePrinter implements Printer {

	public void printHello() {
		printSourceHello();

	}

	public void printWorld() {
		printSourceWorld();
	}

}
