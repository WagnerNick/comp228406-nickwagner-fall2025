package ex1;

public class Exercise1 {
    //variables
    private int singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int numAlbumsPublished;

    // constructor without arguments
    public Exercise1() {
        singerId = 0;
        singerName = "N/A";
        singerAddress = "N/A";
        dateOfBirth = "N/A";
        numAlbumsPublished = 0;
    }

    // constructor with arguments
    public Exercise1(int id, String name, String address, String dob, int albums){
        singerId = id;
        singerName = name;
        singerAddress = address;
        dateOfBirth = dob;
        numAlbumsPublished = albums;
    }

    // getters
    public int getSingerId() {return singerId;}
    public String getSingerName() {return singerName;}
    public String getSingerAddress() {return singerAddress;}
    public String getDateOfBirth() {return dateOfBirth;}
    public int getNumAlbumsPublished() {return numAlbumsPublished;}

    // setters
    public void setSingerId(int id) {singerId = id;}
    public void setSingerName(String name) {singerName = name;}
    public void setSingerAddress(String address) {singerAddress = address;}
    public void setDateOfBirth(String dob) {dateOfBirth = dob;}
    public void setNumAlbumsPublished(int albums) {numAlbumsPublished = albums;}

    public void setAllValues(int id, String name, String address, String dob, int albums){
        singerId = id;
        singerName = name;
        singerAddress = address;
        dateOfBirth = dob;
        numAlbumsPublished = albums;
    }
}

