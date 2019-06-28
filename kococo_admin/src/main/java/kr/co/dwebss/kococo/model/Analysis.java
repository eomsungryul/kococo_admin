package kr.co.dwebss.kococo.model;

import java.util.Date;
import javax.persistence.*;

public class Analysis {
    /**
     * 분석ID
     */
    @Id
    @Column(name = "ANALYSIS_ID")
    private Integer analysisId;

    /**
     * 시작일자
     */
    @Column(name = "ANALYSIS_START_D")
    private Date analysisStartD;

    /**
     * 시작일시
     */
    @Column(name = "ANALYSIS_START_DT")
    private Date analysisStartDt;

    /**
     * 종료일자
     */
    @Column(name = "ANALYSIS_END_D")
    private Date analysisEndD;

    /**
     * 종료일시
     */
    @Column(name = "ANALYSIS_END_DT")
    private Date analysisEndDt;

    /**
     * 녹음ID
     */
    @Column(name = "RECORD_ID")
    private Integer recordId;

    /**
     * 파일명
     */
    @Column(name = "ANALYSIS_FILE_NM")
    private String analysisFileNm;

    /**
     * 앱내저장경로
     */
    @Column(name = "ANALYSIS_FILE_APP_PATH")
    private String analysisFileAppPath;

    /**
     * 서버업로드여부
     */
    @Column(name = "ANALYSIS_SERVER_UPLOAD_YN")
    private String analysisServerUploadYn;

    /**
     * 서버업로드경로
     */
    @Column(name = "ANALYSIS_SERVER_UPLOAD_PATH")
    private String analysisServerUploadPath;

    /**
     * 서버업로드일시
     */
    @Column(name = "ANALYSIS_SERVER_UPLOAD_DT")
    private Date analysisServerUploadDt;

    /**
     * 신고 여부
     */
    @Column(name = "CLAIM_YN")
    private String claimYn;

    /**
     * 사유코드
     */
    @Column(name = "CLAIM_REASON_CD")
    private Integer claimReasonCd;

    /**
     * 내용
     */
    @Column(name = "CLAIM_CONTENTS")
    private String claimContents;

    /**
     * 신고등록일시
     */
    @Column(name = "CLAIM_REGIST_DT")
    private Date claimRegistDt;

    @Column(name = "RECORDING_DATA")
    private String recordingData;

    /**
     * getter분석ID
     *
     * @return ANALYSIS_ID - 분석ID
     */
    public Integer getAnalysisId() {
        return analysisId;
    }

    /**
     * setter분석ID
     *
     * @param analysisId 분석ID
     */
    public void setAnalysisId(Integer analysisId) {
        this.analysisId = analysisId;
    }

    /**
     * getter시작일자
     *
     * @return ANALYSIS_START_D - 시작일자
     */
    public Date getAnalysisStartD() {
        return analysisStartD;
    }

    /**
     * setter시작일자
     *
     * @param analysisStartD 시작일자
     */
    public void setAnalysisStartD(Date analysisStartD) {
        this.analysisStartD = analysisStartD;
    }

    /**
     * getter시작일시
     *
     * @return ANALYSIS_START_DT - 시작일시
     */
    public Date getAnalysisStartDt() {
        return analysisStartDt;
    }

    /**
     * setter시작일시
     *
     * @param analysisStartDt 시작일시
     */
    public void setAnalysisStartDt(Date analysisStartDt) {
        this.analysisStartDt = analysisStartDt;
    }

    /**
     * getter종료일자
     *
     * @return ANALYSIS_END_D - 종료일자
     */
    public Date getAnalysisEndD() {
        return analysisEndD;
    }

    /**
     * setter종료일자
     *
     * @param analysisEndD 종료일자
     */
    public void setAnalysisEndD(Date analysisEndD) {
        this.analysisEndD = analysisEndD;
    }

    /**
     * getter종료일시
     *
     * @return ANALYSIS_END_DT - 종료일시
     */
    public Date getAnalysisEndDt() {
        return analysisEndDt;
    }

