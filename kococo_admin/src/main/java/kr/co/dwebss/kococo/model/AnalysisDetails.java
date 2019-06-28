package kr.co.dwebss.kococo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "analysis_details")
public class AnalysisDetails {
    /**
     * 분석세부ID
     */
    @Id
    @Column(name = "ANALYSIS_DETAILS_ID")
    private Integer analysisDetailsId;

    /**
     * 분석유형
     */
    @Column(name = "TERM_TYPE_CD")
    private Integer termTypeCd;

    /**
     * 시작일시
     */
    @Column(name = "TERM_START_DT")
    private Date termStartDt;

    /**
     * 종료일시
     */
    @Column(name = "TERM_END_DT")
    private Date termEndDt;

    /**
     * 분석ID
     */
    @Column(name = "ANALYSIS_ID")
    private Integer analysisId;

    @Column(name = "ANALYSIS_DATA")
    private String analysisData;

    /**
     * getter분석세부ID
     *
     * @return ANALYSIS_DETAILS_ID - 분석세부ID
     */
    public Integer getAnalysisDetailsId() {
        return analysisDetailsId;
    }

    /**
     * setter분석세부ID
     *
     * @param analysisDetailsId 분석세부ID
     */
    public void setAnalysisDetailsId(Integer analysisDetailsId) {
        this.analysisDetailsId = analysisDetailsId;
    }

    /**
     * getter분석유형
     *
     * @return TERM_TYPE_CD - 분석유형
     */
    public Integer getTermTypeCd() {
        return termTypeCd;
    }

    /**
     * setter분석유형
     *
     * @param termTypeCd 분석유형
     */
    public void setTermTypeCd(Integer termTypeCd) {
        this.termTypeCd = termTypeCd;
    }

    /**
     * getter시작일시
     *
     * @return TERM_START_DT - 시작일시
     */
    public Date getTermStartDt() {
        return termStartDt;
    }

    /**
     * setter시작일시
     *
     * @param termStartDt 시작일시
     */
    public void setTermStartDt(Date termStartDt) {
        this.termStartDt = termStartDt;
    }

    /**
     * getter종료일시
     *
     * @return TERM_END_DT - 종료일시
     */
    public Date getTermEndDt() {
        return termEndDt;
    }

    /**
     * setter종료일시
     *
     * @param termEndDt 종료일시
     */
    public void setTermEndDt(Date termEndDt) {
        this.termEndDt = termEndDt;
    }

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
     * @return ANALYSIS_DATA
     */
    public String getAnalysisData() {
        return analysisData;
    }

    /**
     * @param analysisData
     */
    public void setAnalysisData(String analysisData) {
        this.analysisData = analysisData;
    }
}