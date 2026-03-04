package ChapterSix;

public class Scabble {
    public static void main(String[] args) { 
        System.out.println(canSpell("quijibo", "jib"));     // true
        System.out.println(canSpell("quijibo", "quiz"));    // false
        System.out.println(canSpell("letter", "tree"));     // true
        System.out.println(canSpell("letter", "treat"));    // false
    }

    public static boolean canSpell(String scrabbleLetters, String word) { 
        int[] letterCounts = new int[26]; 
        
        for (char c : scrabbleLetters.toCharArray()) { 
            if (Character.isLetter(c)) { 
                letterCounts[Character.toLowerCase(c) - 'a']++;
            }
        }
        
        for (char c : word.toCharArray()) { 
            if (Character.isLetter(c)) { 
                int index = Character.toLowerCase(c) - 'a';
                if (letterCounts[index] == 0) { 
                    return false; 
                }
                letterCounts[index]--;
            }
        }
        return true; 
    }
}
