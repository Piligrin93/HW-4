package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1

        byte A = 1;
        while (A <= 10) {
            System.out.print(A + " ");
            A++;
        }
    System.out.println();

        byte B = 10;
        for (B = 10; B >=1; B--) {
            System.out.print(B + " ");
        }
    System.out.println();


    // Задание 2

        int friday = 1;

        for (friday = friday; friday <= 31; friday = friday + 7) {
             System.out.println("Segodnya Pyatnicha " + friday + " den' mesyacha. Pora sdat' otchet");
        }
    // Здесь хотел сделать так, чтобы при вводе дня пятницы (Как в условии от 1 до 7), мне выдавало ошибку. Но если я ставлю это условие, цикл for все равно крутиться и не воспринимает условие


    // Заданиче 3

        int periodComet = 0;
        for (periodComet = periodComet; periodComet < 2100; periodComet = periodComet + 79) {
            if (periodComet > 1822 && periodComet < 2100)
            System.out.println(periodComet);
        }
    // Открыл цикл for, задал даты с 0 года по 2100 (условие на 100 лет вперед). В теле цикла добавил условие, чтобы выводили даты за 200 лет до нынешней, и на 100 лет вперед - ближайшую.

    }
}
