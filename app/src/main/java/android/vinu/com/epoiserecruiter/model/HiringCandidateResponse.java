package android.vinu.com.epoiserecruiter.model;

import java.io.Serializable;

/**
 * Created by ImVB9 on 12/15/2016.
 */

public class HiringCandidateResponse implements Serializable {

    private String videoResponseUrl;

    public HiringCandidateResponse(String videoResponseUrl) {
        this.videoResponseUrl = videoResponseUrl;
    }

    public String getVideoResponseUrl() {
        return videoResponseUrl;
    }

    public void setVideoResponseUrl(String videoResponseUrl) {
        this.videoResponseUrl = videoResponseUrl;
    }
}
