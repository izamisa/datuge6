package codeflow;
public class flows {


        public void methodA(String input) {
            System.out.println("J");
            if (!input.equals("start")) {
                System.out.println("A");
                methodB("start");
            } else {
                System.out.println("V");
                System.out.println(methodC(input));

            }
            System.out.println("A");
        }

        public void methodB(String start) {
            System.out.println("E");
            System.out.println("R");

        }

        public int methodC(String input) {
            System.out.println("S");
            methodD(input.length());
            return input.length() * 2;
        }

        public void methodD(int number) {
            System.out.println("J");
            if (number > 5) {
                System.out.println("O");
            }
            System.out.println("V");

        }



    }
