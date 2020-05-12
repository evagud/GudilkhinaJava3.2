public class Main {
    public static void main(String[] args) {
        short Bonus;
        int InitialBalance = 7_000;
        int RefillSum = 2_000;
        short limit = 1000;
        if (RefillSum > limit) {
            short BehindEveryRub = 100;
            Bonus = (short) (RefillSum / BehindEveryRub);
        } else {
            Bonus = 0;
        }
        int TotalBalance = (InitialBalance + Bonus + RefillSum);
        System.out.println(TotalBalance);
    }
}

