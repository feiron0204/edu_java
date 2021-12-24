import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        for(int i=1;i<=a;i++) {
            st=new StringTokenizer(br.readLine());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
             
            bw.write(b+c+"\n");
        }
        bw.flush();
    }
}
