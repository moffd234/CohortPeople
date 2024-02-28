package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String color;
    private String birthMonth;
    private String bev;
    private String github;
    private String handed;
    private boolean hasPets;
    private boolean likesPets;

    public Person(String fname, String lname) {
        this.firstname = fname;
        this.lastname = lname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getBirthMonth(){
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth){
        this.birthMonth = birthMonth;
    }

    public String getBev(){
        return bev;
    }

    public void setBev(String bev){
        this.bev = bev;
    }

    public String getGithub(){
        return github;
    }

    public void setGithub(String github){
        this.github = github;
    }

    public String getHanded(){
        return handed;
    }

    public void setHanded(String handed){
        this.handed = handed;
    }

    public boolean getHasPets(){
        return hasPets;
    }

    public void setHasPets(boolean hasPets){
        this.hasPets = hasPets;
    }

    public boolean getLikesPets(){
        return likesPets;
    }

    public void setLikesPets(boolean likesPets){
        this.likesPets = likesPets;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String toString() {
        return this.lastname + ", " + this.firstname;
    }
}
