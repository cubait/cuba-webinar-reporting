package it.cubaplatform.webinar.reporting.web.screens.cliente;

import com.haulmont.cuba.gui.screen.*;
import it.cubaplatform.webinar.reporting.entity.Cliente;

@UiController("wbnreports_Cliente.browse")
@UiDescriptor("cliente-browse.xml")
@LookupComponent("clientesTable")
@LoadDataBeforeShow
public class ClienteBrowse extends StandardLookup<Cliente> {
}