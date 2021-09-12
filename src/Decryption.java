import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;

    public class Decryption
    {
        static void decryptor(String filePath, String oldString, String newString)
        {
            // Initializing the file path for the ciphertext
            File fileToBeModified = new File(filePath);
            String oldContent = "";
            BufferedReader reader = null;
            FileWriter writer = null;
            try
            {
                // Using BufferReader to read all the lines in the given file
                reader = new BufferedReader(new FileReader(fileToBeModified));
                String line = reader.readLine();

                while (line != null)
                {
                    oldContent = oldContent + line + System.lineSeparator();
                    line = reader.readLine();
                }

                // Method to replace the old encrypted alphabet with the given key
                String newContent = oldContent.replaceAll(oldString, newString);
                writer = new FileWriter(fileToBeModified);
                writer.write(newContent);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            finally
            {
                try
                {
                    reader.close();
                    writer.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args)
        {
            // Filepath to the given ciphertext
            //
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "f", "E");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "i", "T");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "q", "A");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "n", "R");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "s", "O");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "v", "I");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "y", "N");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "j", "S");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "z", "H");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "a", "D");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "m", "L");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "u", "G");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "o", "M");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "l", "F");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "h", "U");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "e", "C");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "x", "K");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "g", "D");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "w", "B");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "b", "W");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "r", "Y");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "k", "P");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "t", "Z");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "p", "X");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "d", "J");
            decryptor("/Users/mikhailsumawan/Desktop/cpt2.txt", "c", "Q");

            System.out.println("done");
        }
    }

