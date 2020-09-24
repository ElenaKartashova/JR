package visokos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if ((a % 400 == 0) || (a % 100 == 0) || (a % 4 == 0)) {
            System.out.println("количество дней в году: 366");
        } else
            System.out.println("количество дней в году: 365");

    }

}

