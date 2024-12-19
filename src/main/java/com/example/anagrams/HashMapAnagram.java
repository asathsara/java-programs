package com.example.anagrams;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapAnagram {

    static boolean isAnagram(String a, String b) {
        // Convert strings to lowercase for case-insensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If lengths are not equal, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Use HashMap to store character frequencies
        HashMap<Character, Integer> letters = new HashMap<>();

        // Count character frequencies in 'a'
        for (char letter : a.toCharArray()) {
            letters.put(letter, letters.getOrDefault(letter, 0) + 1);
        }

        // Decrement counts based on characters in 'b'
        for (char letter : b.toCharArray()) {
            if (!letters.containsKey(letter)) {
                return false; // Character not found in 'a'
            }
            letters.put(letter, letters.get(letter) - 1); // Decrease the count
            if (letters.get(letter) == 0) {
                letters.remove(letter); // Remove if count becomes zero
            }
        }

        // If the map is empty, then the strings are anagrams
        return letters.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
