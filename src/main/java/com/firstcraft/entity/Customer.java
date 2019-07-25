package com.firstcraft.entity;


import com.firstcraft.audit.AuditEnabledEntity;
import groovy.transform.ToString;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="customer")
@Audited
public class Customer extends AuditEnabledEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "mInitial")
    private String mInitial;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "created_date")
    private String created_date;

    @Column(name = "date_of_birth")
    private String date_of_birth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getmInitial() {
        return mInitial;
    }

    public void setmInitial(String mInitial) {
        this.mInitial = mInitial;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", mInitial='" + mInitial + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", created_date='" + created_date + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (getId() != null ? !getId().equals(customer.getId()) : customer.getId() != null) return false;
        if (getFname() != null ? !getFname().equals(customer.getFname()) : customer.getFname() != null) return false;
        if (getLname() != null ? !getLname().equals(customer.getLname()) : customer.getLname() != null) return false;
        if (getmInitial() != null ? !getmInitial().equals(customer.getmInitial()) : customer.getmInitial() != null)
            return false;
        if (getZipcode() != null ? !getZipcode().equals(customer.getZipcode()) : customer.getZipcode() != null)
            return false;
        if (getCreated_date() != null ? !getCreated_date().equals(customer.getCreated_date()) : customer.getCreated_date() != null)
            return false;
        return getDate_of_birth() != null ? getDate_of_birth().equals(customer.getDate_of_birth()) : customer.getDate_of_birth() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getFname() != null ? getFname().hashCode() : 0);
        result = 31 * result + (getLname() != null ? getLname().hashCode() : 0);
        result = 31 * result + (getmInitial() != null ? getmInitial().hashCode() : 0);
        result = 31 * result + (getZipcode() != null ? getZipcode().hashCode() : 0);
        result = 31 * result + (getCreated_date() != null ? getCreated_date().hashCode() : 0);
        result = 31 * result + (getDate_of_birth() != null ? getDate_of_birth().hashCode() : 0);
        return result;
    }
}
