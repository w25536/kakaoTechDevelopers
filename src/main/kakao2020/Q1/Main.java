package src.main.kakao2020.Q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    static class Keystroke{
        int x = 0;
        int y = 0;

        Keystroke(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY(){
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y){
            this.y = y;

        }

    }

    static Keystroke p(int a){
        int x = 0;
        int y = 0;
        x = ((a-1))/3;
        y =((a-1)%3);
        return new Keystroke(x, y);

    }



    static int distance(int a, int b) { int dist = 0; dist = Math.abs(p(a).getX() - p(b).getX()) + Math.abs(p(a).getY() - p(b).getY()); return dist; }



    public static String solution(int[] numbers, String hand) {

        StringBuilder sb = new StringBuilder();

        int left = 10;
        int right = 12;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 0){
                numbers[i] = 11;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                left = 1;
                sb.append('L');
            } else if (numbers[i] == 4) {
                left = 4;
                sb.append('L');
            } else if (numbers[i] == 7) {
                left = 7;
                sb.append('L');
            } else if (numbers[i] == 3) {
                right = 3;
                sb.append('R');
            } else if (numbers[i] == 6) {
                right = 6;
                sb.append('R');
            } else if (numbers[i] == 9) {
                right = 9;
                sb.append('R');
            } else if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 11){
                if (distance(right, numbers[i]) < distance(left,numbers[i])){
                    right = numbers[i];
                    sb.append('R');
                } else if (distance(right, numbers[i]) == distance(left,numbers[i]) && hand == "right") {
                    //Update right hand
                    right = numbers[i];
                    sb.append('R');
                } else {
                    left = numbers[i];
                    sb.append('L');
                }
            }

        }

        return sb.toString();
    }



    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] t = br.readLine().split(", ");
        String hand = br.readLine();
        int[] numbers = new int[t.length];

        for (int i = 0; i < t.length; i++) {
            numbers[i] = stoi(t[i]);
        }

        String ans = solution(numbers, hand);


    }
}

