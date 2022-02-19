
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author Bobby Lo
 */
public class PostGenerator {

    private final ArrayList<User> users;
    private final Random rng;

    private File[] images;
    private String[] captions;
    private String[] texts;

    private int totalSizeOfUsers;
    private int randomUser;

    public PostGenerator(ArrayList<User> users) {
// Assign users field
        this.users = users;

        int totalSizeOfUsers = users.size();

// Instantiate the Random object
        rng = new Random();
        int randomUser = rng.nextInt(totalSizeOfUsers);

        /*
Get the images, image captions, and texts
         */
// Get the images
        File imageDirectory = new File("resources/images/");
        images = imageDirectory.listFiles();

// Strip off the 1st one because that's the caption file
        images = Arrays.copyOfRange(images, 1, images.length);

// Get the captions
        captions = new String[images.length];
        try {
            Scanner scan = new Scanner(new File("resources/images/captions.txt"));
            for (int i = 0; i < captions.length; i++) {
                captions[i] = scan.nextLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

// Get the texts
        try {
            Scanner scan = new Scanner(new File("resources/text_posts.txt"));
            int count = 0;
            while (scan.hasNextLine()) {
                count++;
                scan.nextLine();
            }
            texts = new String[count];
            scan = new Scanner(new File("resources/text_posts.txt"));
            for (int i = 0; i < count; i++) {
                texts[i] = scan.nextLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public File[] getImages() {
        return images;
    }

    public void setImages(File[] images) {
        this.images = images;
    }

    public String[] getCaptions() {
        return captions;
    }

    public void setCaptions(String[] captions) {
        this.captions = captions;
    }

    public String[] getTexts() {
        return texts;
    }

    public void setTexts(String[] texts) {
        this.texts = texts;
    }

    public Post GenerateTextPost(String date, String time) {
        String text = texts[rng.nextInt(texts.length)];
        TextPost textPost = new TextPost();
        textPost.getText();
        textPost.setTime(time);
        textPost.setDate(date);
        textPost.setText(text);
        String randomText = textPost.getText();
        return textPost;

    }

    public ImagePost GenerateImagePost(String date, String time) throws IOException {
        int x = rng.nextInt(images.length);
        BufferedImage image = ImageIO.read(images[x]);
        String caption = captions[x];
        ImagePost i = new ImagePost(image, caption);
        i.setTime(time);
        i.setDate(date);
        return i;
    }

    private String getMonthStr(int month) {
        String monthS = null;

        switch (month) {
            case 1:
                monthS = "January";
                break;
            case 2:
                monthS = "February";
                break;
            case 3:
                monthS = "March";
                break;
            case 4:
                monthS = "April";
                break;
            case 5:
                monthS = "May";
                break;
            case 6:
                monthS = "June";
                break;
            case 7:
                monthS = "July";
                break;
            case 8:
                monthS = "August";
                break;
            case 9:
                monthS = "September";
                break;
            case 10:
                monthS = "October";
                break;
            case 11:
                monthS = "November";
                break;
            case 12:
                monthS = "December";
                break;
        }

        return monthS;
    }

    public Post generatePost(Post generatePost) throws IOException {


    


    

    public Post[] generatePosts(int num) {

        return null;

    }
}
}
