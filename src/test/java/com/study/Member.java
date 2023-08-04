package com.study;


import javax.persistence.*;
import java.util.Date;

@Entity(name = "member")
@Table(name = "tbl_member")
public class Member {

    @Id
    @Column(name = "member_no", nullable = false)
    private int memberNo;
    @Column(name = "member_name", nullable = false)
    private String memberName; //회원이름
    @Column(name = "nickname", nullable = false, length = 10, unique = true)
    private String memberNick; // 회원 닉네임
    @Column(name = "phone", nullable = false, columnDefinition = "default '010-0000-0000")
    private String phone; // 전화번호
    @Column(name = "zip_code", nullable = false)
    private String zipCode; // 우편번호
    @Column(name = "general_address", nullable = false)
    private String generalAddress; // 일반주소
    @Column(name = "address", nullable = false)
    private String address; // 상세주소
    @Column(name = "member_role", nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleType membrerRole; //권한
    @Column(name = "status", nullable = false)
    private String status; //상태
    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date; //등록일
    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate; //수정일
    @Column(name = "remove_date")
    @Temporal(TemporalType.DATE)
    private Date removeDate; //삭제일

    public Member() {
    }

    public Member(int memberNo, String memberName, String memberNick, String phone, String zipCode, String generalAddress, String address, RoleType membrerRole, String status, Date date, Date updateDate, Date removeDate) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.memberNick = memberNick;
        this.phone = phone;
        this.zipCode = zipCode;
        this.generalAddress = generalAddress;
        this.address = address;
        this.membrerRole = membrerRole;
        this.status = status;
        this.date = date;
        this.updateDate = updateDate;
        this.removeDate = removeDate;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberNick() {
        return memberNick;
    }

    public void setMemberNick(String memberNick) {
        this.memberNick = memberNick;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getGeneralAddress() {
        return generalAddress;
    }

    public void setGeneralAddress(String generalAddress) {
        this.generalAddress = generalAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RoleType getMembrerRole() {
        return membrerRole;
    }

    public void setMembrerRole(RoleType membrerRole) {
        this.membrerRole = membrerRole;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getRemoveDate() {
        return removeDate;
    }

    public void setRemoveDate(Date removeDate) {
        this.removeDate = removeDate;
    }
}
