package it.cubaplatform.webinar.reporting.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.EmbeddedParameters;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@NamePattern("%s|ragioneSociale")
@Table(name = "WBNREPORTS_AZIENDA")
@Entity(name = "wbnreports_Azienda")
public class Azienda extends StandardEntity {
    private static final long serialVersionUID = -5625166953249369705L;

    @NotNull
    @Column(name = "RAGIONE_SOCIALE", nullable = false)
    protected String ragioneSociale;

    @NotNull
    @Embedded
    @EmbeddedParameters(nullAllowed = false)
    @AttributeOverrides({
            @AttributeOverride(name = "via", column = @Column(name = "SEDE_LEGALE_VIA")),
            @AttributeOverride(name = "comune", column = @Column(name = "SEDE_LEGALE_COMUNE")),
            @AttributeOverride(name = "provincia", column = @Column(name = "SEDE_LEGALE_PROVINCIA")),
            @AttributeOverride(name = "cap", column = @Column(name = "SEDE_LEGALE_CAP"))
    })
    protected Indirizzo sedeLegale;

    @NotNull
    @Column(name = "PARTITA_IVA", nullable = false, length = 16)
    protected String partitaIva;

    @NotNull
    @Column(name = "REA", nullable = false, length = 15)
    protected String rea;

    @Email
    @NotNull
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    @NotNull
    @Email
    @Column(name = "PEC", nullable = false)
    protected String pec;

    @Column(name = "TELEFONO", length = 30)
    protected String telefono;

    @Email
    @NotNull
    @Column(name = "EMAIL_PRIVACY", nullable = false)
    protected String emailTitolarePrivacy;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FIRMA_TITOLARE_PRIVACY_ID")
    protected FileDescriptor firmaTitolarePrivacy;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_LOGO")
    protected FileDescriptor logo;

    public FileDescriptor getFirmaTitolarePrivacy() {
        return firmaTitolarePrivacy;
    }

    public void setFirmaTitolarePrivacy(FileDescriptor firmaTitolarePrivacy) {
        this.firmaTitolarePrivacy = firmaTitolarePrivacy;
    }

    public String getEmailTitolarePrivacy() {
        return emailTitolarePrivacy;
    }

    public void setEmailTitolarePrivacy(String emailTitolarePrivacy) {
        this.emailTitolarePrivacy = emailTitolarePrivacy;
    }

    public FileDescriptor getLogo() {
        return logo;
    }

    public void setLogo(FileDescriptor logo) {
        this.logo = logo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPec() {
        return pec;
    }

    public void setPec(String pec) {
        this.pec = pec;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRea() {
        return rea;
    }

    public void setRea(String rea) {
        this.rea = rea;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public Indirizzo getSedeLegale() {
        return sedeLegale;
    }

    public void setSedeLegale(Indirizzo sedeLegale) {
        this.sedeLegale = sedeLegale;
    }

}