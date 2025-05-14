public class conditional_statement_if_else {
    public static void main(String[] args) {
        //boolean attendence = true;
        char ohhg ='o';
        int total = 10;
        if (ohhg == 'o')
        {
            if (total >=50)  //NESTED IF ELSE --CONTAINS ANOTHER IF INSIDE AN IF-CONDITION (NESTED IF WRIITEN ON IF ELSE IF AND ELSE LIKE ANY CONDITION)
                System.out.println("you are attended the class");
        } else if (ohhg == 'o') {
            System.out.println("you are on-duty");    //else if writted many times unlimited
        } else if (ohhg=='e') {
            System.out.println("you are off-duty");

        } else
        {
            System.out.println("you are not attended the class");
        }
        System.out.println("program ended");
    }
}
