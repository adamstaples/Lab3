
public class BuddyInfo {
	String name;
	int address, phoneNumber;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Homer");
		System.out.println("Hello " + buddy.getName());

	}

}
