package android.vinu.com.epoiserecruiter.model;

import java.io.Serializable;

/**
 * Created by ePoise on 12/9/2016.
 */

public class AppliedCandidateList implements Serializable {

    private String appliedCandidateName;
    private String appliedCandidateEmail;
    private String appliedCandidateImage;

    public AppliedCandidateList(String appliedCandidateName, String appliedCandidateEmail) {
        this.appliedCandidateName = appliedCandidateName;
        this.appliedCandidateEmail = appliedCandidateEmail;
    }

    public String getAppliedCandidateName() {
        return appliedCandidateName;
    }

    public void setAppliedCandidateName(String appliedCandidateName) {
        this.appliedCandidateName = appliedCandidateName;
    }

    public String getAppliedCandidateEmail() {
        return appliedCandidateEmail;
    }

    public void setAppliedCandidateEmail(String appliedCandidateEmail) {
        this.appliedCandidateEmail = appliedCandidateEmail;
    }

    public String getAppliedCandidateImage() {
        return appliedCandidateImage;
    }

    public void setAppliedCandidateImage(String appliedCandidateImage) {
        this.appliedCandidateImage = appliedCandidateImage;
    }
}
