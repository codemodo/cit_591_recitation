/**
 * The name class - keeps track of a person's name
 * @author swapneel
 *
 */
public class Name {
	private String title;
	private String first;
	private String middle;
	private String surname;
	private String paternal;
	private String maternal;
	private String suffixGenerational;
	private String suffixProfessional;
	pirvate String suffixInAnotherLanguage;;

	public Name(String title, String first, String middle, String surname, String paternal, String maternal,
			String generational, String professional) {
		this.title = title;
		this.first = first;
		this.middle = middle;
		this.surname = surname;
		this.paternal = paternal;
		this.maternal = maternal;
		suffixGenerational = generational;
		suffixProfessional = professional
	}

	public String getTitle() {
<<<<<<< HEAD
		return "CIT591";
=======
		return title;
>>>>>>> c7ccda1dbce29b26cf2b34b52235fb828d371ed2
	}

	public String getFirst() {
		return first;
	}

	public String getMiddle() {
		return middle;
	}

	public String getSurname() {
		return surname;
	}

	public String getPaternal() {
		return paternal;
	}

	public String getMaternal() {
		return null;
	}

	public String getSuffixProfessional() {
		return null;
	}

	public String getSuffixGenerational() {
		return null;
	}

	public String getNameAllCaps() {
		return null;
	}

	private void setFirst() {}
	
	public void setFirst(String first) {
		this.first = first;
	}

	public void setTitle() {
	}

	public void setMiddle() {
	}

	public void setSurname() {
	}

	public void setPaternal(String newPaternal) {
		paternal = newPaternal; 
	}

	public void setMaternal(String newMaternal) {
		maternal = newMaternal;
	}

	public void setSuffixGenerational() {
	}

	public void setSuffixProfessional() {
	}
	
	public boolean isPalindrome() {
		return false;	
	}
	
	/*
	 * Return a string that combines the first middle and last names.
	 * e.g., Jim Paper Halpert
	 */
	public String concatFirstMiddleLast() {
		return null;
	}
	
	/*
	 * Come up with your own meaningful string representation of this Name.
	 */
	@Override
	public String toString() {
		return null;
	}
	
	/*
	 * Checks whether first name matches any of your TAs' first name.
	 */
	public boolean matchesTAsFirstName() {
		return false;
	}
	
	/*
	 * Checks if input string matches first name
	 */
	public boolean matchesFirstName(String s) {
		return false;
	}
	
	/*
	 * Checks whether the two surnames match
	 */
	public boolean isRelativeOf(Name name) {
		return false;
	}

	/*Check if the name has actual meaning*/
	public boolean meaning(Name){
		return false;
	}
}
	
