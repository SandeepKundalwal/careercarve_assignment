package com.iit.placement.careercarve.assignment.scheduler.models;

import java.util.List;

public class MentorUpdateDTO {
    private Long id;
    private String name;
    private String email;
    private String mobileNo;
    private String companyName;
    private String jobTitle;
    List<AreaOfInterestEntityDTO> areaOfInterestEntityDTO;

    public MentorUpdateDTO() {
    }

    public MentorUpdateDTO(Long id, String name, String email, String mobileNo, String companyName, String jobTitle, List<AreaOfInterestEntityDTO> areaOfInterestEntityDTO) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.areaOfInterestEntityDTO = areaOfInterestEntityDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<AreaOfInterestEntityDTO> getAreaOfInterestEntityDTO() {
        return areaOfInterestEntityDTO;
    }

    public void setAreaOfInterestEntityDTO(List<AreaOfInterestEntityDTO> areaOfInterestEntityDTO) {
        this.areaOfInterestEntityDTO = areaOfInterestEntityDTO;
    }
}
