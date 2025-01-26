public class IfElseStatementTheme {
    public static void main (String[] args){
        //Задание 1
        int yGender = 1;     // переменная Gender определяет: пол если 1 то мужской, если 0 то женский
        boolean isGender = yGender == 1;
        if(isGender == true){
            System.out.println("Мужской пол");
        } else if(isGender == false){
            System.out.println("Женский пол");
        }
        int yAge = 22;       // переменная yAge устанавливает ваш возраст
        if(yAge >= 18){
            System.out.println("Совершеннолетиее достигнуто вам " + yAge);
        } else if(yAge < 18){
            System.out.println("До совершеннолетия осталось" + (18 - yAge));
        }
        double yHeight = 1.9;       // переменная yHeight устанавливает ваш рост
        if(yHeight < 1.8){
            System.out.println("Ваш рост ниже 1.8 метра и составляет " + yHeight);
        } else if(yHeight > 1.8){
            System.out.println("Ваш рост выше 1.8 метра и составляет " + yHeight);
        }
        String mName = "Anton";       // переменная которая хранит ваше имя
        String LatterM = "M";
        String LatterI = "I";
        char FirstLetterName = mName.charAt(0);      //переменная которая хранит 1ю букву вашего имени
        if(FirstLetterName == LatterM.charAt(0) ){
            System.out.println("Ваше имя начина начинается на букву M");
        } else if(FirstLetterName == LatterM.charAt(0)){
            System.out.println("Ваше имя начина начинается на букву I");
        } else{
            System.out.println("Ваше имя не начина начинается на букву M и I,  но оно начинается на букву " + FirstLetterName);
        }
        //Задание 2
        int x1 = 43;    // в переменных x1 и x2 хранятся два числа
        int x2 = 83;
        System.out.println("Вы выбрали два числа: 1-е число = "  + x1 + " ; 2-е число = " + x2 );
        if(x1 > x2){
            System.out.println("Наиболшее 1 е число " + x1);
        } else if(x2 > x1){
            System.out.println("Наиболшее 2 е число " + x2);
        } else if(x1 == x2){
            System.out.println("1-е и 2-е число равны!");
        }

    }
}