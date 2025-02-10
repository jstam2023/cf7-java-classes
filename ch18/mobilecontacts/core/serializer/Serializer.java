package gr.aueb.cf.ch18.mobilecontacts.core.serializer;

import gr.aueb.cf.ch18.mobilecontacts.dto.MobileContactReadOnlyDTO;

public class Serializer {

    /**
     * No instances of this class should be available
     */
    private Serializer() {

    }

    public static String serializeDTO(MobileContactReadOnlyDTO readOnlyDTO) {
        return "ID: " + readOnlyDTO.getId() + ", Όνομα: " + readOnlyDTO.getFirstname()
                + ", Επώνυμο: " + readOnlyDTO.getLastname() + ", Τηλ. Αριθμός: " + readOnlyDTO.getPhoneNumber();
    }
}