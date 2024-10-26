/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

/**
 *
 * @author madha
 */
public class tempConvertor {
    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;
    private JButton celsiusToFahrenheitButton, fahrenheitToCelsiusButton, clearButton;

    public TemperatureConverter() {
        setTitle("Temperature Converter");

        // Create components
        JLabel inputLabel = new JLabel("Enter temperature:");
        inputField = new JTextField(10); // Text field to enter the temperature
        resultLabel = new JLabel("Result will be displayed here");

        celsiusToFahrenheitButton = new JButton("Convert Celsius to Fahrenheit");
        fahrenheitToCelsiusButton = new JButton("Convert Fahrenheit to Celsius");
        clearButton = new JButton("Clear");

        // Add action listeners to the buttons
        celsiusToFahrenheitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCelsiusToFahrenheit();
            }
        });

        fahrenheitToCelsiusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertFahrenheitToCelsius();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        // Set layout and add components
        setLayout(new GridLayout(5, 1));
        add(inputLabel);
        add(inputField);
        add(celsiusToFahrenheitButton);
        add(fahrenheitToCelsiusButton);
        add(resultLabel);
        add(clearButton);

        // Set default close operation and window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    // Method to convert Celsius to Fahrenheit
    private void convertCelsiusToFahrenheit() {
        try {
            double celsius = Double.parseDouble(inputField.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;
            resultLabel.setText("Temperature in Fahrenheit: " + String.format("%.2f", fahrenheit));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    // Method to convert Fahrenheit to Celsius
    private void convertFahrenheitToCelsius() {
        try {
            double fahrenheit = Double.parseDouble(inputField.getText());
            double celsius = (fahrenheit - 32) * 5 / 9;
            resultLabel.setText("Temperature in Celsius: " + String.format("%.2f", celsius));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    // Method to clear the input and result fields
    private void clearFields() {
        inputField.setText("");
        resultLabel.setText("Result will be displayed here");
    }

    public static void main(String[] args) {
        new tempConverter();
    }
}

    
}
