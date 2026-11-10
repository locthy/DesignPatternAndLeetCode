package dataStructureAndAlgorithm.Array.easy.mergeStringAlternatively;

public class Main {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "defgh";

        Solution solution = new Solution();
        String result = solution.mergeAlternately(word1, word2);
        System.out.println(result);
    }
}
