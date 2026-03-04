package ChapterSix;

public class Doubloon {

    public static void main(String[] args) {
        System.out.println(isDoubloon("Abba"));     // true
        System.out.println(isDoubloon("Anna"));     // true
        System.out.println(isDoubloon("mama"));     // true
        System.out.println(isDoubloon("hello"));    // false
        System.out.println(isDoubloon("appeases")); // true
    }
    
    public static boolean isDoubloon(String word) { 
        int[] letterCounts = new int[26]; 
        
        for (char c : word.toCharArray()) { 
            if (Character.isLetter(c)) { 
                letterCounts[Character.toLowerCase(c) - 'a']++;
            }
        }
        
        for (int count : letterCounts) { 
            if (count != 0 && count != 2) { 
                return false;
            }
        }
        return true; 
    }
}
