class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0){
            return "";
        }

        int small = strs[0].length();

        for (int i = 1; i<strs.length; i++){
            if (strs[i].length() < small){
                small = strs[i].length();
            }
        }
        String result = "";

        for (int j = 0; j<small; j++){
            for (int i =1; i<strs.length; i++){
                if (strs[0].charAt(j) !=strs[i].charAt(j)){
                    return result;
                }
            }

            result = result +strs[0].charAt(j);
        }

        return result;
    }
}