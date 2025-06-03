package Activities;

public abstract class Activity5 {
    protected String title;  // Protected so subclass can access

    // Abstract method to set the title
    public abstract void setTitle(String s);

    // Concrete method to get the title
    public String getTitle() {
        return title;
    }
}
