public class BudgetCalculator {
    public static void main(String [] args){
        int SALARY=3000;
        double SAVING_PRECENT=.20;
        double RENT_PERCENT=.30;
        double GROCERIES_PERCENT=.15;
        double ENTERTAINMENT_PERCENT=.10;
        System.out.println(SALARY);
        System.out.println(SALARY*SAVING_PRECENT);
        System.out.println(SALARY*RENT_PERCENT);
        System.out.println(SALARY*GROCERIES_PERCENT);
        System.out.println(SALARY*ENTERTAINMENT_PERCENT);
        System.out.println((SALARY*SAVING_PRECENT)+(SALARY*RENT_PERCENT)+(SALARY*GROCERIES_PERCENT)+(SALARY*ENTERTAINMENT_PERCENT));
        System.out.println((SALARY)-((SALARY*SAVING_PRECENT)+(SALARY*RENT_PERCENT)+(SALARY*GROCERIES_PERCENT)+(SALARY*ENTERTAINMENT_PERCENT)));
    }
}