package gr.aueb.cf.ch18.mobilecontacts.mapper;

import gr.aueb.cf.ch18.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.ch18.mobilecontacts.dto.MobileContactUpdateDTO;
import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

public class Mapper {

    /**
     * No instances of this class should be available.
     */
    private Mapper() {

    }

    public static MobileContact mapInsertDTOToContact(MobileContactInsertDTO dto) {
        return new MobileContact(null, dto.getFirstname(), dto.getLastname(), dto.getPhoneNumber());
    }

    public static MobileContact mapUpdateDTOToContact(MobileContactUpdateDTO dto) {
        return new MobileContact(dto.getId(), dto.getFirstname(), dto.getLastname(), dto.getPhoneNumber());
    }

    public static MobileContactReadOnlyDTO mapMobileContactToDTO(MobileContact mobileContact) {
        return new MobileContactReadOnlyDTO(mobileContact.getId(), mobileContact.getFirstname(),
                mobileContact.getLastname(), mobileContact.getPhoneNumber());
    }
}