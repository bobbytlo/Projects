/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Image;
import java.io.File;

/**
 *
 * @author Bobby Lo
 */
public class ImagePost extends Post {

    private Image image;

    private String caption;

    public ImagePost(Image image, String caption) {
        this.image = image;
        this.caption = caption;
    }

    /**
     * Get the value of caption
     *
     * @return the value of caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Set the value of caption
     *
     * @param caption new value of caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * Get the value of image
     *
     * @return the value of image
     */
    public Image getImage() {
        return image;
    }

    /**
     * Set the value of image
     *
     * @param image new value of image
     */
    public void setImage(Image image) {
        this.image = image;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP Spectre x360
 */
public class ImagePost {
    
}
