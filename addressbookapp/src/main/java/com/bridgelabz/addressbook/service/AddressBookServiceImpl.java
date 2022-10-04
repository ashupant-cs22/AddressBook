package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.entity.AddressBookData;
import com.bridgelabz.addressbook.exceptions.AddressBookException;
import com.bridgelabz.addressbook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service

public class AddressBookServiceImpl implements AddressBookService {

    @Autowired
    private AddressBookRepository addressBookRepository;
    private List<AddressBookData> list = new ArrayList<>();

    public List<AddressBookData> getAddressBookData(){
        return addressBookRepository.findAll();
    }

    public AddressBookData getAddressBookDataById(int personId){
        return addressBookRepository.findById(personId).orElseThrow(() -> new AddressBookException("User Not Found"));
    }

    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = new AddressBookData(addressBookDTO);
        return addressBookRepository.save(addressBookData);
    }
    @Override
    public AddressBookData updateAddressBookData(int personId, AddressBookDTO addressBookDTO) {
        if(addressBookRepository.findById(personId).isPresent()){
        AddressBookData addressBookData = new AddressBookData(addressBookDTO , personId);
        addressBookRepository.save(addressBookData);
        return addressBookData;
        }
        else throw new AddressBookException("Record not found for the given ID");
    }

    public void deleteAddressBookData(int personId){
        AddressBookData addressBookData = this.getAddressBookDataById(personId);
        addressBookRepository.delete(addressBookData);
    }
}
