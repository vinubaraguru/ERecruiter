package android.vinu.com.epoiserecruiter.model;

import java.io.Serializable;

/**
 * Created by ImVB9 on 11/27/2016.
 */

public class OrganizationList implements Serializable {

    private String orgImg;
    private String orgName;
    private String orgType;

    public OrganizationList(String orgName, String orgType) {
        this.orgName = orgName;
        this.orgType = orgType;
    }

    public String getOrgImg() {
        return orgImg;
    }

    public void setOrgImg(String orgImg) {
        this.orgImg = orgImg;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }
}
