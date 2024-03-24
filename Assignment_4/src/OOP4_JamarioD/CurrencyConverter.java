package OOP4_JamarioD;

import javax.swing.*;

public class CurrencyConverter {
    private JPanel mainForm;
    private JTextField tfInput;
    private JComboBox cbCurrencyType;
    private JTextField tfJMDResults;
    private JButton bConvert;
    private JButton bClear;

    public CurrencyConverter() {

    }

    public JPanel getMainForm() {
        return mainForm;
    }

    public void setMainForm(JPanel mainForm) {
        this.mainForm = mainForm;
    }

    public JTextField getTfInput() {
        return tfInput;
    }

    public void setTfInput(JTextField tfInput) {
        this.tfInput = tfInput;
    }

    public JComboBox getCbCurrencyType() {
        return cbCurrencyType;
    }

    public void setCbCurrencyType(JComboBox cbCurrencyType) {
        this.cbCurrencyType = cbCurrencyType;
    }

    public JTextField getTfJMDResults() {
        return tfJMDResults;
    }

    public void setTfJMDResults(JTextField tfJMDResults) {
        this.tfJMDResults = tfJMDResults;
    }

 /*   public void cbListing(){
        String[] item = {"US","CAN", "Euro"};
        cbCurrencyType = new JComboBox<>(item);
    }*/

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
