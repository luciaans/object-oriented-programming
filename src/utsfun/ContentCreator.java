package utsfun;

public abstract class ContentCreator {
    protected String contentType;

    public ContentCreator(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public abstract String generateContentSummary(String contentName);
}
