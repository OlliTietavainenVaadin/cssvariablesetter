package org.vaadin.olli;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route("")
public class DemoView extends Div {

    public DemoView() {
        TextField textField = new TextField("Color");
        textField.setValue("#FF00FF");

        Button button = new Button("Set variable '--lumo-base-color'", e -> {
            CssVariableSetter.setCssVariable(UI.getCurrent(), "--lumo-base-color", textField.getValue());
        });
        add(textField, button);
    }
}
