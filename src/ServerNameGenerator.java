public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"funny", "annoying", "tall", "short", "old", "smart", "angry", "sad", "handsome", "beautiful"};

        String[] nouns = {"dog", "cat", "couch", "floor", "hand", "feet", "face", "room", "plant", "tree"};

        System.out.println(nameGenerator(adjectives, nouns));
    }

    public static String nameGenerator(String[] adjArray, String[] nounArray) {
        int randomAdj = (int) (Math.random() * 9);
        int randomNoun = (int) (Math.random() * 9);
        String ranAdj = adjArray[randomAdj];
        String ranNoun = nounArray[randomNoun];

        return "This mad lib sentence must contain a " + ranAdj + "-" + ranNoun;
    }
}
