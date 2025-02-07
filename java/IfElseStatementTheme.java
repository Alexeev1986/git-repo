public class IfElseStatementTheme {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("\nЗадание №1");

        boolean gender = true;
        if (!gender){
            System.out.println("Мужской пол");
        } else {
            System.out.println("Женский пол");
        }

        int age = 15;
        if (age > 18){
            System.out.println("Совершеннолетиее достигнуто вам " + age);
        } else {
            System.out.println("До совершеннолетия осталось " + (18 - age) + " года");
        }

        double height = 1.9;
        if(height < 1.8) {
            System.out.println("Ваш рост ниже 1.8 метра и составляет " + height);
        } else {
            System.out.println("Ваш рост выше 1.8 метра и составляет " + height);
        }

        char firstLetterName = "Anton".charAt(0);
        if(firstLetterName == "M".charAt(0)){
            System.out.println("Ваше имя начина начинается на букву M");
        } else if(firstLetterName == "I".charAt(0)){
            System.out.println("Ваше имя начина начинается на букву I");
        } else{
            System.out.println("Ваше имя начина начинается на букву " + firstLetterName);
        }

        //Задание 2
        System.out.println("\nЗадание №2");

        int numberOne = 43;
        int numberTwo = 83;
        if(numberOne > numberTwo) {
            System.out.println("Число " + numberOne + " больше числа " + numberTwo);
        } else if(numberTwo > numberOne){
            System.out.println("Число " + numberOne + " меньше числа " + numberTwo);
        } else if(numberOne == numberTwo){
            System.out.println("Число " + numberOne + " равно числу " + numberTwo);
        }

        //Задание 3
        System.out.println("\nЗадание №3");

        int number = 0;
        if(number == 0) {
            System.out.println("Выбранное вами число является нулем.");
        } else if(number > 0) {
            boolean isNumberEven = number % 2 == 0;
            if(isNumberEven == true) {
                System.out.println("Число " + number + " является положительным и четным");
            } else if(isNumberEven == false){
                System.out.println("Число " + number + " является положительным и нечетным");
            }
        }else if(number < 0) {
            boolean isNumberEven = number % 2 == 0;
            if(isNumberEven == true) {
                System.out.println("Число " + number + " является отрицательным и четным");
            } else if(isNumberEven == false) {
                System.out.println("Число " + number + " является отрицательным и нечетным");
            }
        }

        //Задание 4
        System.out.println("\nЗадание №4");

        numberOne = 523;
        numberTwo = 223;
        int onesNumberOne, tensNumberOne, hundredsNumberOne;
        int onesNumberTwo, tensNumberTwo, hundredsNumberTwo;
        onesNumberOne = numberOne % 10;
        tensNumberOne = (numberOne / 10) % 10;
        hundredsNumberOne = (numberOne / 100) % 10;
        onesNumberTwo = numberTwo % 10;
        tensNumberOne = (numberTwo / 10) % 10;
        hundredsNumberTwo = (numberTwo / 100) % 10;
        if(hundredsNumberOne == hundredsNumberTwo & tensNumberOne == tensNumberOne & onesNumberOne == onesNumberTwo){
            System.out.println("Выбранные вами числа равны");
        }else if(hundredsNumberOne == hundredsNumberTwo || tensNumberOne == tensNumberOne || onesNumberOne == onesNumberTwo){
                System.out.println("Выбранные числа : " + numberOne + " и " + numberTwo);
                if(hundredsNumberOne == hundredsNumberTwo) {
                    System.out.println("Одинаковый сотни: " + hundredsNumberOne + " и " + hundredsNumberTwo);
                }
                if(tensNumberOne == tensNumberOne) {
                    System.out.println("Одинаковый десятки: " + tensNumberOne + " и " + tensNumberOne);
                }
                if(onesNumberOne == onesNumberTwo) {
                    System.out.println("Одинаковый единицы: " + onesNumberOne + " и " + onesNumberTwo);
                }
                
        }else{
            System.out.println("В выбранных вами числах нет одинаковых цифр");
        }

        //Задание 5
        System.out.println("\nЗадание №5");

        char symbol = '$';
        boolean isLetter = Character.isLetter(symbol);            //Переменная для распознания Букв
        boolean isLetterUp = Character.isUpperCase(symbol);       //Переменная для распознания Регистра Букв
        boolean isNumber = Character.isDigit(symbol);             //Переменная для распознания Чисел

        if(isLetter == true) {
            if(isLetterUp == true) {
                System.out.println(symbol + " - большая буква");
            }else{
                System.out.println(symbol + " - маленькая буква");
            }
        }else if(isNumber == true) {
            System.out.println(symbol + " - это число");
        }else{
            System.out.println(symbol + " - это иной символ");
        }

        //Задание 6
        System.out.println("\nЗадание №6");

        double deposit = 321123.59;
        double depositInterestRate = 0;
        double interestRate = 0;
        if(deposit < 100000) {
            depositInterestRate = deposit * 0.05;
            interestRate = 0.05;
        }else if(deposit >= 100000 & deposit <= 300000) {
            depositInterestRate = deposit * 0.07;
            interestRate = 0.07;
        }else if(deposit > 300000) {
            depositInterestRate = deposit * 0.1;
            interestRate = 0.10;
        }
    
        System.out.println("Сумма вашего вклада составляет = " + deposit);
        System.out.println("Процентная ставка =" + String.format("%.2f",depositInterestRate));
        System.out.println("Итоговая сумма =" + String.format("%.2f", depositInterestRate + deposit));


        //Задание 7
        System.out.println("\nЗадание №7");

        float percentHistoryEvaluation = 59F;
        float percentProgrammingEvaluation = 92F;
        short historyEvaluation = 0;
        short programmingEvaluation = 0;

        if(percentHistoryEvaluation <= 60) {
            historyEvaluation = 2;
        }else if(percentHistoryEvaluation > 60 & percentHistoryEvaluation <= 73){ 
            historyEvaluation = 3;
        }else if(percentHistoryEvaluation > 73 & percentHistoryEvaluation <= 91){
            historyEvaluation = 4;
        }else if(percentHistoryEvaluation > 91) {
            historyEvaluation = 5;
        }

        if(percentProgrammingEvaluation <= 60) {
            programmingEvaluation = 2;
        }else if(percentProgrammingEvaluation > 60 & percentProgrammingEvaluation <= 73) { 
            programmingEvaluation = 3;
        }else if(percentProgrammingEvaluation > 73 & percentProgrammingEvaluation <= 91) {
            programmingEvaluation = 4;
        }else if(percentProgrammingEvaluation > 91) {
            programmingEvaluation = 5;
        }

        System.out.println("История(" + Math.round(percentHistoryEvaluation) + ") оценка - " + historyEvaluation);
        System.out.println("Программирование(" + Math.round(percentProgrammingEvaluation) + ") оценка - " + programmingEvaluation);

        float avarageScore = (historyEvaluation + programmingEvaluation) / 2;
        System.out.println("Средний балл по предметам = " + (avarageScore));

        float avaregItem = (percentHistoryEvaluation + percentProgrammingEvaluation) /2;
        System.out.println("Средний процент по предметам = " + avaregItem + "%");

        //Задание 8
        System.out.println("\nЗадание №8");

        double soldMonthly = 13025.233;
        double rentMonthly = 5123.018;
        double costOfProduction = 9001.729;
        double soldYear = soldMonthly * 12;
        double rentYear = rentMonthly * 12;
        double costOfProductionYear = costOfProduction * 12;
        double profitYear = soldYear - (rentYear + costOfProductionYear);
        if(profitYear > 0) {
            System.out.println("Прибыль за год: +" + String.format("%.2f",profitYear));
        }else {
            System.out.println("Прибыль за год: " + String.format("%.2f",profitYear));
        }
    }
}