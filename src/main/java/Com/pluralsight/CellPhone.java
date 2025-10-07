package Com.pluralsight;

public class CellPhone {

    // there are a variable that hold each phone's info

    private String owner;
    private String phoneNumber;
    private String model;
    private String serialNumber;
    private String carrier;

//constructor it runs when we create new Cellphone

    public CellPhone(String owner, String phoneNumber, String model, String serialNumber, String carrier) {

        this.owner = owner;
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.serialNumber = serialNumber;
        this.carrier = carrier;
    }

    //setter
    // ===== Setters (allow changing info later) =====
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }


    //Getter
    public String getOwner() {
        return owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getCarrier() {
        return carrier;
    }


        // new dial
    public void dial(String phoneToCall){
    System.out.println(owner +" is calling" + phoneToCall + "....");
    }}






