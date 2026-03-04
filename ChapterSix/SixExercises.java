package ChapterSix;

public class SixExercises {
    public static void main(String[] args) {
        System.out.println("Hello, World!\n"); //first line

        System.out.println("Square root of 9: " + squareRoot(9));
        System.out.println("Guass: " + gauss(2, 3)); 
        System.out.println("Is 'abc' abecedarian? " + isAbecedarian("abc"));
        System.out.println("Is 'Anna' a doubloon? " + isDoubloon("Anna"));
        System.out.println("Can 'jib' be spelled with 'quijibo'? " + canSpell("jib", "quijibo"));
    }

    public static double squareRoot(double n) { 
        
        double initialGuess = n/2; 
        double xOne = (initialGuess + n/initialGuess) / 2; 
        double xTwo = initialGuess;
        
        while (Math.abs(xOne - xTwo) >= 0.0001) {
            xTwo = xOne;
            xOne = (xTwo + n/xTwo) / 2; 
        }
        return xOne;
    }

    public static double gauss(double x, int n) {
        double result = 1.0;
        double term = 1.0;
        
        for (int i = 1; i <= n; i++) {
            term *= (-x * x) / i;
            result += term;
        }
        return result;
    }

    public static boolean isAbecedarian(String word) { 

        for (int i = 0; i < word.length() - 1; i++) { 
            if (word.charAt(i) > word.charAt(i + 1)) { 
                return false;
            }
        }
        return true; 
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

    public static boolean canSpell(String word, String scrabbleLetters) { 
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
