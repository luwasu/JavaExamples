package fileInputOutput.advancedExamples.postIt;

import java.io.Serializable;
import java.util.Date;

class Message implements Serializable {

    private final Date date = new Date();
    private final String text;

    public Message(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }
}
