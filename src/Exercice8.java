class Exercice8 {
    public static void main(String[] args) {
        int matriX[][] = new int[10][10];

        for (int i = 0; i < matriX.length; i++) {
            for (int j = 0; j < matriX.length; j++) {
                matriX[0][4] = 1;
                matriX[2][6] = 1;
                matriX[3][1] = 1;
                matriX[8][6] = 1;
                System.out.print(matriX[i][j]);
            }
            System.out.println();
        }

    }
}
