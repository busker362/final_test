package com.mvc.member.model.dto;

public class MemberDTO implements java.io.Serializable {

    private String memberCode;
    private String memberName;
    private String memberAge;
    private String backNumber;
    private String position;
    private String height;
    private String weight;
    private String teamCode;

    private String teamName;
    private String region;
    public MemberDTO() {}

    public MemberDTO(String memberCode, String memberName, String memberAge, String backNumber, String position, String height, String weight, String teamCode, String teamName, String region) {
        this.memberCode = memberCode;
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.backNumber = backNumber;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.teamCode = teamCode;
        this.teamName = teamName;
        this.region = region;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(String memberAge) {
        this.memberAge = memberAge;
    }

    public String getBackNumber() {
        return backNumber;
    }

    public void setBackNumber(String backNumber) {
        this.backNumber = backNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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
        return "MemberDTO{" +
                "memberCode='" + memberCode + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberAge='" + memberAge + '\'' +
                ", backNumber='" + backNumber + '\'' +
                ", position='" + position + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", teamCode='" + teamCode + '\'' +
                ", teamName='" + teamName + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
