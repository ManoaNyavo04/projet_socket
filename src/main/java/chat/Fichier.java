package chat;

import java.io.*;

public class Fichier{
    public void createFile(String fileName, String detail){
        File file= new File(fileName+ ".txt");
        FileWriter ecrire;
        FileReader lire;

        try {
            ecrire= new FileWriter(file, true);
            lire= new FileReader(file);

            BufferedWriter write= new BufferedWriter(ecrire);
            BufferedReader read= new BufferedReader(lire);

            if (read.readLine()!=null){
                write.write("\n");
            }

            write.write(detail);
            System.out.println(detail);
            write.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}