package ex1;

public class Exercise1Driver {
    public static void main(String[] args) {
        Exercise1 singer1 = new Exercise1();

        // Displaying default values
        System.out.println("Default values:");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Albums Published: " + singer1.getNumAlbumsPublished());

        // Displaying custom values using setAllValues
        singer1.setAllValues(1, "Jerry Smith", "This Street", "10-22-1984", 8);

        System.out.println("\nAll Updated values:");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Albums Published: " + singer1.getNumAlbumsPublished());

        // Displaying custom values individually

        singer1.setSingerId(2);
        singer1.setSingerName("Phil Merolt");
        singer1.setSingerAddress("That Street");
        singer1.setDateOfBirth("4-12-1996");
        singer1.setNumAlbumsPublished(3);

        System.out.println("\nIndividual Updated values:");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Albums Published: " + singer1.getNumAlbumsPublished());
    }
}
