package com.firstcraft.audit;


import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.sql.Timestamp;
import java.time.Instant;

/**
 * @author Rashidi Zin
 */

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditEnabledEntity {

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private Timestamp createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private Timestamp lastModifiedDate;

    @Version
    private Integer version;

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }



    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }



    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
