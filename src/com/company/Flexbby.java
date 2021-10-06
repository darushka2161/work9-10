package com.company;

import java.util.Scanner;

public class Flexbby {
    public Flexbby(Company Flexbby) {
        System.out.println("\nFlexbby\n\nвведите количество оперaторов манеджеров и топ-менеджеров:");
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();
        Flexbby.hireAll(num,1);
        num = in.nextInt();
        Flexbby.hireAll(num,2);
        num = in.nextInt();
        Flexbby.hireAll(num,3);
        in.close();
        Flexbby.sort();
        System.out.println("\nзаработок = "+Flexbby.getIncome()+"\n");
        for(int i=0; i<Flexbby.people.size()/4; i++)
        {
            Flexbby.fire();
        }
        for(int i=0; i<Flexbby.people.size()/10; i++)
        {
            Flexbby.hire(2);
        }
        System.out.println("заработок = "+Flexbby.getIncome());

    }
}
