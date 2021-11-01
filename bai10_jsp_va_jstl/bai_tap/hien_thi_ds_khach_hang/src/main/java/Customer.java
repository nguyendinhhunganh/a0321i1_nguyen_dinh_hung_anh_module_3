public class Customer {
    private String name;
    private String day_of_birth;
    private String address;
    private String image;

    public Customer() {
    }

    public Customer(String name, String day_of_birth, String address, String image) {
        this.name = name;
        this.day_of_birth = day_of_birth;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay_of_birth() {
        return day_of_birth;
    }

    public void setDay_of_birth(String day_of_birth) {
        this.day_of_birth = day_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
