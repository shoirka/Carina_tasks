package VolunteersGenerator;

import java.time.LocalDate;
import java.util.*;

public class VolunteersGenerator {
    public static void main(String[] args) {
        String[] names = {
                "Esma Ozyildirim", "Konstantin Pashkov", "Aliy Shegidevich", "Sucharita Chakraborty", "Marat Aksiev", "Mariya Kiritchenko", "Julia Linkola", "Ara Ghonyan", "Olena Sidlovych", "Ekaterina Bryzgalina", "Busra Turan", "Maryna Kamenna", "Shoira Barotova", "Oleh Kochetkov"};

        // Add who was selected previous weeks
        List<String> selectedPreviousWeeks = new ArrayList<>(Arrays.asList(
                "Ekaterina Bryzgalina","Aliy Shegidevich","Sucharita Chakraborty"
                ));
        System.out.println("selectedPreviousWeeks = " + selectedPreviousWeeks);

        // Add who is absent today
        List<String> absentToday = new ArrayList<>(
                Arrays.asList()
        );
        System.out.println("absentToday_notReady = " + absentToday);
        absentToday.removeIf(p->selectedPreviousWeeks.contains(p));

        // Add week task number
        int weekNumber=2;



        String[] selectedToday = new String[3];
        Random rand = new Random();
        int start = 0;
        while (start < selectedToday.length && selectedToday[start] == null && (selectedPreviousWeeks.size() + absentToday.size()) < names.length) {
            int pick = rand.nextInt(names.length);
            if (!selectedPreviousWeeks.contains(names[pick]) && !absentToday.contains(names[pick])) {
                selectedToday[start++] = names[pick];
                selectedPreviousWeeks.add(names[pick]);
            }
        }
        System.out.println();
        System.out.println("Selected Today:");
        try {
            for (int i = 0; i < selectedToday.length; i++) {
                if (selectedToday[i]==null){
                    System.err.println("All other people was selected at least one time we need to update our data!");
                    System.exit(1);
                }
                System.out.println("\t"+ClassScanner.getClassesFromPackage("week_"+weekNumber).get(i)+" --> "+selectedToday[i]);
            }
        }catch (IndexOutOfBoundsException e){
            System.err.println("Week name do not exist!");
        }

    }
}