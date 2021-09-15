package algoritmoLuhn;

import java.util.Random;

public class NumberGenerator {

    public static int counter = 0;
    public static final String Identificador = "489600";
    String number;

    public String generateNumberByLuhnAlgorithm() {
        Random generator = new Random();
        String numeroCuentaCliente = String.format("%09d", generator.nextInt(1000000001));
        String noCheckSum = Identificador + numeroCuentaCliente;
        int checkDigit = generateCheckSum(noCheckSum);
        number = noCheckSum + checkDigit;
        return number;
    }

    private static int generateCheckSum(String noCheckSum) {
        String afterStepOne = stepOneLuhnAlgorithm(noCheckSum);
        String afterStepTwo = stepTwoLuhnAlgorithm(afterStepOne);
        int sum = 0;
        for (int i = 0; i < afterStepTwo.length(); i++) {
            sum += Integer.parseInt(String.valueOf(afterStepTwo.charAt(i)));
        }
        if (sum % 10 == 0) {
            return 0;
        } else {
            return 10 - (sum % 10);
        }
    }

    private static String stepTwoLuhnAlgorithm(String afterStepOne) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < afterStepOne.length(); i++) {
            int number = Integer.parseInt(String.valueOf(afterStepOne.charAt(i)));
            if (number > 9) {
                number -= 9;
            }
            builder.append(number);
        }
        return builder.toString();
    }

    private static String stepOneLuhnAlgorithm(String noCheckSum) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < noCheckSum.length(); i++) {
            if (i % 2 == 0) {
                char c = noCheckSum.charAt(i);
                String strDigit = String.valueOf(c);
                int doubled = Integer.parseInt(strDigit) * 2;
                builder.append(doubled);
            } else {
                builder.append(noCheckSum.charAt(i));
            }
        }
        return builder.toString();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
