package com.company;
import java.lang.reflect.Array;
import java.util.stream.Collectors;
import java.util.*;
public class Company
{
    HashMap<String, Double> people = new HashMap<String, Double>();
    int SUM;
    public Company() {}
    public void People()
    {
        //hire()
        //hireAll();
       // fire();
       /* for (Map.Entry entry : people.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " Salary: "
                    + entry.getValue());
        }*/
        //sort();
        //System.out.println(getIncome());
        //getTopSalaryStaff(5);
        //getLowestSalaryStaff(6);
        //getTopSalaryStaff(1);
    }

    public void sort()
    {
        people.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    public HashMap<String, Double> getPeople() {
        return people;
    }

    public void setPeople(HashMap<String, Double> people) {
        this.people = people;
    }

    public void fire()
    {
        Object firstKey = people.keySet().toArray()[0];
        people.keySet().remove(firstKey);
    }

    public void setIncome(int sum)
    {
        SUM=sum;
    }

    public int getIncome()
    {
        return SUM;
    }

    public void hireAll(int num, int Tittle)
    {
        for (int i=0; i<num; i++)
        {
            hire(Tittle);
        }
    }

    public void hire(int Tittle)
    {
        int Salary=Salary = (int) (50000 + Math.random() * 20000);
        if(Tittle==1)
        {
            Salary = (int) (50000 + Math.random() * 20000);
            Operator operator = new Operator(name(), name(), 0, "Operator");
            people.put((operator.getName()+" "+operator.getSurname()), (operator.calcSalary(Salary)));
        }
        if(Tittle==2)
        {
            int Salary1 = (int) (115000 + Math.random() * 35000);
            Salary = (int) (70000 + Math.random() * 50000);
            Manager operator = new Manager(name(), name(), Salary1*(5/100), "Manager");
            people.put((operator.getName()+" "+operator.getSurname()), (operator.calcSalary(Salary)));
            SUM=SUM+Salary1;
        }
        if(Tittle==3)
        {
            Salary = (int) (50000 + Math.random() * 200000);
            int dop=0;
            if (getIncome()>=10000000)
            {
                dop=Salary*(150/100);
            }
            TopManager operator = new TopManager(name(), name(),dop, "TopManager");
            people.put((operator.getName()+" "+operator.getSurname()), (operator.calcSalary(Salary)));
        }
    }

    public String name()
    {

        String first="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String later="abcdefghijklmnopqrstuvwxyz";
        int num = (int) ( 1+Math.random() * 26);
        String Name =  first.substring(num-1,num);
        int cons = (int) (3+ Math.random() * 6);
        for (int i=0; i<cons; i++)
        {
            num = (int) ( Math.random() * 26);
            Name = (Name  + later.charAt(num));
        }
        //System.out.println(Name);
        return Name;
    }

    public ArrayList<Double> getTopSalaryStaff(int count)
    {
        if (count<=0 || count >people.size()) {
            System.out.println("Wrong data");
            System.exit(1);
        }
        int i=0;
        Double[] salary = new Double[people.size()];
        for (Map.Entry entry : people.entrySet())
        {
            salary[i] = (Double) entry.getValue();
            i++;
        }
        Arrays.sort(salary, Collections.reverseOrder());
        ArrayList<Double> finish =new ArrayList<Double>(Arrays.asList(salary));

        int j= finish.size()-1;

       while (j>=count)
        {
            finish.remove(j);
            j--;
        }
        for(int k=0; k<finish.size(); k++)
        {
            System.out.println(finish.get(k));
        }
        return finish;
    }

    public ArrayList<Double> getLowestSalaryStaff(int count)
    {
        if (count<=0 || count >people.size()) {
            System.out.println("Wrong data");
            System.exit(1);
        }
        int i=0;
        Double[] salary = new Double[people.size()];
        for (Map.Entry entry : people.entrySet())
        {
            salary[i] = (Double) entry.getValue();
            i++;
        }
        Arrays.sort(salary);
        ArrayList<Double> finish =new ArrayList<Double>(Arrays.asList(salary));

        int j= finish.size()-1;

        while (j>=count)
        {
            finish.remove(j);
            j--;
        }
        for(int k=0; k<finish.size(); k++)
        {
            System.out.println(finish.get(k));
        }
        return finish;
    }
}
