class NormalFuncs {
    public static int AddFive(int num, int until) {
        for (int i = num; i <= until; i += 5) {
            num = i + 5;
        }

        return num;
    }
}
