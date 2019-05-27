package com.algorithm.study.day22;

public class Solution {

    public boolean solution(String[] phone_book) {
        for (int i = 0 ; i < phone_book.length ; i++) {
            for(int j = 0 ; j < phone_book.length ; j++) {
                if(i == j) continue;

                if(phone_book[j].startsWith(phone_book[i])){
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * 개선코드
     *        Arrays.sort(phoneBook);
     *
     *        for(int i=0; i<phoneBook.length-1;i++)
     *        {
     *            if(phoneBook[i+1].startsWith(phoneBook[i])) {return false;}
     *        }
     *        return true;
     *
     */
}
