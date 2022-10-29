package main.java.pojo;

import pojo.ENUMS.Country;
import pojo.ENUMS.EducationDegree;

import java.util.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GroupApplicants {
    private static final Random RANDOM = new Random();
    private static ArrayList<String> namesList;

    private static final Country[] COUNTRIES = Country.values();
    private static final int COUNT_OF_COUNTRIES = COUNTRIES.length;
    public static final EducationDegree[] EDUCATION_DEGREES = EducationDegree.values();
    public static final String[] NAME_DEGREES = Arrays.stream(EducationDegree.values()).map(Enum::name).toArray(String[]::new);

    public static final int COUNT_OF_DEGREES = EDUCATION_DEGREES.length;
    public Map<Integer,String> EDUCATION_MAP = new TreeMap<>();


    public static List<Applicant> applicantList;



    public GroupApplicants(int countOfGroup) {
        createNamesList();
        //create map of education degrees with rang on keys
        for (int i = 0; i < COUNT_OF_DEGREES; i++) {
            EDUCATION_MAP.put(i+1, EDUCATION_DEGREES[i].toString()); //{1=ASSOCIATE, 2=BACHELOR, 3=MASTER, 4=PHD, 5=DOCTORAL, 6=PROFESSOR}
        }
        ArrayList<Applicant> applicantList = new ArrayList<>();
        for (int i = 0; i < countOfGroup; i++) {
            applicantList.add(new Applicant(namesList.get(new Random().nextInt(namesList.size())),
                    new Random().nextInt(120),
                    COUNTRIES[RANDOM.nextInt(COUNT_OF_COUNTRIES)].toString(),
                    RANDOM.nextInt(500)*1000,
                    EDUCATION_DEGREES[RANDOM.nextInt(COUNT_OF_DEGREES)].toString()));
        }
        this.applicantList = applicantList;
    }

    public List<Applicant> sortByName(){
        applicantList.sort(Comparator.comparing(Applicant::getName));
        return applicantList;
    }

    public List<Applicant> sortByCountry(){
        applicantList.sort(Comparator.comparing(Applicant::getCountry));
        return applicantList;
    }


    public List<Applicant> sortBySalary(){
        applicantList.sort(Comparator.comparing(Applicant::getSalary));
        return applicantList;
    }

    public List<Applicant> sortByEducationDegree(){
        Collections.sort(applicantList, new ComparatorEducationDegress());
        return applicantList;
    }

    public List<Applicant> sortByAge(){
        applicantList.sort(Comparator.comparing(Applicant::getAge));
        return applicantList;
    }

    private void createNamesList(){
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Liam");
        namesList.add("Noah");
        namesList.add("Oliver");
        namesList.add("Elijah");
        namesList.add("James");
        namesList.add("William");
        namesList.add("Benjamin");
        namesList.add("Lucas");
        namesList.add("Henry");
        namesList.add("Theodore");
        namesList.add("Emma");
        namesList.add("Charlotte");
        namesList.add("Amelia");
        namesList.add("Ava");
        namesList.add("Sophia");
        namesList.add("Isabella");
        namesList.add("Evelyn");
        namesList.add("Mia");
        namesList.add("Harper");
        namesList.add("Olivia");
        GroupApplicants.namesList = namesList;
    }

    /*
    // MULTI-USE Sorting:
    public Map<E,Applicant> sortBy (Object E, ArrayList<Applicant> applicantList){
        return sortedMap;
    }*/

}
