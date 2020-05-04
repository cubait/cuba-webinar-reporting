package it.cubaplatform.webinar.reporting.web.screens.cliente;

import com.haulmont.cuba.gui.screen.*;
import it.cubaplatform.webinar.reporting.entity.Cliente;

@UiController("wbnreports_Cliente.edit")
@UiDescriptor("cliente-edit.xml")
@EditedEntityContainer("clienteDc")
@LoadDataBeforeShow
public class ClienteEdit extends StandardEditor<Cliente> {
}