
import java.util.*;
public class AddressBook  {
	
	private ArrayList<BuddyInfo> buddyList;
	
	public AddressBook(){
		buddyList = new ArrayList<BuddyInfo>();
	}
	
	public void  addBuddy(BuddyInfo buddy){
		buddyList.add(buddy);
	}
	
	public void removeBuddy(BuddyInfo buddy){
		if (buddyList.remove(buddy) == false){
			System.out.println("This buddy was not on the list");
		}
	}
	
	public void laughAtCharles(){
		System.out.println("BAHAHHAHA CHARLES IS FUNNY BAAHAHA");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Address Book");
		BuddyInfo buddy = new BuddyInfo("Tom", "Carelton", "613");
		AddressBook book = new AddressBook();
		book.addBuddy(buddy);
		book.removeBuddy(buddy);
		System.out.println("hi");
		book.laughAtCharles();
		
	}
}
