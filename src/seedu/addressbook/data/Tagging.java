package seedu.addressbook.data;

import java.util.ArrayList;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

public class Tagging {
	
	private Person person;
	private ArrayList<String> tagHistory;
	
	public Tagging(Person person) {
		this.person = person;
		tagHistory = new ArrayList<String>();
	}
	
	public void addTagHistory(Tag tag) {
		tagHistory.add("+" + person.getName().toString() + "[" + tag + "]");
	}
	
	public void removeTagHistory(Tag tag) {
		tagHistory.add("-" + person.getName().toString() + "[" + tag + "]");
	}
	
	/*
	 * Print out the tag history of the person
	 */
	public void showTagHistory(){
		for(int i = 0; i < tagHistory.size(); i++){
			System.out.println(tagHistory.get(i));
		}
	}
	
}
