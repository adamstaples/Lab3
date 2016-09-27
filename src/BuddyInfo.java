
public class BuddyInfo {
	private String name;
	private String address, phoneNumber;
	
	public BuddyInfo (String name, String address, String phoneNumber){
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Harry", "Norman St", "613");
		buddy.setName("Homer");
		System.out.println("Hello " + buddy.getName());

	}

}
