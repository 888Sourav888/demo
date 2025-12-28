public class SingletonClass {
	// simple eager-initialized singleton
	private static final SingletonClass INSTANCE = new SingletonClass();
	private int counter = 0;

	private SingletonClass() { }

	public static SingletonClass getInstance() {
		return INSTANCE;
	}

	public void increment() {
		counter++;
	}

	public int getCounter() {
		return counter;
	}
}
