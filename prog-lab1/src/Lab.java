class Lab {
    public static void main(String[] args) {
        // Вариант №53275
        System.out.println("P3109 Полуянов Александр\n" + "Вариант №53275\n");

        // Task 1
        int[] a = new int[11];
        for (int i = 5; i < 16; i++) {
            a[i - 5] = i;
        }
        System.out.println(
                "Создать одномерный массив a типа int. Заполнить его числами от 5 до 15 включительно в порядке возрастания.");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d\t", a[i]);
        }

        // Task 2
        System.out.println(
                "\n\nСоздать одномерный массив x типа double. Заполнить его 17-ю случайными числами в диапазоне от -7.0 до 14.0.");
        double[] x = new double[17];
        double min = -7.0;
        double max = 14.0;
        for (int i = 0; i < x.length; i++) {
            x[i] = getRandomNumber(min, max);
        }
        for (int i = 0; i < x.length; i++) {
            if (i % 5 == 0) {
                // только для красоты
                System.out.println("");
            }
            System.out.printf("%10.2f", x[i]);
        }
        
        // Task 3
        System.out.println(
                "\n\nСоздать двумерный массив a размером 11x17. Вычислить его элементы по формулам из приложения.");
        System.out.println("\tесли z[i] = 8, то z[i][j] = ln(sqrt(sin^2(h)))\n"
                + "\tесли a[i] ∈ {5, 9, 10, 13, 14}, то z[i][j] = tan((1/4-(1/3/(1/2-h))^(h))^2)\n"
                + "\tдля остальных значений z[i][j]: z[i][j] = e^(cos(tan(1/3*h)))");
        double[][] z = new double[11][17];
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < 17; j++) {
                double h = x[j];
                if (i == 8) {
                    z[i][j] = Math.log(Math.sqrt(Math.pow(Math.sin(h), 2)));
                } else if (i == 5 || i == 9 || i == 10 || i == 13 || i == 14) {
                    z[i][j] = Math.tan(Math.pow(1 / 4 - (Math.pow((1 / 3 / (1 / 2 - h)), h)), 2));
                } else {
                    z[i][j] = Math.pow(Math.E, (Math.cos(Math.tan(1 / 3 * h))));
                }
            }
        }
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < 17; j++) {
                if (j % 17 == 0) {
                    System.out.println("");
                }
                System.out.printf("%8.2f", z[i][j]);
            }
        }
        System.out.println("\n\nНапечатать полученный в результате массив в формате с двумя знаками после запятой.\n");
    }

    public static double getRandomNumber(double min, double max) {
        return (double) ((Math.random() * (max - min)) + min);
    }

}