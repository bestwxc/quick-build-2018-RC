package com.jhopesoft.framework.dao.entity.dictionary;
// Generated 2016-11-2 20:01:19 by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import com.alibaba.fastjson.annotation.JSONField;
import com.jhopesoft.framework.dao.entity.dataobject.FDataobjectfield;

/**
 * FObjectfieldproperty generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@DynamicUpdate
@Table(name = "f_objectfieldproperty", uniqueConstraints = @UniqueConstraint(columnNames = "propertyname"))
@Cache(region = "beanCache", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class FObjectfieldproperty implements java.io.Serializable {

  private String propertyid;
  private String propertyname;
  private Boolean caninput;
  private Boolean canmult;
  private String pfieldtype;
  private Boolean addtargetfieldvalue;
  private String fieldid;
  private String sqlstatement;
  private String value;
  private String remark;
  private Set<FDataobjectfield> FDataobjectfields = new HashSet<FDataobjectfield>(0);

  public FObjectfieldproperty() {}


  @GenericGenerator(name = "generator", strategy = "uuid.hex")
  @Id
  @GeneratedValue(generator = "generator")
  @Column(name = "propertyid", unique = true, nullable = false, length = 40)
  public String getPropertyid() {
    return this.propertyid;
  }

  public void setPropertyid(String propertyid) {
    this.propertyid = propertyid;
  }

  @Column(name = "propertyname", unique = true, nullable = false, length = 50)
  public String getPropertyname() {
    return this.propertyname;
  }

  public void setPropertyname(String propertyname) {
    this.propertyname = propertyname;
  }

  @Column(name = "caninput")
  public Boolean getCaninput() {
    return this.caninput;
  }

  public void setCaninput(Boolean caninput) {
    this.caninput = caninput;
  }

  @Column(name = "canmult")
  public Boolean getCanmult() {
    return this.canmult;
  }

  public void setCanmult(Boolean canmult) {
    this.canmult = canmult;
  }

  @Column(name = "pfieldtype", length = 10)
  public String getPfieldtype() {
    return this.pfieldtype;
  }

  public void setPfieldtype(String pfieldtype) {
    this.pfieldtype = pfieldtype;
  }

  @Column(name = "value", length = 2000)
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Column(name = "remark", length = 200)
  public String getRemark() {
    return this.remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "FObjectfieldproperty")
  @JSONField(serialize = false)
  public Set<FDataobjectfield> getFDataobjectfields() {
    return this.FDataobjectfields;
  }

  public void setFDataobjectfields(Set<FDataobjectfield> FDataobjectfields) {
    this.FDataobjectfields = FDataobjectfields;
  }


  public Boolean getAddtargetfieldvalue() {
    return addtargetfieldvalue == null ? false : addtargetfieldvalue;
  }


  public void setAddtargetfieldvalue(Boolean addtargetfieldvalue) {
    this.addtargetfieldvalue = addtargetfieldvalue;
  }


  public String getFieldid() {
    return fieldid;
  }


  public void setFieldid(String fieldid) {
    this.fieldid = fieldid;
  }

  @Column(name = "sqlstatement", length = 2000)
  public String getSqlstatement() {
    return sqlstatement;
  }


  public void setSqlstatement(String sqlstatement) {
    this.sqlstatement = sqlstatement;
  }

}
