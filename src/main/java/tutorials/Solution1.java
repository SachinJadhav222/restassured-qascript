package tutorials;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Solution1 {
    public static String reverseWords(String input) {
        String s[] = input.split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans =ans+s[i]+" ";
        }
        System.out.println(input.length());
        System.out.println(ans.length());
        System.out.println(ans.trim().length());
        return ans.trim();
    }

    @Test
    public void test1()
    {
            //Solution1 solution = new Solution1();
            Solution1 solution1 = new Solution1();

            assertEquals("fox brown quick the", solution1.reverseWords("the quick brown fox"));
    }


    }

