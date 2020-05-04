package it.cubaplatform.webinar.reporting.web.screens.azienda;

import com.haulmont.cuba.gui.screen.*;
import it.cubaplatform.webinar.reporting.entity.Azienda;

@UiController("wbnreports_Azienda.browse")
@UiDescriptor("azienda-browse.xml")
@LookupComponent("aziendasTable")
@LoadDataBeforeShow
public class AziendaBrowse extends StandardLookup<Azienda> {
}