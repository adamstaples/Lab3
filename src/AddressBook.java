
import java.util.*;
public class AddressBook extends BuddyInfo {
	
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
	
	public static void main(String[] args) {
		System.out.println("Address Book");
	}
}
