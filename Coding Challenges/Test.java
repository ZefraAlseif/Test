import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Test{
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new LinkedList<>();
        List<String> values = Arrays.asList(strs);
        //int count = 0;
        while (!values.isEmpty()){
            List<String> temp = new LinkedList<>();
            temp.add(values.get(0));
            values.remove(0);
            for (String i:values){
                boolean check = isAnagram(temp.get(0),i);
                if (check){
                    temp.add(i);
                    values.remove(values.indexOf(i));
                }
            }
            list.add(temp);
        }

        return list;
    }

    public boolean isAnagram(String s, String t) {
        LinkedList<String> listOne = new LinkedList<String>();
        LinkedList<String> listTwo = new LinkedList<String>();
        boolean result = false;
        if (s.length() == t.length()){
            for (int i = 0;  i<s.length();i++){
                listOne.add(s.substring(i,i+1));
                listTwo.add(t.substring(i,i+1));
            }
            for(String temp : listOne){
                if (listTwo.contains(temp)){
                    listTwo.remove(temp);
                    result = true;
                }
                else{
                    result = false;
                    break;
                }
            }
        } 
        return result;
    }
}