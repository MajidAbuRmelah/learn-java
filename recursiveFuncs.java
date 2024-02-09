class RecursiveFuncs {
    public static int AddFive(int num, int until) {
        if (num >= until) {
            return num;
        }

        return AddFive(num + 5, until);
    }

    public static int FactorialCalculation(int num) {
        if (num == 1) {
            return 1;
        }

        return num * FactorialCalculation(num - 1);
    }

    public static int Exponentiation(int num, int power) {
        if (power == 1) {
            return num;
        }

        return num * Exponentiation(num, power - 1);
    }

    public static int SumOfDigits(int num) {
        if (num < 10) {
            return num;
        }

        return num % 10 + SumOfDigits(num / 10);
    }
}
