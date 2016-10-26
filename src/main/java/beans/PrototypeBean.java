package beans;

public class PrototypeBean {

	private static int COUNTER;


	public PrototypeBean() {
		COUNTER ++;
	}

	@Override
	public String toString() {
		return "Prototype #" + COUNTER;
	}

}
