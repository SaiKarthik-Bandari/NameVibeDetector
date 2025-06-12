import java.util.Scanner;
import java.util.Random;

public class NameVibeDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("🔡 Enter your name: ");
        String name = scanner.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        String vibe;
        if (vowels > consonants)
            vibe = "🎶 Smooth talker with a poetic soul!";
        else if (consonants > vowels)
            vibe = "💼 Bold and practical — a born leader!";
        else
            vibe = "🎭 Balanced and mysterious — a rare gem!";

        String mood;
        int length = name.replaceAll("[^a-z]", "").length(); // name length without spaces/symbols

        if (length <= 4)
            mood = "😎 Short & snappy — you leave a quick impression.";
        else if (length <= 8)
            mood = "🎯 Perfectly balanced — like Thanos but friendlier.";
        else
            mood = "🌌 Deep and meaningful — there's more than meets the eye.";

        String[] randomQuotes = {
                "🚀 Keep rising. The stars are watching!",
                "🔥 Your vibe attracts your tribe.",
                "💫 Some names just carry magic. Yours is one.",
                "🌟 Shine on, legend!"
        };

        System.out.println("\n🔍 Analyzing your name...");
        System.out.println("🅰️ Vowels: " + vowels);
        System.out.println("🅱️ Consonants: " + consonants);
        System.out.println("🔮 Name Vibe: " + vibe);
        System.out.println("🧠 Mood Based on Name Length: " + mood);
        System.out.println("💌 Bonus Message: " + randomQuotes[random.nextInt(randomQuotes.length)]);

        scanner.close();
    }
}
