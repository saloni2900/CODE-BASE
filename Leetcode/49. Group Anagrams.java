class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //iterate all string one by one 
        //sort the string -> aet,aet
        //maintain a map key = aet . 
        //if the sorted strign exist , add value = original strings list eat , tea

        Map <String,List<String>> mp = new HashMap<>();
        List<List<String>> result=new LinkedList<>();
        for(String str : strs){
            //get sorted string
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);

            if(mp.containsKey(sortedString)){
                List<String> list = mp.get(sortedString);
                list.add(str);
            }
            else{
                List<String> list = new LinkedList<>();
                list.add(str);
                mp.put(sortedString,list);
            }
        }

        for(String key : mp.keySet()){
            result.add(mp.get(key));
        }

        return result;
    }
}