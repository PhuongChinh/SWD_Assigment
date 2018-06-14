package models;

/**
 *
 * @author Admin
 */
public class Intro {
    private String type;
    private String title;
    private String content;
    private String imageUrl;

    public Intro() {
        
    }

    public Intro(String type, String title, String content, String imageUrl) {
        this.type = type;
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
