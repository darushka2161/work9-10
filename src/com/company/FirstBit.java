package com.company;

public class FirstBit {
    public FirstBit(Company FirstBit) {
        System.out.println("\nFirstBit\n");
        FirstBit.hireAll(180,1);
        FirstBit.hireAll(80,2);
        FirstBit.hireAll(10,3);
        System.out.println("TOP:");
        FirstBit.getTopSalaryStaff(15);
        System.out.println("\nBOTTOM:");
        FirstBit.getLowestSalaryStaff(30);
        for(int i=0; i<270/2; i++)
        {
            FirstBit.fire();
        }
        System.out.println("\nNEW TOP:");
        FirstBit.getTopSalaryStaff(15);
        System.out.println("\nNEW BOTTOM:");
        FirstBit.getLowestSalaryStaff(30);
        System.out.println("___________________________________________");
    }
}
