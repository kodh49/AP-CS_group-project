package Analysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Intro {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\user\\Desktop\\Code\\Java\\KakaotalkforHAS\\src\\Analysis\\test.txt");

            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);

            int iter = 1;

            String line;

            line = bufReader.readLine();
//            while((line = bufReader.readLine()) != null){
            System.out.println(line);
//            }
            //.readLine()은 끝에 개행문자를 읽지 않는다.
            bufReader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e) {
            System.out.println(e);
        }
    }
}
