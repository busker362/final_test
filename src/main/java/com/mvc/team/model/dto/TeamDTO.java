package com.mvc.team.model.dto;

public class TeamDTO implements java.io.Serializable {

    private String teamCode;
    private String teamName;
    private String region;
    public TeamDTO() {}

    public TeamDTO(String teamCode, String teamName, String region) {
        this.teamCode = teamCode;
        this.teamName = teamName;
        this.region = region;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "TeamDTO{" +
                "teamCode='" + teamCode + '\'' +
                ", teamName='" + teamName + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
