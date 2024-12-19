package com.example.anagrams;


import java.util.Scanner;

public class NormalAnagram {

    static boolean isAnagram(String a, String b) {
        // Check if lengths are different
        if (a.length() != b.length()) {
            return false;
        }

        // Convert both strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Frequency array for letters
        int[] letterCount = new int[26];

        // Count characters in string 'a'
        for (int i = 0; i < a.length(); i++) {
            letterCount[a.charAt(i) - 'a']++;
        }

        // Subtract character counts for string 'b'
        for (int i = 0; i < b.length(); i++) {
            letterCount[b.charAt(i) - 'a']--;
        }

        // If all counts are zero, strings are anagrams
        for (int count : letterCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
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
