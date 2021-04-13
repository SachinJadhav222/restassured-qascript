package tutorials;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution {
        public static String[] mergeList(String[] list1, String[] list2) {
            int l1= list1.length;
            int l2=list2.length;
            int l3=l1+l2;
            String[] list3= new String[l3];
            int i=0;
            int j=0;
            int k=0;
            while(i<l1 && j<l2){
                list3[k++]=list1[i++];
                list3[k++]=list2[j++];
            }
            while(i<l1){
                list3[k++]=list1[i++];
            }
            while(j<l2){
                list3[k++]=list2[j++];
            }

            // int count =0;
            // for(int i=0;i<l3;i++){
            //     list3[count++]=list1[i];
            //     //count++;
            //     list3[count++]=list2[i];
            // }
            // altername
            return list3;
        }
        @Test
        public void test1()
        {
            Solution solution = new Solution();
           // solution.mergeList(String["a"] l1,String[] l2)
            //assertArrayEquals(new String[] { "a", "1", "b", "2", "c", "3", "4" }, solution.mergeList(new String[] { "a", "b", "c" }, new String[] { "1", "2", "3", "4" }));
        }


    }
