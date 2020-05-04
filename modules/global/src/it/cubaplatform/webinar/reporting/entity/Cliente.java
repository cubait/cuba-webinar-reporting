package it.cubaplatform.webinar.reporting.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.CaseConversion;
import com.haulmont.cuba.core.entity.annotation.EmbeddedParameters;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|ragioneSociale")
@Table(name = "WBNREPORTS_CLIENTE")
@Entity(name = "wbnreports_Cliente")
public class Cliente extends StandardEntity {
    private static final long serialVersionUID = -5697775878707531793L;

    @NotNull
    @Column(name = "RAGIONE_SOCIALE", nullable = false)
    protected String ragioneSociale;

    @NotNull
    @Column(name = "TIPO", nullable = false)
    protected String tipo;

    @Column(name = "PARTITA_IVA", length = 30)
    protected String partitaIva;

    @NotNull
    @CaseConversion
    @Column(name = "CODICE_FISCALE", nullable = false, length = 30)
    protected String codiceFiscale;

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

    @Column(name = "RAPPRESENTANTE_LEGALE")
    protected String rappresentanteLegale;

    @NotNull
    @Column(name = "CONSENSO_PRIVACY", nullable = false)
    protected Boolean consensoPrivacy = false;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AZIENDA_ID")
    protected Azienda azienda;

    public Boolean getConsensoPrivacy() {
        return consensoPrivacy;
    }

    public void setConsensoPrivacy(Boolean consensoPrivacy) {
        this.consensoPrivacy = consensoPrivacy;
    }

    public String getRappresentanteLegale() {
        return rappresentanteLegale;
    }

    public void setRappresentanteLegale(String rappresentanteLegale) {
        this.rappresentanteLegale = rappresentanteLegale;
    }

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }

    public Indirizzo getSedeLegale() {
        return sedeLegale;
    }

    public void setSedeLegale(Indirizzo sedeLegale) {
        this.sedeLegale = sedeLegale;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public TipoCliente getTipo() {
        return tipo == null ? null : TipoCliente.fromId(tipo);
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo == null ? null : tipo.getId();
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }
}