import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextDemo1 {

    //排序子序列
//    public static int getChildArr(int[] arr) {
//        int index = 0;
//        List<List<Integer>> result = new ArrayList<>();
//        while(index < arr.length - 1) {
//            if(arr[index] < arr[index + 1]) {
//                List<Integer> list = new ArrayList<>();
//                while(index < arr.length - 1 && arr[index] <= arr[index + 1]) {
//                    list.add(arr[index++]);
//                }
//                index++;
//                result.add(list);
//            } else if(arr[index] == arr[index + 1]){
//                index++;
//            }else {
//                List<Integer> list = new ArrayList<>();
//                while(index < arr.length - 1 && arr[index] >= arr[index + 1]) {
//                    list.add(arr[index++]);
//                }
//                index++;
//                result.add(list);
//            }
//        }
//        return result.size();
//    }

    //逆置字符串
//    public static String revStr(String str) {
//        char[] ch = str.toCharArray();
//        reverse(0,ch.length - 1,ch);
//        int s = 0,e = 0;
//        for(int i = 0; i < ch.length; i++) {
//            if(ch[i] == ' ') {
//                e = i - 1;
//                reverse(s,e,ch);
//                s = i + 1;
//            }
//        }
//        return new String(ch);
////        String[] s = str.split(" ");
////        StringBuilder sb = new StringBuilder();
////        for (int i = s.length - 1; i >= 0 ; i--) {
////            sb.append(s[i]).append(" ");
////        }
////        return sb.toString().trim();
//    }
//    public static void reverse(int l,int r,char[] c) {
//        while(l < r) {
//            char tmp = c[l];
//            c[l] = c[r];
//            c[r] = tmp;
//            l++;
//            r--;
//        }
//    }
//    public static boolean isAdmin(String a) {
//        return a.toLowerCase() == "admin";
//    }

    //字符串中找出连续的最长的子字符串
//    public static String getNumStr(String s) {
//        int index = 0,start = 0,end = 0;
//        String result = "";
//        while(index < s.length()) {
//            char tmp  = s.charAt(index);
//            if(tmp >= '0' && tmp <= '9') {
//                start = index;
//                while(index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
//                    index++;
//                }
//                end = index;
//                String ret = s.substring(start,end);
//                if(ret.length() > result.length()) {
//                    result = ret;
//                }
//            } else {
//                index++;
//            }
//        }
//        return result;
//    }
//    public static int MoreThanHalfNum_Solution(int [] array) {
//        Arrays.sort(array);
//        int n = array.length;
//        for(int i = 0,j = n / 2; i < n / 2; i++) {
//            if(array[i] == array[j]) return array[i];
//        }
//        return 0;
//    }
    public static void main(String[] args) {
//        int[] arr = {1,2,3,2,2,2,5,4,2};
//        System.out.println(MoreThanHalfNum_Solution(arr));
//        String s = "abcd12345ed125ss123456789";
//        System.out.println(getNumStr(s));
//        System.out.println(isAdmin("Admin"));
//        String str = "I like beijing.";
//        System.out.println(revStr(str));
    }
}
