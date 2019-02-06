

package bankomaten;


public class Customer {
    protected int id;
    protected String name;
    protected int pinCode;

    public Customer(int id, String name, int pinCode) {
        this.id = id;
        this.name = name;
        this.pinCode = pinCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    
    
}
