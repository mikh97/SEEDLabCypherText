import java.io.IOException;
import java.io.BufferedReader;
import java.util.HashMap;
import java.io.FileReader;
    public class Main {
        public static void main(String[] args) throws IOException {
            HashMap<Integer, Integer> hash = new HashMap<>();

            // File path to the cipher text file
            // I'm using Buffer Reader used to read each of the line in the cipher text file
            BufferedReader reader = new BufferedReader(new FileReader("/Users/mikhailsumawan/Desktop/ciphertext-o2.txt"));

            // For loop to read the line
            while (true) {
                String line = reader.readLine();
                // If statement to end the loop if no strings or integers are present in the given line
                if (line == null) {
                    break;
                }
                for (int i = 0; i < line.length(); i++) {
                    char frequency = line.charAt(i);
                    if (frequency != ' ') {
                        // Count the value of each letter on each line
                        int value = hash.getOrDefault((int) frequency, 0);
                        hash.put((int) frequency, value + 1);
                    }
                }
            }
            reader.close();

            // For loop to print the frequency analysis given on the cipher text
            for (int key : hash.keySet()) {
                System.out.println((char) key + ": " + hash.get(key));
            }
        }
    }
