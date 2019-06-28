package kr.co.dwebss.kococo.model;

import javax.persistence.*;

public class Code {
    /**
     * 코드
     */
    @Id
    @Column(name = "CODE")
    private Integer code;

    /**
     * 분류
     */
    @Column(name = "CODE_CATEOGRY")
    private String codeCateogry;

    /**
     * 값
     */
    @Column(name = "CODE_VALUE")
    private String codeValue;

    @Column(name = "CODE_DISPLAY_VALUE")
    private String codeDisplayValue;

    /**
     * getter코드
     *
     * @return CODE - 코드
     */
    public Integer getCode() {
        return code;
    }

    /**
     * setter코드
     *
     * @param code 코드
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * getter분류
     *
     * @return CODE_CATEOGRY - 분류
     */
    public String getCodeCateogry() {
        return codeCateogry;
    }

    /**
     * setter분류
     *
     * @param codeCateogry 분류
     */
    public void setCodeCateogry(String codeCateogry) {
        this.codeCateogry = codeCateogry;
    }

    /**
     * getter값
     *
     * @return CODE_VALUE - 값
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * setter값
     *
     * @param codeValue 값
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    /**
     * @return CODE_DISPLAY_VALUE
     */
    public String getCodeDisplayValue() {
        return codeDisplayValue;
    }

    /**
     * @param codeDisplayValue
     */
    public void setCodeDisplayValue(String codeDisplayValue) {
        this.codeDisplayValue = codeDisplayValue;
    }
}