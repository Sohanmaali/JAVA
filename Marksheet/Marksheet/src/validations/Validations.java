package validations;

public class Validations {

    public static void main(String[] args) {
        System.out.println(Validations.checkMarks(""));
    }

    public static boolean checkYear(String year) {
        int year1 = 0;
        try {
            year1 = Integer.parseInt(year);
            return year1 > 0 && year1 < 5;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkRollNumber(String roll) {
        int roll1 = 0;
        try {
            roll1 = Integer.parseInt(roll);
            return roll1 > 0;// && roll1 < 5;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkSemester(String sem, int year) {
        int sem1 = 0;
        try {
            sem1 = Integer.parseInt(sem);

        } catch (NumberFormatException e) {
            return false;
        }
        switch (year) {
            case 1 -> {
                return sem1 == 2 || sem1 == 1;
            }
            case 2 -> {
                return sem1 == 3 || sem1 == 4;
            }
            case 3 -> {
                return sem1 == 5 || sem1 == 6;
            }
            case 4 -> {
                return sem1 == 7 || sem1 == 8;
            }
        }
        return false;
    }

    public static boolean checkMarks(String mark) {
        int mark1 = 0;
        try {
            mark1 = Integer.parseInt(mark);

        } catch (NumberFormatException e) {

            return false;
        }
        if (mark1 < 0 || mark1 > 100) {

            return false;
        } else {
            return true;
        }
    }
}
