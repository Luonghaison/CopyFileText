import java.io.*;

public class copyFileText {
    public static void main(String[] args) {


        try {
            File sF = new File("src/sourceFile.txt");
            File tF = new File("src/targetFile.txt");
//            if (!sF.exists() || tF.exists()) {
//                throw new FileNotFoundException();
//            }
            FileWriter fileWriter = new FileWriter(tF);
            FileReader fileReader = new FileReader(sF);
            BufferedReader br = new BufferedReader(fileReader);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            String line = "";
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Tep tin ko ton tai");
            ;
        }


    }
}


