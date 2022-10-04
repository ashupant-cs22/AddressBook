package com.bridgelabz.addressbook.repository;

import com.bridgelabz.addressbook.entity.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {

}
