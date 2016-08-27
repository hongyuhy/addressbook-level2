package seedu.addressbook.data.person;


/**
 * Represents a Person's unit in the address book.
 */
public class Unit {


    public final String value;

    public Unit(String unit){
      
        this.value = unit;
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
                || (other instanceof Unit // instanceof handles nulls
                && this.value.equals(((Unit) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}