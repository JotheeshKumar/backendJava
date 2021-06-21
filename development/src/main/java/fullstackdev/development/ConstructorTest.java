package fullstackdev.development;

import java.io.ObjectInputStream.GetField;

public class ConstructorTest {

	private int id;
	private long phone;
	private String Name;
	
	public ConstructorTest() {
System.out.println("same code in const");
	}
	
	public ConstructorTest(int id, long phone, String name) {
		super();
		this.id = id;
		this.phone = phone;
		Name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}

	public static void main(String[] args) {
		ConstructorTest sc = new ConstructorTest(1,9944456076l,"joe");
System.out.println(sc.getId());
System.out.println(sc.getName());
System.out.println(sc.getPhone());
	}

	
}
