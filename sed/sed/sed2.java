import java.io.*;
import java.util.Scanner;

Public class sed {

    Public static void main(String[] args) {
        new sed().init();
    }

    private void init() {
        System.out.println("Start the sed command.");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("before file name : ");
        String stringBeforeFileName = scanner.next();
        
        System.out.print("send files : ");
        String stringAfterFileName = scanner.next();
        
        System.out.print("fix before : ");
        String stringBefore = scanner.next();
        
        System.out.print("fix after : ");
        String stringAfter = scanner.next();
        
        sed(stringBeforeFileName, stringAfterFileName, stringBefore, stringAfter);
        
        scanner.close();
    }

    private void sed(String stringBeforeFileName, String stringAfterFileName, String stringBefore, String stringAfter) {
        try (BufferedReader br = new BufferedReader(new FileReader(stringBeforeFileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(stringAfterFileName))) {
            
            String line;
            while ((line = br.readLine()) != null) {
                // 置換処理
                String fixed = line.replace(stringBefore, stringAfter);
                // 書き込み + 改行
                bw.write(fixed);
                bw.newLine(); // 改行を追加
            }
            
            System.out.println("File has been updated successfully.");
            
        } catch (IOException e) {
            System.out.println("File read/write error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
