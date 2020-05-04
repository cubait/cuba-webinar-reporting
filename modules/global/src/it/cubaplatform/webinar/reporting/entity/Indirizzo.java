package it.cubaplatform.webinar.reporting.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.EmbeddableEntity;
import com.haulmont.cuba.core.entity.annotation.CaseConversion;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

@NamePattern("%s - %s %s (%s)|via,cap,comune,provincia")
@MetaClass(name = "wbnreports_Indirizzo")
@Embeddable
public class Indirizzo extends EmbeddableEntity {
    private static final long serialVersionUID = -419521014417406550L;

    @NotNull
    @Column(name = "VIA", nullable = false)
    protected String via;

    @NotNull
    @Column(name = "COMUNE", nullable = false, length = 100)
    protected String comune;

    @Length(min = 2, max = 2)
    @CaseConversion
    @NotNull
    @Column(name = "PROVINCIA", nullable = false, length = 2)
    protected String provincia;

    @Pattern(message = "{msg://wbnreports_Indirizzo.cap.validation.Pattern}", regexp = "[0-9]{5}")
    @NotNull
    @Column(name = "CAP", nullable = false, length = 5)
    protected String cap;

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public boolean fieldsEquals(Indirizzo other) {
        if (other == null) return false;
        return Objects.equals(other.getVia(), getVia()) && Objects.equals(other.getComune(),getComune())
                && Objects.equals(other.getProvincia(), getProvincia()) && Objects.equals(other.getCap(), getCap());
    }
}