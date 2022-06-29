//import java.io.*;
//import java.util.*;
//class Main{
//    private static int a, b;
//    private static int t, T;
//    private static String res;
//
//    public static void main(String[] args) throws IOException{
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        T = Integer.parseInt(st.nextToken());
//
//        for(int t = 1; t<=T; t++){
//            st = new StringTokenizer(br.readLine());
//            a = Integer.parseInt(st.nextToken());
//            b = Integer.parseInt(st.nextToken());
//            res = (a + b) + "";
//
//            bw.write("Case #" + (t + "") + ": "+a+" + "+b+" = "+res);
//            bw.newLine();
//            bw.flush();
//        }
//        bw.close();
//    }
//}
