package str;

public class StrB {
    public static void main(String[] args) {
        StringBuilder built = new StringBuilder();
        char ch = 97;
        for (int alp = 0; alp < 26; alp++) {
            built.append((char)(ch));
            ch += 1;
        }
        System.out.println(built);
    }
}
