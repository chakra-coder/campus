package org.campus.model;

import java.util.Date;

import org.campus.model.enums.ApiType;

public class User {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_user.UserUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String useruid;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.StudentID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String studentid;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_user.RealName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String realname;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.NamePinYin
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String namepinyin;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.NameFirstLetter
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String namefirstletter;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_user.NickName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_user.SexType
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String sextype;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_user.Email
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_user.IDCard
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String idcard;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_user.HeadPic
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String headpic;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.BackGroundImg
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String backgroundimg;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.SchoolUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String schooluid;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.SchoolName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String schoolname;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.CollegeUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String collegeuid;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.CollegeName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String collegename;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.ProfessionUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String professionuid;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.ProfessionName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String professionname;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.InSchoolYear
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Integer inschoolyear;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_user.CityCode
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String citycode;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_user.CityName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String cityname;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.ProvinceCode
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String provincecode;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.ProvinceName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String provincename;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.IsValidated
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Integer isvalidated;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_user.IsLocked
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Integer islocked;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_user.IsOpen
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Integer isopen;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.IsGraduate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Integer isgraduate;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_user.CreateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String createby;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.CreateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Date createdate;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.LastUpdateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private String lastupdateby;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * ts_app_user.LastUpdateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Date lastupdatedate;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ts_app_user.IsActive
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    private Integer isactive;

    private Long integral;

    private Integer logincount;

    private ApiType apiType;

    private String apiId;

    private String nickFirstLetter;

