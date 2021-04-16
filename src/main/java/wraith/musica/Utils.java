package wraith.musica;

import net.minecraft.util.Identifier;

import java.util.Random;

public class Utils {

    public static Identifier ID(String path) {
        return new Identifier(Musica.MOD_ID, path);
    }
    public static final Random RANDOM = new Random();
    public static int getRandomIntInRange(int min, int max) {
        return min + RANDOM.nextInt(max - min + 1);
    }

    public static boolean getRandomChance(int chance) {
        if (chance == 0) {
            return false;
        }
        return chance >= getRandomIntInRange(0, 100);
    }

}