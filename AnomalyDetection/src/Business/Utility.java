/*
 * To change thvalues license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Rishika Idnani
 */
public class Utility {

    public String numberToWords(int value) {
        if (value == 0) {
            return "zero";
        } else if (value == 1) {
            return "one";
        } else if (value == 2) {
            return "two";
        } else if (value == 3) {
            return "three";
        } else if (value == 4) {
            return "four";
        } else if (value == 5) {
            return "five";
        } else if (value == 6) {
            return "six";
        } else if (value == 7) {
            return "seven";
        } else if (value == 8) {
            return "eight";
        } else if (value == 9) {
            return "nine";
        } else if (value == 10) {
            return "ten";
        } else if (value == 11) {
            return "eleven";
        } else if (value == 12) {
            return "twelve";
        } else if (value == 13) {
            return "thirteen";
        } else if (value == 14) {
            return "fourteen";
        } else if (value == 15) {
            return "fiveteen";
        } else if (value == 16) {
            return "sixteen";
        } else if (value == 17) {
            return "seventeen";
        } else if (value == 18) {
            return "eighteen";
        } else if (value == 19) {
            return "nineteen";
        }
        return null;
    }

    public int wordsToNumber(String word) {
        if (word.equalsIgnoreCase("zero")) {
            return 0;
        } else if (word.equalsIgnoreCase("one")) {
            return 1;
        } else if (word.equalsIgnoreCase("two")) {
            return 2;
        } else if (word.equalsIgnoreCase("three")) {
            return 3;
        } else if (word.equalsIgnoreCase("four")) {
            return 4;
        } else if (word.equalsIgnoreCase("five")) {
            return 5;
        } else if (word.equalsIgnoreCase("six")) {
            return 6;
        } else if (word.equalsIgnoreCase("seven")) {
            return 7;
        } else if (word.equalsIgnoreCase("eight")) {
            return 8;
        } else if (word.equalsIgnoreCase("nine")) {
            return 9;
        } else if (word.equalsIgnoreCase("ten")) {
            return 10;
        } else if (word.equalsIgnoreCase("eleven")) {
            return 11;
        } else if (word.equalsIgnoreCase("twelve")) {
            return 12;
        } else if (word.equalsIgnoreCase("thirteen")) {
            return 13;
        } else if (word.equalsIgnoreCase("fourteen")) {
            return 14;
        } else if (word.equalsIgnoreCase("fiveteen")) {
            return 15;
        } else if (word.equalsIgnoreCase("sixteen")) {
            return 16;
        } else if (word.equalsIgnoreCase("seventeen")) {
            return 17;
        } else if (word.equalsIgnoreCase("eighteen")) {
            return 18;
        } else if (word.equalsIgnoreCase("nineteen")) {
            return 19;
        }
        return Integer.parseInt(null);
    }
}