    private String auditFlag;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.UserUID
     *
     * @return the value of ts_app_user.UserUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getUseruid() {
        return useruid;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.UserUID
     *
     * @param useruid the value for ts_app_user.UserUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setUseruid(String useruid) {
        this.useruid = useruid == null ? null : useruid.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.StudentID
     *
     * @return the value of ts_app_user.StudentID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getStudentid() {
        return studentid;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.StudentID
     *
     * @param studentid the value for ts_app_user.StudentID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.RealName
     *
     * @return the value of ts_app_user.RealName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.RealName
     *
     * @param realname the value for ts_app_user.RealName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.NamePinYin
     *
     * @return the value of ts_app_user.NamePinYin
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getNamepinyin() {
        return namepinyin;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.NamePinYin
     *
     * @param namepinyin the value for ts_app_user.NamePinYin
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setNamepinyin(String namepinyin) {
        this.namepinyin = namepinyin == null ? null : namepinyin.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.NameFirstLetter
     *
     * @return the value of ts_app_user.NameFirstLetter
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getNamefirstletter() {
        return namefirstletter;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.NameFirstLetter
     *
     * @param namefirstletter the value for ts_app_user.NameFirstLetter
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setNamefirstletter(String namefirstletter) {
        this.namefirstletter = namefirstletter == null ? null : namefirstletter.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.NickName
     *
     * @return the value of ts_app_user.NickName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.NickName
     *
     * @param nickname the value for ts_app_user.NickName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.SexType
     *
     * @return the value of ts_app_user.SexType
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getSextype() {
        return sextype;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.SexType
     *
     * @param sextype the value for ts_app_user.SexType
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setSextype(String sextype) {
        this.sextype = sextype == null ? null : sextype.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.Email
     *
     * @return the value of ts_app_user.Email
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.Email
     *
     * @param email the value for ts_app_user.Email
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.IDCard
     *
     * @return the value of ts_app_user.IDCard
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.IDCard
     *
     * @param idcard the value for ts_app_user.IDCard
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.HeadPic
     *
     * @return the value of ts_app_user.HeadPic
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getHeadpic() {
        return headpic;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.HeadPic
     *
     * @param headpic the value for ts_app_user.HeadPic
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setHeadpic(String headpic) {
        this.headpic = headpic == null ? null : headpic.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.BackGroundImg
     *
     * @return the value of ts_app_user.BackGroundImg
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getBackgroundimg() {
        return backgroundimg;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.BackGroundImg
     *
     * @param backgroundimg the value for ts_app_user.BackGroundImg
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setBackgroundimg(String backgroundimg) {
        this.backgroundimg = backgroundimg == null ? null : backgroundimg.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.SchoolUID
     *
     * @return the value of ts_app_user.SchoolUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getSchooluid() {
        return schooluid;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.SchoolUID
     *
     * @param schooluid the value for ts_app_user.SchoolUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setSchooluid(String schooluid) {
        this.schooluid = schooluid == null ? null : schooluid.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.SchoolName
     *
     * @return the value of ts_app_user.SchoolName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getSchoolname() {
        return schoolname;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.SchoolName
     *
     * @param schoolname the value for ts_app_user.SchoolName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.CollegeUID
     *
     * @return the value of ts_app_user.CollegeUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getCollegeuid() {
        return collegeuid;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.CollegeUID
     *
     * @param collegeuid the value for ts_app_user.CollegeUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setCollegeuid(String collegeuid) {
        this.collegeuid = collegeuid == null ? null : collegeuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.CollegeName
     *
     * @return the value of ts_app_user.CollegeName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getCollegename() {
        return collegename;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.CollegeName
     *
     * @param collegename the value for ts_app_user.CollegeName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setCollegename(String collegename) {
        this.collegename = collegename == null ? null : collegename.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.ProfessionUID
     *
     * @return the value of ts_app_user.ProfessionUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getProfessionuid() {
        return professionuid;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.ProfessionUID
     *
     * @param professionuid the value for ts_app_user.ProfessionUID
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setProfessionuid(String professionuid) {
        this.professionuid = professionuid == null ? null : professionuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.ProfessionName
     *
     * @return the value of ts_app_user.ProfessionName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getProfessionname() {
        return professionname;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.ProfessionName
     *
     * @param professionname the value for ts_app_user.ProfessionName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setProfessionname(String professionname) {
        this.professionname = professionname == null ? null : professionname.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.InSchoolYear
     *
     * @return the value of ts_app_user.InSchoolYear
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Integer getInschoolyear() {
        return inschoolyear;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.InSchoolYear
     *
     * @param inschoolyear the value for ts_app_user.InSchoolYear
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setInschoolyear(Integer inschoolyear) {
        this.inschoolyear = inschoolyear;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.CityCode
     *
     * @return the value of ts_app_user.CityCode
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.CityCode
     *
     * @param citycode the value for ts_app_user.CityCode
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.CityName
     *
     * @return the value of ts_app_user.CityName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.CityName
     *
     * @param cityname the value for ts_app_user.CityName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.ProvinceCode
     *
     * @return the value of ts_app_user.ProvinceCode
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getProvincecode() {
        return provincecode;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.ProvinceCode
     *
     * @param provincecode the value for ts_app_user.ProvinceCode
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode == null ? null : provincecode.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.ProvinceName
     *
     * @return the value of ts_app_user.ProvinceName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getProvincename() {
        return provincename;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.ProvinceName
     *
     * @param provincename the value for ts_app_user.ProvinceName
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setProvincename(String provincename) {
        this.provincename = provincename == null ? null : provincename.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.IsValidated
     *
     * @return the value of ts_app_user.IsValidated
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Integer getIsvalidated() {
        return isvalidated;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.IsValidated
     *
     * @param isvalidated the value for ts_app_user.IsValidated
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setIsvalidated(Integer isvalidated) {
        this.isvalidated = isvalidated;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.IsLocked
     *
     * @return the value of ts_app_user.IsLocked
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Integer getIslocked() {
        return islocked;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.IsLocked
     *
     * @param islocked the value for ts_app_user.IsLocked
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setIslocked(Integer islocked) {
        this.islocked = islocked;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.IsOpen
     *
     * @return the value of ts_app_user.IsOpen
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Integer getIsopen() {
        return isopen;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.IsOpen
     *
     * @param isopen the value for ts_app_user.IsOpen
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setIsopen(Integer isopen) {
        this.isopen = isopen;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.IsGraduate
     *
     * @return the value of ts_app_user.IsGraduate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Integer getIsgraduate() {
        return isgraduate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.IsGraduate
     *
     * @param isgraduate the value for ts_app_user.IsGraduate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setIsgraduate(Integer isgraduate) {
        this.isgraduate = isgraduate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.CreateBy
     *
     * @return the value of ts_app_user.CreateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.CreateBy
     *
     * @param createby the value for ts_app_user.CreateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.CreateDate
     *
     * @return the value of ts_app_user.CreateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.CreateDate
     *
     * @param createdate the value for ts_app_user.CreateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.LastUpdateBy
     *
     * @return the value of ts_app_user.LastUpdateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public String getLastupdateby() {
        return lastupdateby;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.LastUpdateBy
     *
     * @param lastupdateby the value for ts_app_user.LastUpdateBy
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setLastupdateby(String lastupdateby) {
        this.lastupdateby = lastupdateby == null ? null : lastupdateby.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.LastUpdateDate
     *
     * @return the value of ts_app_user.LastUpdateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Date getLastupdatedate() {
        return lastupdatedate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.LastUpdateDate
     *
     * @param lastupdatedate the value for ts_app_user.LastUpdateDate
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setLastupdatedate(Date lastupdatedate) {
        this.lastupdatedate = lastupdatedate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column
     * ts_app_user.IsActive
     *
     * @return the value of ts_app_user.IsActive
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public Integer getIsactive() {
        return isactive;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * ts_app_user.IsActive
     *
     * @param isactive the value for ts_app_user.IsActive
     *
     * @mbggenerated Sun Aug 09 23:25:01 CST 2015
     */
    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    public Long getIntegral() {
        return integral;
    }

    public void setIntegral(Long integral) {
        this.integral = integral;
    }

    public Integer getLogincount() {
        return logincount;
    }

    public void setLogincount(Integer logincount) {
        this.logincount = logincount;
    }

    public ApiType getApiType() {
        return apiType;
    }

    public void setApiType(ApiType apiType) {
        this.apiType = apiType;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getNickFirstLetter() {
        return nickFirstLetter;
    }

    public void setNickFirstLetter(String nickFirstLetter) {
        this.nickFirstLetter = nickFirstLetter;
    }

    public String getAuditFlag() {
        return auditFlag;
    }

    public void setAuditFlag(String auditFlag) {
        this.auditFlag = auditFlag;
    }

}