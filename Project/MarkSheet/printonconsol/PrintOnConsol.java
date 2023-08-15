package printonconsol;

import datapackage.*;
import operation.*;

public class PrintOnConsol {

    public void printMarksheet(DataClass ref[], int i) throws ClassNotFoundException {
        Operation ob = new Operation();
        PrintOnConsol poc = new PrintOnConsol();
        System.out.println("\t\t   --------------------------------------------------------------------");
        System.out.println("\t\t   |");

        System.out.println("\t\t   |\t\t\t\tBU BHOPAL   \n\t\t   |                                                   ");
        System.out.println("\t\t   |\tName  : " + ref[i].getName() + "\t\t\t\t\tBranch : " + ref[i].getBranch());
        System.out.println("\t\t   |\tFName : " + ref[i].getFName() + "\t\t\t\t\tSem    : " + ref[i].getSem() + "th");
        System.out.println("\t\t   |\tMName : " + ref[i].getMName() + "\t\t\t\t\tYear   : " + ref[i].getYear());
        System.out.println(
                "\t\t   |\tRoll  : " + ref[i].getRollNumber() + "\t\t\t\t\tCourse : " + ref[i].getCorse() + "\n");
        System.out.println("\t\t   --------------------------------------------------------------------");
        System.out.println("\t\t   |\tSubCode      SubName       MaxMarks      MinMarks      ObtMark");
        System.out.println("\t\t   --------------------------------------------------------------------");
        System.out.println("\t\t   |\tBCA100       Physics        100            33            " + ref[i].getphysics());
        System.out.println("\t\t   --------------------------------------------------------------------");
        System.out
                .println("\t\t   |\tBCA101       Chemistry      100            33            " + ref[i].getchemistry());
        System.out.println("\t\t   --------------------------------------------------------------------");
        System.out.println("\t\t   |\tBCA102       Math           100            33            " + ref[i].getmath());
        System.out.println("\t\t   --------------------------------------------------------------------");
        System.out.println("\t\t   |\tBCA103       Hindi          100            33            " + ref[i].gethindi());
        System.out.println("\t\t   --------------------------------------------------------------------");
        System.out.println("\t\t   |\tBCA104       English        100            33            " + ref[i].getenglish());
        System.out.println("\t\t   --------------------------------------------------------------------");
        System.out.println("\t\t   |\n\t\t   |");
        poc.division(ref, i);
        System.out.println("\t\t   |\n\t\t   |\n\t\t   |\n\t\t   |");
        System.out.println("\t\t   --------------------------------------------------------------------");
        System.out.println(
                " ____________________________________________________________________________________________________________________");
    }

