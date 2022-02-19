/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bobby Lo
 */
public abstract class Post {

    protected User user;
    private String date;
    private String time;

    /**
     * Get the value of date
     *
     * @return the value of date
     */
    public String getDate() {
        return date;
    }

    /**
     * Get the value of time
     *
     * @return the value of time
     */
    public String getTime() {
        return time;
    }

    public String getDateAndTime() {
        return null;

    }

    /**
     * Set the value of time
     *
     * @param time new value of time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Get the value of user
     *
     * @return the value of user
     */
    public User getUser() {
        return user;
    }

    /**
     * Set the value of user
     *
     * @param user new value of user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Set the value of date
     *
     * @param date new value of date
     */
    public void setDate(String date) {
        this.date = date;
    }
}