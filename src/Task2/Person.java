package Task2;

abstract class Person {
	protected String id;
	protected String name;
	protected String contact;
	
	public Person(String id, String name,String contact) {
		this.id=id;
		this.name=name;
		this.contact=contact;
	}

	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public String getContact() {
		return contact;
	}
}
