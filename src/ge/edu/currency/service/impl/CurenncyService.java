package ge.edu.currency.service.impl;

import java.util.*;
import java.text.DecimalFormat;

class CurrencyService {
    public static void main(String[] args)
    {
        double GEL,Dollar;
        DecimalFormat f = new DecimalFormat("##.###");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the currency code 1:GEL\n2:Dollar");
        code=sc.nextInt();


        if(code == 1)
        {
            System.out.println("Enter amount in GEL");
            GEL = sc.nextFloat();

            Dollar = GEL / 3;
            System.out.println("Dollar : "+f.format(Dollar));




        }


        else if (code == 2)
        {
            System.out.println("Enter amount in Dollar");
            Dollar = sc.nextFloat();

            GEL = Dollar * 3;
            System.out.println("Rupees : "+f.format(GEL));

        }



        else
            System.out.println("Invalid Code");

    }

}
