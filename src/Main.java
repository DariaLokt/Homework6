public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i+1);
        }

        //Task 2
        System.out.println("Task 2");
        for (int i = 10; i > 0; i--)
        {
            System.out.println(i);
        }

        //Task 3
        System.out.println("Task 3");
        for (int i = 0; i <= 17; i += 2)
        {
            System.out.println(i);
        }

        //Task 4
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--)
        {
            System.out.println(i);
        }

        //Task 5
        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i += 4)
        {
            System.out.println(i + " год является високосным");
        }

        //Task 6
        System.out.println("Task 6");
        for (int i = 1; i <= 14; i++)
        {
            System.out.println(i*7);
        }

        //Task 7
        System.out.println("Task 7");
        for (int i = 1; i <= 512; i *= 2)
        {
            System.out.println(i);
        }

        //Task 8
        System.out.println("Task 8");
        int sum = 0;
        for (int i = 1; i <= 12; i++)
        {
            sum += 29000;
            System.out.println("Месяц " + i +", сумма накоплений равна " + sum + " рублей");
        }

        //Task 9
        System.out.println("Task 9");
        sum = 0;
        for (int i = 1; i <= 12; i++)
        {
            sum = sum + sum/100 + 29000;
            System.out.println("Месяц " + i +", сумма накоплений равна " + sum + " рублей");
        }

        //Task 10
        System.out.println("Task 10");
        int answer;
        for (int i = 1; i <= 10; i++)
        {
            answer = i * 2;
            System.out.println("2*" + i + "=" + answer);
        }
    }
}