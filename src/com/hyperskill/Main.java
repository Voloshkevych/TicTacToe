package com.hyperskill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String[][] tttArray = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tttArray[i][j] = " ";
            }
        }

        System.out.println("---------");
        System.out.println("| " + tttArray[0][0] + " " + tttArray[0][1] + " " + tttArray[0][2] + " |");
        System.out.println("| " + tttArray[1][0] + " " + tttArray[1][1] + " " + tttArray[1][2] + " |");
        System.out.println("| " + tttArray[2][0] + " " + tttArray[2][1] + " " + tttArray[2][2] + " |");
        System.out.println("---------");

        boolean checkOfXWin = false;
        int countOfXWin = 0;

        boolean checkOfOWin = false;
        int countOfOWin = 0;

        boolean checkOfDraw = false;

        int countDown = 0;
        do {

            System.out.println("Enter the coordinates: ");
            if (!read.hasNextInt()) {
                System.out.println("You should enter numbers!");
                read.nextLine();
            } else {
                int coordinate1 = read.nextInt();
                int coordinate2 = read.nextInt();

                if (coordinate1 < 1 || coordinate2 < 1 || coordinate1 > 3 || coordinate2 > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (String.valueOf(tttArray[coordinate1 - 1][coordinate2 - 1]).contains("X") || String.valueOf(tttArray[coordinate1 - 1][coordinate2 - 1]).contains("O")) {
                    System.out.println("This cell is occupied! Choose another one!");
                } else if (countDown % 2 == 0){
                    tttArray[coordinate1 - 1][coordinate2 - 1] = "X";
                    countDown++;
                    System.out.println("---------");
                    System.out.println("| " + tttArray[0][0] + " " + tttArray[0][1] + " " + tttArray[0][2] + " |");
                    System.out.println("| " + tttArray[1][0] + " " + tttArray[1][1] + " " + tttArray[1][2] + " |");
                    System.out.println("| " + tttArray[2][0] + " " + tttArray[2][1] + " " + tttArray[2][2] + " |");
                    System.out.println("---------");

                    if (!checkOfXWin) {
                        for (int i = 0; i < 3; i++) {
                            if (String.valueOf(tttArray[i][i]).contains("X")) {
                                countOfXWin++;
                            }
                        }
                        if (countOfXWin == 3) {
                            checkOfXWin = true;
                        } else {
                            countOfXWin = 0;
                        }
                    }

                    if (!checkOfXWin) {
                        for (int i = 0; i < 3; i++) {
                            int j = 2 - i;
                            if (String.valueOf(tttArray[i][j]).contains("X")) {
                                countOfXWin++;
                            }
                        }
                        if (countOfXWin == 3) {
                            checkOfXWin = true;
                        } else {
                            countOfXWin = 0;
                        }
                    }

                    if (!checkOfXWin) {
                        for (int j = 0; j < 3; j++) {
                            if (String.valueOf(tttArray[0][j]).contains("X")) {
                                countOfXWin++;
                            }
                        }
                        if (countOfXWin == 3) {
                            checkOfXWin = true;
                        } else {
                            countOfXWin = 0;
                        }
                    }

                    if (!checkOfXWin) {
                        for (int j = 0; j < 3; j++) {
                            if (String.valueOf(tttArray[1][j]).contains("X")) {
                                countOfXWin++;
                            }
                        }
                        if (countOfXWin == 3) {
                            checkOfXWin = true;
                        } else {
                            countOfXWin = 0;
                        }
                    }

                    if (!checkOfXWin) {
                        for (int j = 0; j < 3; j++) {
                            if (String.valueOf(tttArray[2][j]).contains("X")) {
                                countOfXWin++;
                            }
                        }
                        if (countOfXWin == 3) {
                            checkOfXWin = true;
                        } else {
                            countOfXWin = 0;
                        }
                    }

                    if (!checkOfXWin) {
                        for (int i = 0; i < 3; i++) {
                            if (String.valueOf(tttArray[i][0]).contains("X")) {
                                countOfXWin++;
                            }
                        }
                        if (countOfXWin == 3) {
                            checkOfXWin = true;
                        } else {
                            countOfXWin = 0;
                        }
                    }

                    if (!checkOfXWin) {
                        for (int i = 0; i < 3; i++) {
                            if (String.valueOf(tttArray[i][1]).contains("X")) {
                                countOfXWin++;
                            }
                        }
                        if (countOfXWin == 3) {
                            checkOfXWin = true;
                        } else {
                            countOfXWin = 0;
                        }
                    }

                    if (!checkOfXWin) {
                        for (int i = 0; i < 3; i++) {
                            if (String.valueOf(tttArray[i][2]).contains("X")) {
                                countOfXWin++;
                            }
                        }
                        if (countOfXWin == 3) {
                            checkOfXWin = true;
                        }
                        countOfXWin = 0;
                    }

                    if (!checkOfXWin && !checkOfOWin && countDown == 8) {
                        checkOfDraw = true;
                    }


                } else if (countDown % 2 == 1) {
                    tttArray[coordinate1 - 1][coordinate2 - 1] = "O";
                    countDown++;
                    System.out.println("---------");
                    System.out.println("| " + tttArray[0][0] + " " + tttArray[0][1] + " " + tttArray[0][2] + " |");
                    System.out.println("| " + tttArray[1][0] + " " + tttArray[1][1] + " " + tttArray[1][2] + " |");
                    System.out.println("| " + tttArray[2][0] + " " + tttArray[2][1] + " " + tttArray[2][2] + " |");
                    System.out.println("---------");

                    if (!checkOfOWin) {
                        for (int i = 0; i < 3; i++) {
                            if (String.valueOf(tttArray[i][i]).contains("O")) {
                                countOfOWin++;
                            }
                        }
                        if (countOfOWin == 3) {
                            checkOfOWin = true;
                        } else {
                            countOfOWin = 0;
                        }
                    }

                    if (!checkOfOWin) {
                        for (int i = 0; i < 3; i++) {
                            int j = 2 - i;
                            if (String.valueOf(tttArray[i][j]).contains("O")) {
                                countOfOWin++;
                            }
                        }
                        if (countOfOWin == 3) {
                            checkOfOWin = true;
                        } else {
                            countOfOWin = 0;
                        }
                    }

                    if (!checkOfOWin) {
                        for (int j = 0; j < 3; j++) {
                            if (String.valueOf(tttArray[0][j]).contains("O")) {
                                countOfOWin++;
                            }
                        }
                        if (countOfOWin == 3) {
                            checkOfOWin = true;
                        } else {
                            countOfOWin = 0;
                        }
                    }

                    if (!checkOfOWin) {
                        for (int j = 0; j < 3; j++) {
                            if (String.valueOf(tttArray[1][j]).contains("O")) {
                                countOfOWin++;
                            }
                        }
                        if (countOfOWin == 3) {
                            checkOfOWin = true;
                        } else {
                            countOfOWin = 0;
                        }
                    }

                    if (!checkOfOWin) {
                        for (int j = 0; j < 3; j++) {
                            if (String.valueOf(tttArray[2][j]).contains("O")) {
                                countOfOWin++;
                            }
                        }
                        if (countOfOWin == 3) {
                            checkOfOWin = true;
                        } else {
                            countOfOWin = 0;
                        }
                    }

                    if (!checkOfOWin) {
                        for (int i = 0; i < 3; i++) {
                            if (String.valueOf(tttArray[i][0]).contains("O")) {
                                countOfOWin++;
                            }
                        }
                        if (countOfOWin == 3) {
                            checkOfOWin = true;
                        } else {
                            countOfOWin = 0;
                        }
                    }

                    if (!checkOfOWin) {
                        for (int i = 0; i < 3; i++) {
                            if (String.valueOf(tttArray[i][1]).contains("O")) {
                                countOfOWin++;
                            }
                        }
                        if (countOfOWin == 3) {
                            checkOfOWin = true;
                        } else {
                            countOfOWin = 0;
                        }
                    }

                    if (!checkOfOWin) {
                        for (int i = 0; i < 3; i++) {
                            if (String.valueOf(tttArray[i][2]).contains("O")) {
                                countOfOWin++;
                            }
                        }
                        if (countOfOWin == 3) {
                            checkOfOWin = true;
                        } else {
                            countOfOWin = 0;
                        }
                    }

                    if (!checkOfXWin && !checkOfOWin && countDown == 8) {
                        checkOfDraw = true;
                    }
                }
            }
        } while (!checkOfXWin && !checkOfOWin && countDown < 9);

        if (checkOfXWin) {
            System.out.println("X wins");
        } else if (checkOfOWin) {
            System.out.println("O wins");
        } else if (!checkOfXWin && !checkOfOWin && checkOfDraw) {
            System.out.println("Draw");
        }


    }
}