class Address{
    private String streetName;
    private int houseNo;
    private String city;

    public String getStreetName(){
        return streetName;
    }
    public void setStreetName(String streetName){
        this.streetName = streetName;
    }

    public int getHouseNo(){
        return houseNo;
    }
    public void setHouseNo(int houseNo){
        this.houseNo = houseNo;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }

}


public class HashCode {


    // Driver code
    public static void main(String args[])
    {
       Address address = new Address();
       address.setStreetName("Gochiwalli");
       address.setCity("Hyderabad");
       address.setHouseNo(123);

       int code = address.hashCode();
        System.out.println("Hashcode: "+ code);
    }
}