    public void division(DataClass ref[], int i) throws ClassNotFoundException {
        if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33
                && ref[i].getenglish() < 33) {
            System.out.println("   \t\t   |\tFail in All sub");
        } else if ((ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33
                && ref[i].gethindi() < 33)
                || (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33
                        && ref[i].getmath() < 33 & ref[i].getenglish() < 33)
                || (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33
                        && ref[i].getenglish() < 33)
                || (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33
                        && ref[i].getenglish() < 33)
                || (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33
                        && ref[i].getenglish() < 33)) {
            System.out.println("   \t\t   |\tStatus     : Fail");
            if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33
                    && ref[i].gethindi() < 33) {
                System.out.println("   \t\t   |\tFail in phycics,getchemistry(),mathes,Hindi");
            } else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33
                    && ref[i].getmath() < 33 & ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in phycics,chemistry,mathes,enlish");
            } else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33
                    && ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in phycics,mathes,hindi,enlish");
            } else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33
                    && ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in phycics,chemistry,hindi,enlish");
            } else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33
                    && ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in chemistry,mathes,hindi,enlish");
            }
        } else if ((ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33) ||
                (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) ||
                (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) ||
                (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) ||
                (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getenglish() < 33) ||
                (ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) ||
                (ref[i].getchemistry() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) ||
                (ref[i].getphysics() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) ||
                (ref[i].getenglish() < 33 && ref[i].getmath() < 33 && ref[i].getchemistry() < 33) ||
                (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].getenglish() < 33)) {
            System.out.println("   \t\t   |\tStatus     : Fail");
            if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33) {
                System.out.println("   \t\t   |\tFail in physics,chemistry,mathes");
            } else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) {
                System.out.println("   \t\t   |\tFail in physics,chemistry,Hindi");
            } else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) {
                System.out.println("   \t\t   |\tFail in physics,mathes,hindi");
            } else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) {
                System.out.println("   \t\t   |\tFail in chemistry,mathes,hindi");
            } else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in physics,chemistry,enlish");
            } else if (ref[i].getchemistry() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in chemistry,Hindi,enlish");
            } else if (ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in mathes,Hindi,enlish");
            } else if (ref[i].getphysics() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in physics,Hindi,english");
            } else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in chemistry,mathes,enlish");
            } else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in physics,mathes,enlish");
            }
        } else if ((ref[i].getphysics() < 33 && ref[i].getchemistry() < 33)
                || (ref[i].getphysics() < 33 && ref[i].getmath() < 33) ||
                (ref[i].getphysics() < 33 && ref[i].gethindi() < 33)
                || (ref[i].getphysics() < 33 && ref[i].getenglish() < 33) ||
                (ref[i].getchemistry() < 33 && ref[i].getmath() < 33)
                || (ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) ||
                (ref[i].getchemistry() < 33 && ref[i].getenglish() < 33)
                || (ref[i].getmath() < 33 && ref[i].getenglish() < 33) ||
                (ref[i].getmath() < 33 && ref[i].gethindi() < 33)
                || (ref[i].gethindi() < 33 && ref[i].getenglish() < 33)) {
            System.out.println("   \t\t   |\tStatus     : Supply in two Subject");
            if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33) {
                System.out.println("   \t\t   |\tFail in physics,chemistry");
            } else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33) {
                System.out.println("   \t\t   |\tFail in physics,getmath()es");
            } else if (ref[i].getphysics() < 33 && ref[i].gethindi() < 33) {
                System.out.println("   \t\t   |\tFail in physics,gethindi()");
            } else if (ref[i].getphysics() < 33 && ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in physics,english");
            } else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33) {
                System.out.println("   \t\t   |\tFail in chemistry,getmath()es");
            } else if (ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) {
                System.out.println("   \t\t   |\tFail in chemistry,Hindi");
            } else if (ref[i].getchemistry() < 33 && ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in chemistry,english");
            } else if (ref[i].getmath() < 33 && ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in Mathes,English");
            } else if (ref[i].getmath() < 33 && ref[i].gethindi() < 33) {
                System.out.println("   \t\t   |\tFail in Mathes,Hindi");
            } else if (ref[i].gethindi() < 33 && ref[i].getenglish() < 33) {
                System.out.println("   \t\t   |\tFail in Hindi,English");
            }
        } else if (ref[i].getphysics() < 33 || ref[i].getchemistry() < 33 || ref[i].getmath() < 33
                || ref[i].gethindi() < 33 || ref[i].getenglish() < 33) {
            System.out.println("   \t\t   |\tStatus     : Supply in a Subject");
            if (ref[i].getphysics() < 33) {
                System.out.println("   \t\t   |\tFail in physics");
            } else if (ref[i].getchemistry() < 33) {
                System.out.println("   \t\t   |\tFail in chemistry");
            } else if (ref[i].getmath() < 33) {
                System.out.println("   \t\t   |\tFail in mathes");
            } else if (ref[i].gethindi() < 33) {
                System.out.println("   \t\t   |\tFail in hindi");
            } else if (ref[i].getenglish() < 33) {
                System.out.println("   \t\t|\tFail in English");
            }
        } else {
            System.out.println("   \t\t   |\tPercentage : " + ref[i].getPer());
            if (ref[i].getPer() >= 60) {
                System.out.println("   \t\t   |\tStatuse    : Pass");
                System.out.println("   \t\t   |\tPass in first division");
            } else if (ref[i].getPer() >= 45) {
                System.out.println("   \t\t   |\tStatuse : Pass");
                System.out.println("   \t\t   |\tPass in Second division");
            } else {
                System.out.println("   \t\t   |\tStatuse : Pass");
                System.out.println("   \t\t   |\tPass in Third division");
            }
        }
    }

}