import java.util.ArrayList;
import java.util.List;

interface Image {
    public void displayImage();
    public void showData();
}

class RealImage implements Image {
    private final String filename;

    /**
     * Constructor
     * 
     * @param filename
     */
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public void showData() {
        System.out.println("Image, Filename: " + filename);
    }
}

// On System B
class ProxyImage implements Image {
    private final String filename;
    private RealImage image;

    /**
     * Constructor
     * 
     * @param filename
     */
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.displayImage();

        
    }

    @Override
    public void showData() {
        System.out.println("Image proxy, Filename: " + filename);
    }
}

class ProxyExample {
    /**
     * Test method
     */
    public static void main(final String[] arguments) {
        List<Image> kansio = new ArrayList<>();
        kansio.add(new ProxyImage("HiRes_10MB_Photo1"));
        kansio.add(new ProxyImage("HiRes_10MB_Photo2"));
        kansio.add(new ProxyImage("HiRes_10MB_Photo3"));

        System.out.println("\nTiedot:");
        for(Image img : kansio) {
            img.showData();
        }

       
        System.out.println("\nKuvien näyttäminen:");
        for(Image img : kansio) {
            img.displayImage();
        }
    }
}