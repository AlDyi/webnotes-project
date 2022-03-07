package notes.domain;

public class Note {
    private String headerText;
    private String headerFont;
    private int headerFontSize;
    private String bodyText;
    private String bodyFont;
    private int bodyFontSize;
    private int id;

    public Note(String headerText, String headerFont, int headerFontSize,
                String bodyText, String bodyFont, int bodyFontSize) {
        this.headerText = headerText;
        this.headerFont = headerFont;
        this.headerFontSize = headerFontSize;
        this.bodyText = bodyText;
        this.bodyFont = bodyFont;
        this.bodyFontSize = bodyFontSize;
    }

    public int getBodyFontSize() {
        return bodyFontSize;
    }

    public int getHeaderFontSize() {
        return headerFontSize;
    }

    public String getBodyFont() {
        return bodyFont;
    }

    public String getBodyText() {
        return bodyText;
    }

    public String getHeaderFont() {
        return headerFont;
    }

    public String getHeaderText() {
        return headerText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
