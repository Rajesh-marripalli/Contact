package com.contactphonenumber.contact.serviceImpl;
import com.contactphonenumber.contact.entity.Contact;
import com.contactphonenumber.contact.repository.ContactRepository;
import com.contactphonenumber.contact.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    public final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public String upsert(Contact contact) {
        Contact con = contactRepository.save(contact);
        return "success";
    }
    @Override
    public List<Contact> allContact() {

        return contactRepository.findAll();
    }

    @Override
    public String delete(int cid) {
        contactRepository.deleteById(cid);
        return "success";
    }

    @Override
    public Contact getContact(int cid) {
        Optional<Contact> findById= contactRepository.findById(cid);
        if(findById.isPresent())
        {
            return findById.get();
        }
        return null;
    }
}
