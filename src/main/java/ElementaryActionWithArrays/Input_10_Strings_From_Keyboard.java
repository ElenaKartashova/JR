package ElementaryActionWithArrays;

//Ввод 10 строк с клавиатуры

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input_10_Strings_From_Keyboard {
    static int i;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = reader.readLine();
        }
        System.out.println(list.length);
    }
}
