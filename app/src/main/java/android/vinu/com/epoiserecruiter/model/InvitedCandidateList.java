package android.vinu.com.epoiserecruiter.model;

import java.io.Serializable;

/**
 * Created by ImVB9 on 12/9/2016.
 */

public class InvitedCandidateList implements Serializable {

    private String candidateName;
    private String candidateEmailID;

    public InvitedCandidateList(String candidateName, String candidateEmailID) {
        this.candidateName = candidateName;
        this.candidateEmailID = candidateEmailID;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateEmailID() {
        return candidateEmailID;
    }

    public void setCandidateEmailID(String candidateEmailID) {
        this.candidateEmailID = candidateEmailID;
    }
}
