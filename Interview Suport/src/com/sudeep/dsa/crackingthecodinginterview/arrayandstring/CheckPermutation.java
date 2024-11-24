package com.sudeep.dsa.crackingthecodinginterview.arrayandstring;

/**
 * q) Given two string , write a method to decide if one is a permutation of the other
 * <p>
 *
 * Test Case
 * I/P             O/P
 * null, null       false(check with the interview)
 * abc, null        false
 * null, abc        false
 * "",""            true;
 * abc,bca          true
 * abca,aabc        true
 * abca, abc        false
 * abca,aabb
 * <p>
 * Logic
 * we store all charters in array of size 128 with respective index , for the first string we will increment
 * and for the second string we will decrement it  and at the end all the value in array should be zero
 *
 * Assumption
 * a =! A
 * only [a-z][A-Z]
 *
 */
public class CheckPermutation {
    public static void main(String[] args) {
        System.out.println(isPermutation(null,null));
        System.out.println(isPermutation(null,"abc"));
        System.out.println(isPermutation("abc",null));
        System.out.println(isPermutation("",""));
        System.out.println(isPermutation("abc","bca"));
        System.out.println(isPermutation("abca","aabc"));
        System.out.println(isPermutation("abca","abc"));
        System.out.println(isPermutation("abca","abbc"));

    }
    public static boolean isPermutation(String str1, String str2){
        if(str1 == null || str2== null) return false;
        if(str1.length() != str2.length()) return false;// if length is not same then it's cannot be permutation each other

        int[] arr = new int[128];

        for(int i =0; i< str1.length();i++){
            arr[str1.charAt(i)]++;
            arr[str2.charAt(i)]--;
        }
        for(int i : arr){
            if(i != 0) return false;
        }
        return true;
    }
}
