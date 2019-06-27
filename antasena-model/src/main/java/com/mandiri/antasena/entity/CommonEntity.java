package com.mandiri.antasena.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;

@MappedSuperclass
public class CommonEntity<T> {

	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;

	@Transient
	protected Logger logger = Logger.getLogger(this.getClass());

	@Transient
	protected String[] ignoreList = new String[] {};

	@Column(name = "created_by")
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "created_date")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "modifed_by")
	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Column(name = "modifed_date")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public CommonEntity() {
		ignoreList = new String[] {};
	}

	public void fromDomain(T domain) {
		fromDomain(domain, true);
	}

	public void fromDomain(T domain, boolean includeChild) {

		if (domain != null)
			BeanUtils.copyProperties(domain, this, ignoreList);
	}

	public T toDomain(Class<T> clazz) {
		return toDomain(clazz, false);
	}

	public T toDomain(Class<T> clazz, boolean includeChild) {
		T result = null;

		try {
			result = clazz.newInstance();
			BeanUtils.copyProperties(this, result, ignoreList);
		} catch (Exception e) {
			logger.debug("error converting to domain :", e);
		}

		return result;
	}

}