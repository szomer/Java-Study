package collections.set;

import java.util.EnumSet;
import java.util.Set;

class EnumSets {
    // Set with enum

    public static void main(String[] args){
        // Create Set of enum
        Set<WeekDays> enumSet;

        // Add elements to the Set
        enumSet = EnumSet.of(WeekDays.MONDAY, WeekDays.TUESDAY, WeekDays.WEDNESDAY,
                WeekDays.THURSDAY, WeekDays.FRIDAY, WeekDays.SATURDAY, WeekDays.SUNDAY);

        // Print the enum Set
        System.out.println("\nEnum Set: " + enumSet);
    }

    // Enum Class
    enum WeekDays{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}

