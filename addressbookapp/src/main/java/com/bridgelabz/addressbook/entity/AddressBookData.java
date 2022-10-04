package com.bridgelabz.addressbook.entity;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_address_book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "personId")
    private int personId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "emailId")

    private String emailId;


    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.firstName = addressBookDTO.getFirstName();
        this.lastName = addressBookDTO.getLastName();
        this.gender = addressBookDTO.getGender();
        this.address = addressBookDTO.getAddress();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.zipCode = addressBookDTO.getZipCode();
        this.phoneNumber = addressBookDTO.getPhoneNumber();
        this.emailId = addressBookDTO.getEmailId();
    }

    public AddressBookData(AddressBookDTO addressBookDTO, int personId) {
        this.personId = personId;
        this.firstName = addressBookDTO.getFirstName();
        this.lastName = addressBookDTO.getLastName();
        this.gender = addressBookDTO.getGender();
        this.address = addressBookDTO.getAddress();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.zipCode = addressBookDTO.getZipCode();
        this.phoneNumber = addressBookDTO.getPhoneNumber();
        this.emailId = addressBookDTO.getEmailId();

    }
}
