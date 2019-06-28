package kr.co.dwebss.kococo.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    /**
     * 사용자앱ID
     */
    @Id
    @Column(name = "USER_APP_ID")
    private String userAppId;

    /**
     * 연령
     */
    @Column(name = "USER_AGE")
    private Integer userAge;

    /**
     * 성별
     */
    @Column(name = "USER_GENDER")
    private String userGender;

    /**
     * 체중
     */
    @Column(name = "USER_WEIGHT")
    private Integer userWeight;

    /**
     * 신장
     */
    @Column(name = "USER_HEIGHT")
    private Integer userHeight;

    /**
     * 사용자등록일시
     */
    @Column(name = "USER_REGIST_DT")
    private Date userRegistDt;

    @Column(name = "DEVICE_FILE_STORE_DAY_TERM")
    private Integer deviceFileStoreDayTerm;

    /**
     * getter사용자앱ID
     *
     * @return USER_APP_ID - 사용자앱ID
     */
    public String getUserAppId() {
        return userAppId;
    }

    /**
     * setter사용자앱ID
     *
     * @param userAppId 사용자앱ID
     */
    public void setUserAppId(String userAppId) {
        this.userAppId = userAppId;
    }

    /**
     * getter연령
     *
     * @return USER_AGE - 연령
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * setter연령
     *
     * @param userAge 연령
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * getter성별
     *
     * @return USER_GENDER - 성별
     */
    public String getUserGender() {
        return userGender;
    }

    /**
     * setter성별
     *
     * @param userGender 성별
     */
    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    /**
     * getter체중
     *
     * @return USER_WEIGHT - 체중
     */
    public Integer getUserWeight() {
        return userWeight;
    }

    /**
     * setter체중
     *
     * @param userWeight 체중
     */
    public void setUserWeight(Integer userWeight) {
        this.userWeight = userWeight;
    }

    /**
     * getter신장
     *
     * @return USER_HEIGHT - 신장
     */
    public Integer getUserHeight() {
        return userHeight;
    }

    /**
     * setter신장
     *
     * @param userHeight 신장
     */
    public void setUserHeight(Integer userHeight) {
        this.userHeight = userHeight;
    }

    /**
     * getter사용자등록일시
     *
     * @return USER_REGIST_DT - 사용자등록일시
     */
    public Date getUserRegistDt() {
        return userRegistDt;
    }

    /**
     * setter사용자등록일시
     *
     * @param userRegistDt 사용자등록일시
     */
    public void setUserRegistDt(Date userRegistDt) {
        this.userRegistDt = userRegistDt;
    }

    /**
     * @return DEVICE_FILE_STORE_DAY_TERM
     */
    public Integer getDeviceFileStoreDayTerm() {
        return deviceFileStoreDayTerm;
    }

    /**
     * @param deviceFileStoreDayTerm
     */
    public void setDeviceFileStoreDayTerm(Integer deviceFileStoreDayTerm) {
        this.deviceFileStoreDayTerm = deviceFileStoreDayTerm;
    }
}