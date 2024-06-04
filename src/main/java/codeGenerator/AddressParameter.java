package codeGenerator;

public class AddressParameter {
    private Address address1;
    private Address address2;
    private Address result;
    private varType type;

    public AddressParameter(Address address1, Address address2, Address result, varType type) {
        this.address1 = address1;
        this.address2 = address2;
        this.result = result;
        this.type = type;
    }

    public Address getAddress1() {
        return address1;
    }

    public Address getAddress2() {
        return address2;
    }

    public Address getResult() {
        return result;
    }

    public varType getType() {
        return type;
    }
}
