package com.sudeep.dsa.crackingthecodinginterview.arrayandstring;
/**
Q) Implement an algorithm to determine if a string has all unique character, what if you cannot use additional data structures

Test case
I/P     O/P
null    false(check with the interview what we should do in null case)
""      true
abc     true
aca     false

Logic
we will maintain one array of 128 , check if any charter index is more than zero
if it's more than zero then one charter already in the string then return from function
else increment the index by 1

Time complexity  o(N) Space complexity 0(1)

Assumption
a =! A
only [a-z][A-Z]



 */
public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUniqueString(null));
        System.out.println(isUniqueString(""));
        System.out.println(isUniqueString("abc"));
        System.out.println(isUniqueString("aca"));

    }
    public static boolean isUniqueString(String str){
        if(str == null) return false;
        if(str.isEmpty() || str.length() == 1) return true;
        if(str.length() >64) return false;

        int[] arr = new int[128];

        for(char ch : str.toCharArray()){
            if(arr[ch] > 0) return false;

            arr[ch]++;

        }
        return true;
    }
    public static boolean isUniqueEditor(String str){
        if(str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for(int i =0 ; i < str.length();i++){
            int val = str.charAt(i);
            if(char_set[val]){ // already found this char in string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
