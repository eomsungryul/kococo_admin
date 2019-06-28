package kr.co.dwebss.kococo.model;

import java.util.Date;
import javax.persistence.*;

public class Record extends SearchVO{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8215572845632633268L;

	/**
     * 녹음ID
     */
    @Id
    @Column(name = "RECORD_ID")
    private Integer recordId;

    /**
     * 시작일자
     */
    @Column(name = "RECORD_START_D")
    private Date recordStartD;

    /**
     * 시작일시
     */
    @Column(name = "RECORD_START_DT")
    private Date recordStartDt;

    /**
     * 종료일자
     */
    @Column(name = "RECORD_END_D")
    private Date recordEndD;

    /**
     * 종료일시
     */
    @Column(name = "RECORD_END_DT")
    private Date recordEndDt;

    /**
     * 사용자앱ID
     */
    @Column(name = "USER_APP_ID")
    private String userAppId;

    /**
     * 컨설팅 여부
     */
    @Column(name = "CONSULTING_YN")
    private String consultingYn;

    /**
     * 컨설팅 답변 여부
     */
    @Column(name = "CONSULTING_REPLY_YN")
    private String consultingReplyYn;

    /**
     * 제목
     */
    @Column(name = "CONSULTING_TITLE")
    private String consultingTitle;

    /**
     * 내용
     */
    @Column(name = "CONSULTING_CONTENTS")
    private String consultingContents;

    /**
     * 상담등록일시
     */
    @Column(name = "CONSULTING_REGIST_DT")
    private Date consultingRegistDt;

    /**
     * 답변내용
     */
    @Column(name = "CONSULTING_REPLY_CONTENTS")
    private String consultingReplyContents;

    /**
     * 답변등록일시
     */
    @Column(name = "CONSULTING_REPLY_REGIST_DT")
    private Date consultingReplyRegistDt;

    /**
     * 관리자ID
     */
    @Column(name = "CONSULTING_REPLY_ADMIN_ID")
    private String consultingReplyAdminId;

    @Column(name = "SLEEP_STATUS_CD")
    private Integer sleepStatusCd;

    /**
     * getter녹음ID
     *
     * @return RECORD_ID - 녹음ID
     */
    public Integer getRecordId() {
        return recordId;
    }

    /**
     * setter녹음ID
     *
     * @param recordId 녹음ID
     */
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    /**
     * getter시작일자
     *
     * @return RECORD_START_D - 시작일자
     */
    public Date getRecordStartD() {
        return recordStartD;
    }

    /**
     * setter시작일자
     *
     * @param recordStartD 시작일자
     */
    public void setRecordStartD(Date recordStartD) {
        this.recordStartD = recordStartD;
    }

    /**
     * getter시작일시
     *
     * @return RECORD_START_DT - 시작일시
     */
    public Date getRecordStartDt() {
        return recordStartDt;
    }

    /**
     * setter시작일시
     *
     * @param recordStartDt 시작일시
     */
    public void setRecordStartDt(Date recordStartDt) {
        this.recordStartDt = recordStartDt;
    }

    /**
     * getter종료일자
     *
     * @return RECORD_END_D - 종료일자
     */
    public Date getRecordEndD() {
        return recordEndD;
    }

    /**
     * setter종료일자
     *
     * @param recordEndD 종료일자
     */
    public void setRecordEndD(Date recordEndD) {
        this.recordEndD = recordEndD;
    }

    /**
     * getter종료일시
     *
     * @return RECORD_END_DT - 종료일시
     */
    public Date getRecordEndDt() {
        return recordEndDt;
    }

    /**
     * setter종료일시
     *
     * @param recordEndDt 종료일시
     */
    public void setRecordEndDt(Date recordEndDt) {
        this.recordEndDt = recordEndDt;
    }

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
     * getter컨설팅 여부
     *
     * @return CONSULTING_YN - 컨설팅 여부
     */
    public String getConsultingYn() {
        return consultingYn;
    }

    /**
     * setter컨설팅 여부
     *
     * @param consultingYn 컨설팅 여부
     */
    public void setConsultingYn(String consultingYn) {
        this.consultingYn = consultingYn;
    }

    /**
     * getter컨설팅 답변 여부
     *
     * @return CONSULTING_REPLY_YN - 컨설팅 답변 여부
     */
    public String getConsultingReplyYn() {
        return consultingReplyYn;
    }

    /**
     * setter컨설팅 답변 여부
     *
     * @param consultingReplyYn 컨설팅 답변 여부
     */
    public void setConsultingReplyYn(String consultingReplyYn) {
        this.consultingReplyYn = consultingReplyYn;
    }

    /**
     * getter제목
     *
     * @return CONSULTING_TITLE - 제목
     */
    public String getConsultingTitle() {
        return consultingTitle;
    }

    /**
     * setter제목
     *
     * @param consultingTitle 제목
     */
    public void setConsultingTitle(String consultingTitle) {
        this.consultingTitle = consultingTitle;
    }

    /**
     * getter내용
     *
     * @return CONSULTING_CONTENTS - 내용
     */
    public String getConsultingContents() {
        return consultingContents;
    }

    /**
     * setter내용
     *
     * @param consultingContents 내용
     */
    public void setConsultingContents(String consultingContents) {
        this.consultingContents = consultingContents;
    }

    /**
     * getter상담등록일시
     *
     * @return CONSULTING_REGIST_DT - 상담등록일시
     */
    public Date getConsultingRegistDt() {
        return consultingRegistDt;
    }

    /**
     * setter상담등록일시
     *
     * @param consultingRegistDt 상담등록일시
     */
    public void setConsultingRegistDt(Date consultingRegistDt) {
        this.consultingRegistDt = consultingRegistDt;
    }

    /**
     * getter답변내용
     *
     * @return CONSULTING_REPLY_CONTENTS - 답변내용
     */
    public String getConsultingReplyContents() {
        return consultingReplyContents;
    }

    /**
     * setter답변내용
     *
     * @param consultingReplyContents 답변내용
     */
    public void setConsultingReplyContents(String consultingReplyContents) {
        this.consultingReplyContents = consultingReplyContents;
    }

    /**
     * getter답변등록일시
     *
     * @return CONSULTING_REPLY_REGIST_DT - 답변등록일시
     */
    public Date getConsultingReplyRegistDt() {
        return consultingReplyRegistDt;
    }

    /**
     * setter답변등록일시
     *
     * @param consultingReplyRegistDt 답변등록일시
     */
    public void setConsultingReplyRegistDt(Date consultingReplyRegistDt) {
        this.consultingReplyRegistDt = consultingReplyRegistDt;
    }

    /**
     * getter관리자ID
     *
     * @return CONSULTING_REPLY_ADMIN_ID - 관리자ID
     */
    public String getConsultingReplyAdminId() {
        return consultingReplyAdminId;
    }

    /**
     * setter관리자ID
     *
     * @param consultingReplyAdminId 관리자ID
     */
    public void setConsultingReplyAdminId(String consultingReplyAdminId) {
        this.consultingReplyAdminId = consultingReplyAdminId;
    }

    /**
     * @return SLEEP_STATUS_CD
     */
    public Integer getSleepStatusCd() {
        return sleepStatusCd;
    }

    /**
     * @param sleepStatusCd
     */
    public void setSleepStatusCd(Integer sleepStatusCd) {
        this.sleepStatusCd = sleepStatusCd;
    }
}