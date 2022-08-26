package pattern;

public class maiin_singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(singleton.getinstance());
		System.out.println(singleton.getinstance());
		
		factory obj1 = new factory();
		factory obj2 = new factory();
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
