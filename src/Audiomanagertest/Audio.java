package Audiomanagertest;

public class Audio extends Media {
    private String type;

    public Audio(String title, String creator, String description, float size, String duration, float value, String type) {
        super(title, creator, description, size, duration, value);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "type='" + type + '\'' +
                '}';
    }
}
