package Audiomanagertest;

public class Visual extends Media {
    private float qualityVisual;

    public Visual(String title, String creator, String description, float size, String duration, float value, float qualityVisual) {
        super(title, creator, description, size, duration, value);
        this.qualityVisual = qualityVisual;
    }

    public float getQualityVisual() {
        return qualityVisual;
    }

    public void setQualityVisual(float qualityVisual) {
        this.qualityVisual = qualityVisual;
    }

    @Override
    public String toString() {
        return "Visual{" +
                "qualityVisual=" + qualityVisual +
                '}';
    }
}
