package pattern;

public class singleton {
	private static singleton obj;
	private singleton() {}
	
	public static singleton getinstance() {
		if(obj == null) {
			obj = new singleton();
		}
		return obj;
	}
}
