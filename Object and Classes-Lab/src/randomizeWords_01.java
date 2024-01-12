import java.util.*;

public class randomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputWords = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        List<String> result = new ArrayList<>();

        Random rdm = new Random();

        int inputWordsLen = inputWords.size();
        for (int i = 0; i < inputWordsLen; i++) {
            int idx = rdm.nextInt(inputWords.size());
            result.add(inputWords.get(idx));
            inputWords.remove(idx);
        }

        for (String word : result) {
            System.out.println(word);
        }
    }
}