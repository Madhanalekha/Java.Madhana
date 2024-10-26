/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

/**
 *
 * @author madha
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UserInputTemperatureConvertor extends JFrame {
    private JButton celsiusToFahrenheitButton, fahrenheitToCelsiusButton, clearButton;
    public UserInputTemperatureConvertor() {
        setTitle("Temperature Converter with User Input");
        celsiusToFahrenheitButton = new JButton("Convert Celsius to Fahrenheit");
        fahrenheitToCelsiusButton = new JButton("Convert Fahrenheit to Celsius");
        clearButton = new JButton("Clear");
        celsiusToFahrenheitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String celsiusInput = JOptionPane.showInputDialog("Enter temperature in Celsius:");
                try {
                    if (celsiusInput != null) {
                        double celsius = Double.parseDouble(celsiusInput);
                        double fahrenheit = (celsius * 9 / 5) + 32;
                        JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit: " + String.format("%.2f", fahrenheit));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                }
            }
        });

        fahrenheitToCelsiusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fahrenheitInput = JOptionPane.showInputDialog("Enter temperature in Fahrenheit:");
                try {
                    if (fahrenheitInput != null) {
                        double fahrenheit = Double.parseDouble(fahrenheitInput);
                        double celsius = (fahrenheit - 32) * 5 / 9;
                        JOptionPane.showMessageDialog(null, "Temperature in Celsius: " + String.format("%.2f", celsius));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Fields cleared.");
            }
        });

        setLayout(new java.awt.GridLayout(3, 1));
        add(celsiusToFahrenheitButton);
        add(fahrenheitToCelsiusButton);
        add(clearButton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new UserInputTemperatureConvertor();
    }
}

    

