package OOP4_JamarioD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.function.ToDoubleFunction;

public class CurrencyConverter {
    private JPanel mainForm;
    private JTextField tfInput;
    private JComboBox cbCurrencyType;
    private JTextField tfJMDResults;
    private JButton bConvert;
    private JButton bClear;
    private JLabel inputLabel;
    private double uSToJMD = 129.02;
    private double cadToJMD = 97.50;
    private double euroToJMD = 164.33;

    public CurrencyConverter() {

        bConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) throws NumberFormatException {

                try {
                    double result;
                    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
                    String formattedAmount;

                    if(!tfInput.getText().isEmpty())
                    {
                        switch(cbCurrencyType.getSelectedIndex())
                        {
                            case 0:
                                result = (Double.parseDouble(tfInput.getText())) * uSToJMD;
                                formattedAmount = currencyFormatter.format(result);
                                tfJMDResults.setText(formattedAmount);
                                break;
                            case 1:
                                result = (Double.parseDouble(tfInput.getText())) * cadToJMD;
                                formattedAmount = currencyFormatter.format(result);
                                tfJMDResults.setText(formattedAmount);
                                break;
                            case 2:
                                result = (Double.parseDouble(tfInput.getText())) * euroToJMD;
                                formattedAmount = currencyFormatter.format(result);
                                tfJMDResults.setText(formattedAmount);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid Selection", "Error", JOptionPane.ERROR_MESSAGE);
                                break;

                        }
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "Please enter a value to convert!!!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    //throw new RuntimeException(ex);
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (HeadlessException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        cbCurrencyType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch(cbCurrencyType.getSelectedIndex())
                {
                    case 0:
                        inputLabel.setText("Input US $");
                        break;
                    case 1:
                        inputLabel.setText("Input CAN $");
                        break;
                    case 2:
                        inputLabel.setText("Input Euro \u20AC");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Selection", "Error", JOptionPane.ERROR_MESSAGE);
                        break;

                }
            }
        });
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
