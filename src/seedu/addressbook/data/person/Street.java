package seedu.addressbook.data.person;


/**
 * Represents a Person's unit in the address book.
 */
public class Street {


    public final String value;

    public Street(String street){
      
        this.value = street;
    }

    /**
     * Returns true if a given string is a valid person email.
     */

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Street
                && this.value.equals(((Street) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}