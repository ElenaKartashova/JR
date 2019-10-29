package Control;

import static java.util.EnumSet.range;


public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) break; // Выход из цикла
            if (i % 9 != 0) continue; // Следующая итерация
            System.out.print(i + " ");
        }
        System.out.println();
        // Использование foreach:
        /*for(int i : range(100)) {
            if(i == 74) break; // Выход из цикла
            if(i % 9 != 0) continue; // Следующая итерация
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
        // "Бесконечный цикл":
        while(true) {
            i++;
        }
        int j = i * 27;
        if(j == 1269) break; // Выход из цикла
        if(i % 10 != 0)
            continue; // Возврат в начало цикла
        System.out.print(i + " ");
    }*/
    }
}

