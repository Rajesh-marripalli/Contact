package com.contactphonenumber.contact.service;

import com.contactphonenumber.contact.entity.Contact;

import java.util.List;

public interface ContactService {

    String upsert(Contact contact);
      List<Contact> allContact();
      String  delete(int cid);
      Contact getContact(int cid);


}
