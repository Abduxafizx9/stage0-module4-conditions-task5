package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int remainder1 = year%4 ;
        int remainder2 = year%100;
        int remainder3 = year%400;
        switch(remainder1){
            case 0:
                switch (remainder2)
                {
                    case 0:
                        switch (remainder3)
                        {
                            case 0:
                                System.out.println("leap");
                                break;
                            default:
                                System.out.println("not leap");
                                break;

                        }
                    default:
                        System.out.println("leap");
                        break;
                }
            default:
                System.out.println("not leap");


        }
    }
}
