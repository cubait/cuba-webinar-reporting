package it.cubaplatform.webinar.reporting.web.screens.azienda;

import com.haulmont.cuba.gui.screen.*;
import it.cubaplatform.webinar.reporting.entity.Azienda;

@UiController("wbnreports_Azienda.edit")
@UiDescriptor("azienda-edit.xml")
@EditedEntityContainer("aziendaDc")
@LoadDataBeforeShow
public class AziendaEdit extends StandardEditor<Azienda> {
}