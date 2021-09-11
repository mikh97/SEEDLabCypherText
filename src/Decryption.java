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
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "n", "E");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "y", "T");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "v", "A");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "x", "O");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "q", "S");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "u", "N");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "m", "I");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "h", "R");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "t", "H");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "i", "L");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "p", "D");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "a", "C");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "c", "M");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "z", "U");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "l", "W");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "b", "F");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "d", "Y");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "e", "P");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "g", "B");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "r", "G");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "s", "K");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "f", "V");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "j", "Q");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "k", "X");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "o", "J");
            decryptor("/Users/mikhailsumawan/Desktop/cpt.txt", "w", "Z");


            System.out.println("done");
        }
    }

