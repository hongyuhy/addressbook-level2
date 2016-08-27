package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;


/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street, #15-123, 123123";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must be formatted"
    		+ " a/BLOCK, STREET, UNIT, POSTAL_CODE";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalcode;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;

        String[] splitUp = address.split(",");
        if(splitUp.length != 4){
        	throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        block = new Block(splitUp[0]);
        street = new Street(splitUp[1]);
        unit = new Unit(splitUp[2]);
        postalcode = new PostalCode(splitUp[3]);
        
    }
    

    /**
     * Returns true if a given string is a valid person email.
     */


    @Override
    public String toString() {
        return block.toString() + "," + street.toString() + "," + unit.toString() 
        + "," + postalcode.toString();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.toString().equals(((Address) other).toString())); // state check
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}