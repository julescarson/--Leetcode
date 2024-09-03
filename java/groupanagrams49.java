// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Map.Entry;
// import java.util.HashMap;

// /*
// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

// */

// public class groupanagrams49 {
// // compare two strings and determine if anagrams, boolean return
// public boolean isAnagram(String s, String t) {
// if (s.length() != t.length()) {
// return false;
// }
// char[] schars = s.toCharArray();
// char[] tchars = t.toCharArray();
// Arrays.sort(schars);
// Arrays.sort(tchars);
// if (Arrays.equals(schars, tchars)) {
// return true;
// }
// return false;
// }

// public List<List<String>> groupAnagrams(String[] strs) {
// // USE A HASHMAP - Key: String, Value: matching strings (0s are anagrams) (1s
// // are anagrams... etc)
// HashMap<String, Integer> match = new HashMap<>();
// int group = 0; // first matches start 0, then next etc

// for (int i = 0; i < strs.length; i++) {
// if (match.containsKey(strs[i]) == false) {
// match.put(strs[i], group);
// for (int j = 0; j < strs.length; j++) {
// if (isAnagram(strs[i], strs[j])) {
// match.put(strs[j], group);
// }
// }
// group++;
// }
// }
// System.out.println(match + " " + group);
// var outers = new ArrayList[group];
// for (Entry<String, Integer> e : match.entrySet()) {
// var x = e.getValue();
// if (outers[x] == null) {
// ArrayList<String> tmp = new ArrayList<>();
// outers[x] = tmp;
// }
// outers[x].add(e.getKey());
// }
// List<List<String>> result = Arrays.asList(outers);

// return result;
// }

// }
