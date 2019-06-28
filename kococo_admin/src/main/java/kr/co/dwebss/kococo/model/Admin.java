package kr.co.dwebss.kococo.model;

import javax.persistence.*;

public class Admin {
    /**
     * 관리자ID
     */
    @Id
    @Column(name = "ADMIN_ID")
    private String adminId;

    /**
     * 패스워드
     */
    @Column(name = "ADMIN_PW")
    private String adminPw;

    /**
     * getter관리자ID
     *
     * @return ADMIN_ID - 관리자ID
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * setter관리자ID
     *
     * @param adminId 관리자ID
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    /**
     * getter패스워드
     *
     * @return ADMIN_PW - 패스워드
     */
    public String getAdminPw() {
        return adminPw;
    }

    /**
     * setter패스워드
     *
     * @param adminPw 패스워드
     */
    public void setAdminPw(String adminPw) {
        this.adminPw = adminPw;
    }
}