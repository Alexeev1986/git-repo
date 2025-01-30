import java.math.BigDecimal;

public class expBigDecimal {
    public static void main (String[] args){

        BigDecimal a = new BigDecimal("1.01");
        System.out.println(a);

        BigDecimal b = new BigDecimal("2.02");
        System.out.println(b);
        
        BigDecimal sum = a.add(b);
        System.out.println(sum);
        

    }
}

