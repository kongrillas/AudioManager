package Audiomanagertest;

public  class Media {
    private String name;
    private String creator;
    private String description;
    private float size;
    private String duration;
    private float value;


    public Media(String title, String creator, String description, float size, String duration, float value) {
        this.name = title;
        this.creator = creator;
        this.description = description;
        this.size = size;
        this.duration = duration;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + name + '\'' +
                ", creator='" + creator + '\'' +
                ", description='" + description + '\'' +
                ", size=" + size +
                ", duration='" + duration + '\'' +
                ", value=" + value +
                '}';
    }
}
