package android.vinu.com.epoiserecruiter.model;

import java.io.Serializable;

/**
 * Created by ImVB9 on 12/13/2016.
 */

public class TrainingCandidatesList implements Serializable {

    private String trainingCandidateName;
    private String trainingCandidateEmail;
    private String trainingCandidateImage;

    public TrainingCandidatesList(String trainingCandidateName, String trainingCandidateEmail) {
        this.trainingCandidateName = trainingCandidateName;
        this.trainingCandidateEmail = trainingCandidateEmail;
    }

    public String getTrainingCandidateName() {
        return trainingCandidateName;
    }

    public void setTrainingCandidateName(String trainingCandidateName) {
        this.trainingCandidateName = trainingCandidateName;
    }

    public String getTrainingCandidateEmail() {
        return trainingCandidateEmail;
    }

    public void setTrainingCandidateEmail(String trainingCandidateEmail) {
        this.trainingCandidateEmail = trainingCandidateEmail;
    }

    public String getTrainingCandidateImage() {
        return trainingCandidateImage;
    }

    public void setTrainingCandidateImage(String trainingCandidateImage) {
        this.trainingCandidateImage = trainingCandidateImage;
    }
}
