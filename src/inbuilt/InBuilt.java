/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inbuilt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class InBuilt {
    public static void main(String[] args) {
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(30);
        numbers.add(15);
        numbers.add(5);

        System.out.println("Original list: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        Random random = new Random();
        Collections.shuffle(numbers, random);
        System.out.println("Shuffled list: " + numbers);

        int randomIndex = random.nextInt(numbers.size());
        int randomElement = numbers.get(randomIndex);
        System.out.println("Randomly picked element: " + randomElement);
    }
}