    /**
     * setter종료일시
     *
     * @param analysisEndDt 종료일시
     */
    public void setAnalysisEndDt(Date analysisEndDt) {
        this.analysisEndDt = analysisEndDt;
    }

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
     * getter파일명
     *
     * @return ANALYSIS_FILE_NM - 파일명
     */
    public String getAnalysisFileNm() {
        return analysisFileNm;
    }

    /**
     * setter파일명
     *
     * @param analysisFileNm 파일명
     */
    public void setAnalysisFileNm(String analysisFileNm) {
        this.analysisFileNm = analysisFileNm;
    }

    /**
     * getter앱내저장경로
     *
     * @return ANALYSIS_FILE_APP_PATH - 앱내저장경로
     */
    public String getAnalysisFileAppPath() {
        return analysisFileAppPath;
    }

    /**
     * setter앱내저장경로
     *
     * @param analysisFileAppPath 앱내저장경로
     */
    public void setAnalysisFileAppPath(String analysisFileAppPath) {
        this.analysisFileAppPath = analysisFileAppPath;
    }

    /**
     * getter서버업로드여부
     *
     * @return ANALYSIS_SERVER_UPLOAD_YN - 서버업로드여부
     */
    public String getAnalysisServerUploadYn() {
        return analysisServerUploadYn;
    }

    /**
     * setter서버업로드여부
     *
     * @param analysisServerUploadYn 서버업로드여부
     */
    public void setAnalysisServerUploadYn(String analysisServerUploadYn) {
        this.analysisServerUploadYn = analysisServerUploadYn;
    }

    /**
     * getter서버업로드경로
     *
     * @return ANALYSIS_SERVER_UPLOAD_PATH - 서버업로드경로
     */
    public String getAnalysisServerUploadPath() {
        return analysisServerUploadPath;
    }

    /**
     * setter서버업로드경로
     *
     * @param analysisServerUploadPath 서버업로드경로
     */
    public void setAnalysisServerUploadPath(String analysisServerUploadPath) {
        this.analysisServerUploadPath = analysisServerUploadPath;
    }

    /**
     * getter서버업로드일시
     *
     * @return ANALYSIS_SERVER_UPLOAD_DT - 서버업로드일시
     */
    public Date getAnalysisServerUploadDt() {
        return analysisServerUploadDt;
    }

    /**
     * setter서버업로드일시
     *
     * @param analysisServerUploadDt 서버업로드일시
     */
    public void setAnalysisServerUploadDt(Date analysisServerUploadDt) {
        this.analysisServerUploadDt = analysisServerUploadDt;
    }

    /**
     * getter신고 여부
     *
     * @return CLAIM_YN - 신고 여부
     */
    public String getClaimYn() {
        return claimYn;
    }

    /**
     * setter신고 여부
     *
     * @param claimYn 신고 여부
     */
    public void setClaimYn(String claimYn) {
        this.claimYn = claimYn;
    }

    /**
     * getter사유코드
     *
     * @return CLAIM_REASON_CD - 사유코드
     */
    public Integer getClaimReasonCd() {
        return claimReasonCd;
    }

    /**
     * setter사유코드
     *
     * @param claimReasonCd 사유코드
     */
    public void setClaimReasonCd(Integer claimReasonCd) {
        this.claimReasonCd = claimReasonCd;
    }

    /**
     * getter내용
     *
     * @return CLAIM_CONTENTS - 내용
     */
    public String getClaimContents() {
        return claimContents;
    }

    /**
     * setter내용
     *
     * @param claimContents 내용
     */
    public void setClaimContents(String claimContents) {
        this.claimContents = claimContents;
    }

    /**
     * getter신고등록일시
     *
     * @return CLAIM_REGIST_DT - 신고등록일시
     */
    public Date getClaimRegistDt() {
        return claimRegistDt;
    }

    /**
     * setter신고등록일시
     *
     * @param claimRegistDt 신고등록일시
     */
    public void setClaimRegistDt(Date claimRegistDt) {
        this.claimRegistDt = claimRegistDt;
    }

    /**
     * @return RECORDING_DATA
     */
    public String getRecordingData() {
        return recordingData;
    }

    /**
     * @param recordingData
     */
    public void setRecordingData(String recordingData) {
        this.recordingData = recordingData;
    }
}