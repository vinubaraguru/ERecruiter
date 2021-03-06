package android.vinu.com.epoiserecruiter.model;

import java.io.Serializable;

/**
 * Created by ImVB9 on 11/29/2016.
 */

public class InviteOppList implements Serializable {

    private String oppImage;
    private String oppTitle;
    private String oppPublishedDate;

    public InviteOppList(String oppTitle, String oppPublishedDate) {
        this.oppTitle = oppTitle;
        this.oppPublishedDate = oppPublishedDate;
    }

    public String getOppImage() {
        return oppImage;
    }

    public void setOppImage(String oppImage) {
        this.oppImage = oppImage;
    }

    public String getOppTitle() {
        return oppTitle;
    }

    public void setOppTitle(String oppTitle) {
        this.oppTitle = oppTitle;
    }

    public String getOppPublishedDate() {
        return oppPublishedDate;
    }

    public void setOppPublishedDate(String oppPublishedDate) {
        this.oppPublishedDate = oppPublishedDate;
    }
}
