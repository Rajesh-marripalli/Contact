package com.contactphonenumber.contact.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="contact")
public class Contact {
    @GeneratedValue
    @Id
    private Integer cid;
    private String name;
    private String Email;
    private Long phno;
    private String activesw;
}
