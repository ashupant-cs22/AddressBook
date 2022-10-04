package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.entity.AddressBookData;

import java.util.List;

public interface AddressBookService {
    List<AddressBookData> getAddressBookData();
    AddressBookData getAddressBookDataById(int personId);
    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);
    AddressBookData updateAddressBookData(int personId, AddressBookDTO addressBookDTO);
    void deleteAddressBookData(int personId);
}
