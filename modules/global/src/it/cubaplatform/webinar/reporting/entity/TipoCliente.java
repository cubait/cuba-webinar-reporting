package it.cubaplatform.webinar.reporting.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TipoCliente implements EnumClass<String> {

    PERSONA_FISICA("PF"),
    LIBERO_PROFESSIONISTA("LP"),
    SOCIETA_PERSONE("SP"),
    SOCIETA_CAPITALI("SC"),
    PUBBLICA_AMMINISTRAZIONE("PA"),
    ALTRO("NC");

    private String id;

    TipoCliente(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TipoCliente fromId(String id) {
        for (TipoCliente at : TipoCliente.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}