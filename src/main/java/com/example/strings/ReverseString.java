package com.example.strings;

public class ReverseString {

    public  String reverse(String input){
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return  reversed.toString();
    }
}
