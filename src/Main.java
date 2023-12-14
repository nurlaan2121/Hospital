import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Срочный потциентерди негизи алдын ала скорый да же башка отделение менен башка региондордон кабар берет ошол поциет туураалу ошол убакта аны ушул жерге кошот АЙДИсин
        LinkedList<Long> srochpotsient = new LinkedList<>();
        srochpotsient.add(4851478L);
        srochpotsient.add(2342342L);
        srochpotsient.add(34222432L);



        Pasport pasport = new Pasport("Nurlan", "Abiibillaev", LocalDate.of(2000, 5, 7), 78978456L, Gender.FEMALE);
        Pasport pasport2 = new Pasport("Aysha", "Asanbaeva", LocalDate.of(1965, 5, 7), 78423456L, Gender.FEMALE);
        Pasport pasport3 = new Pasport("Kasym", "Nurikov", LocalDate.of(2001, 5, 7), 789782346L, Gender.MALE);
        Pasport pasport4 = new Pasport("Nurlan", "Ermekov", LocalDate.of(2001, 5, 7), 723478456L, Gender.MALE);
        Pasport pasport5 = new Pasport("Kyaz", "Eldiarov", LocalDate.of(1995, 5, 7), 4851478L, Gender.MALE);
        Pasport pasport6 = new Pasport("Ermek", "Aasnaliev", LocalDate.of(1975, 5, 7), 42328456L, Gender.MALE);
        Pasport pasport7 = new Pasport("Eleman", "Minkyalov", LocalDate.of(1965, 5, 7), 7823456L, Gender.MALE);
     Pasport pasport8 = new Pasport("Nurlan", "Ermekov", LocalDate.of(1944, 5, 7), 7234782456L, Gender.FEMALE);
        Pasport pasport9 = new Pasport("Kyaz", "Eldiarov", LocalDate.of(1921, 5, 7), 48514728L, Gender.MALE);
        Pasport pasport10 = new Pasport("Ermek", "Aasnaliev", LocalDate.of(2005, 5, 7), 423282456L, Gender.FEMALE);
        Pasport pasport11 = new Pasport("Eleman", "Minkyalov", LocalDate.of(2004, 5, 7), 34222432L, Gender.MALE);
        LinkedList<Pasport> allPasports = new LinkedList<>(List.of(pasport, pasport2, pasport3, pasport4, pasport5, pasport6, pasport7,pasport8,pasport9,pasport10,pasport11));
        Map<String, Hospital> allcheks = new HashMap<>();
        for (Pasport dd :
                allPasports) {
            if (!srochpotsient.contains(dd.getID())) {
                if (dd.getGender().name().equalsIgnoreCase("MALE") && ZonedDateTime.now().getYear() - dd.getTuulanganKun().getYear() <= 50) {
                    Hospital hospital = new Hospital(dd, Status.JASH);
                    allcheks.put(generatorOchered(hospital), hospital);
                } else if (dd.getGender().name().equalsIgnoreCase("MALE") || dd.getGender().name().equalsIgnoreCase("FEMALE") && ZonedDateTime.now().getYear() - dd.getTuulanganKun().getYear() >= 50) {
                    Hospital hospital2 = new Hospital(dd, Status.CHONDOR);
                    allcheks.put(generatorOchered(hospital2), hospital2);
                } else if (dd.getGender().name().equalsIgnoreCase("FEMALE") && ZonedDateTime.now().getYear() - dd.getTuulanganKun().getYear() <= 50 && ZonedDateTime.now().getYear() - dd.getTuulanganKun().getYear() >= 20) {
                    Hospital hospital3 = new Hospital(dd, Status.KOSHBOILUU);
                    allcheks.put(generatorOchered(hospital3), hospital3);
                }
            } else {
                Hospital hospital4 = new Hospital(dd, Status.SROCHNA);
                allcheks.put(generatorOchered(hospital4), hospital4);
            }
        }

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
//        for (String tt:
//                allcheks.keySet()) {
//            priorityQueue.add(tt);
//        }
//        System.out.println(priorityQueue);
        Set<String> treeset = new TreeSet<>();
        for (String ee:
             allcheks.keySet()) {
            treeset.add(ee);
        }
        System.out.println("treeset = " + treeset);
    }

    public static String generatorOchered(Hospital hospital) {
        String jashtarga = "GH";
        String chondorgo = "EF";
        String koshboiluu = "CD";
        String crochna = "AB";
        if (hospital.getStatus().name().equalsIgnoreCase("SROCHNA")) {
            return crochna + Counter.generatorSrochna();
        } else if (hospital.getStatus().name().equalsIgnoreCase("KOSHBOILUU")) {
            return koshboiluu + Counter.generatorKoshboiluu();
        } else if (hospital.getStatus().name().equalsIgnoreCase("CHONDOR")) {
            return chondorgo + Counter.generatorChon();
        }
        return jashtarga + Counter.generatorJash();
    }
}