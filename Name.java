/**
 * The name class - keeps track of a person's name
 * @author swapneel
 *
 */
public class Name {
	private String first;
	private String middle;
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
		return title;
	}

	
	public int getValue() {
		return value;	
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
		return maternal;
	}

	public String getSuffixProfessional() {
		return suffixProfessional;
	}

	public String getSuffixGenerational() {
		return suffixGenerational;
	}


	public String getNameAllCaps() {
		return (first.toUpperCase() + " " + last.toUpperCase);
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
		String fullName = concatFirstMiddleLast();
		String cleanFullName = fullName.toLowerCase().replace(" ","");
		int length = cleanFullName.length;
		for(int i = 0; i<Math.ceiling(length/2); i++){
			if (cleanFullName.charAt(i)!=cleanFullName.charAt(length-1-i)){
				return false;
			}
			return true;
		}


	}
	
	/*
	 * Return a string that combines the first middle and last names.
	 * e.g., Jim Paper Halpert
	 */
	public String concatFirstMiddleLast() {
		return first+ " " + middle + " " + last;
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
		return first == "Pedro" || first == "Alex" || first == "Theresa" 
	}
	
	/*
	 * Checks if input string matches first name
	 */
	public boolean matchesFirstName(String s) {

		return s.equals(first);
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
	/*Check if it's Friday */
	public boolean isFriday(int day){
		return true;
	}

	
