package com.contactphonenumber.contact.controller;

import com.contactphonenumber.contact.entity.Contact;
import com.contactphonenumber.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {
    public final ContactService contactService;
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/contact")
    public ResponseEntity<String> upsert(Contact contact)
    {
         String status = contactService.upsert(contact);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @GetMapping("/contacts")
    public ResponseEntity<List<Contact>> allContact()
    {
        List<Contact> allcontact = contactService.allContact();
        return new ResponseEntity<>(allcontact, HttpStatus.OK);
    }
    @GetMapping("/contact/{cid}")
    public ResponseEntity<String>delete(int cid)
    {
        String activedelt = contactService.delete(cid);
        return new ResponseEntity<>(activedelt,HttpStatus.OK);
    }
    @GetMapping("/contactget/{cid}")
    public ResponseEntity<Contact> getContact(int cid)
    {
        Contact cont = contactService.getContact(cid);
        return new ResponseEntity<>(cont,HttpStatus.OK);
    }
}
