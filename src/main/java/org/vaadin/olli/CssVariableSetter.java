package org.vaadin.olli;

import com.vaadin.flow.component.UI;

/**
 * Helper class for setting CSS variables from Java code.
 */
public class CssVariableSetter {

    /**
     * Set the value of a CSS variable on a page.
     * @param ui UI instance where this variable change should take place
     * @param variableName name of CSS variable to set
     * @param value value to set in the CSS variable
     */
    public static void setCssVariable(UI ui, String variableName, String value) {
        ui.getPage().executeJs(
                String.format("document.documentElement.style.setProperty('%s','%s');", variableName, value));
    }

}
