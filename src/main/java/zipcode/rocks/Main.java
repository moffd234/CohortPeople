package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Finished Lab
public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "FakeData.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        List listOfStudents = programObject.handWrittenLoadOfData();

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
        Person newPerson = new Person(values[0], values[1]);
        return newPerson;
    }

    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

        // Ali
        Person aliB = new Person("Ali", "Bangash");
        aliB.setColor("green");
        aliB.setBirthMonth("March");
        aliB.setGithub("ali-b14");
        aliB.setHasPets(false);
        students.add(aliB);

        // Trey
        Person treyB = new Person("Trey", "Bruton");
        treyB.setColor("Orange");
        treyB.setBirthMonth("February");
        treyB.setGithub("tb0902_");
        treyB.setHasPets(true);
        students.add(treyB);

        // Chaz
        Person chazA = new Person("Chaz", "Adams");
        chazA.setColor("Blue");
        chazA.setBirthMonth("February");
        chazA.setGithub("chaz_adamz");
        chazA.setHasPets(true);
        students.add(chazA);

        // Matt - NEED GITHUB
        Person mattK = new Person("Matt", "Kramer");
        mattK.setColor("Green");
        mattK.setBirthMonth("January");
        mattK.setGithub(""); // NEED GITHUB
        mattK.setHasPets(true);
        students.add(mattK);

        // Dan
        Person danielM = new Person("Daniel", "Moffett");
        danielM.setColor("Blue");
        danielM.setBirthMonth("June");
        danielM.setGithub("moffd234");
        danielM.setHasPets(true);
        students.add(danielM);

        // Danny
        Person dannyC = new Person("Danny", "Cao");
        dannyC.setColor("Blue");
        dannyC.setBirthMonth("September");
        dannyC.setGithub("dannycao1997");
        dannyC.setHasPets(false);
        students.add(dannyC);

        // Shijin
        Person shijinZ = new Person("Shijin", "Zeng");
        shijinZ.setColor("Yellow");
        shijinZ.setBirthMonth("July");
        shijinZ.setGithub("Szeng89");
        shijinZ.setHasPets(false);
        students.add(shijinZ);

        // Asan
        Person asanA = new Person("Asan", "Ahmadli");
        asanA.setColor("Dark Blue");
        asanA.setBirthMonth("December");
        asanA.setGithub("asanahamdli");
        asanA.setHasPets(false);
        students.add(asanA);

        // Shaily Modi
        Person shailyM = new Person("Shaily", "Modi");
        shailyM.setColor("Purple");
        shailyM.setBirthMonth("January");
        shailyM.setGithub("ShailyGH");
        shailyM.setHasPets(false);
        students.add(shailyM);

        // Michael Scott
        Person michaelS = new Person("Michael", "Scott");
        michaelS.setColor("Orange");
        michaelS.setBirthMonth("May");
        michaelS.setGithub("MichaelScott44");
        michaelS.setHasPets(true);
        students.add(michaelS);

        // Anthony
        Person anthonyP = new Person("Anthony", "Pearson");
        anthonyP.setColor("Red");
        anthonyP.setBirthMonth("July");
        anthonyP.setGithub("AnthonyP365");
        anthonyP.setHasPets(true);
        students.add(anthonyP);

        // Jacob
        Person jakeB = new Person("Jake", "Brennan");
        jakeB.setColor("Purple");
        jakeB.setBirthMonth("April");
        jakeB.setGithub("Jacob-Brennan714");
        jakeB.setHasPets(true);
        students.add(jakeB);

        // Andy Zheng
        Person andyZ = new Person("Andy", "Zheng");
        andyZ.setColor("Red");
        andyZ.setBirthMonth("December");
        andyZ.setGithub("andyzheng679");
        andyZ.setHasPets(false);
        students.add(andyZ);

        // Asia
        Person asiaB = new Person("Asia", "Burton");
        asiaB.setColor("Pink");
        asiaB.setBirthMonth("March");
        asiaB.setGithub("asiaburton");
        asiaB.setHasPets(true);
        students.add(asiaB);

        // Angelina
        Person angelinaM = new Person("Angelina", "Mathew");
        angelinaM.setColor("Dark Blue");
        angelinaM.setBirthMonth("May");
        angelinaM.setGithub("angelinamathew");
        angelinaM.setHasPets(false);
        students.add(angelinaM);

        // Abukar
        Person abukarA = new Person("Abukar", "Abukar");
        abukarA.setColor("Yellow");
        abukarA.setBirthMonth("April");
        abukarA.setGithub("abukarabukar");
        abukarA.setHasPets(true);
        students.add(abukarA);

        // Jorris
        Person jorrisE = new Person("Jorris", "Ekoloko");
        jorrisE.setColor("Black");
        jorrisE.setBirthMonth("August");
        jorrisE.setGithub("Reeseyverse");
        jorrisE.setHasPets(false);
        students.add(jorrisE);

        // Lavanya
        Person lavanyaP = new Person("Lavanya", "Palanikumar");
        lavanyaP.setColor("Blue");
        lavanyaP.setBirthMonth("October");
        lavanyaP.setGithub("lavanyapalankumar93");
        lavanyaP.setHasPets(false);
        students.add(lavanyaP);

        // Jenn
        Person jennA = new Person("Jenn", "Azer");
        jennA.setColor("Purple");
        jennA.setBirthMonth("November");
        jennA.setGithub("cupofjavajenny");
        jennA.setHasPets(true);
        students.add(jennA);

        // Nathan
        Person nathanE = new Person("Nathan", "Eckel");
        nathanE.setColor("Green");
        nathanE.setBirthMonth("Feburary");
        nathanE.setGithub("nathaneckel");
        nathanE.setHasPets(true);
        students.add(nathanE);

        // Alice
        Person aliceG = new Person("Alice", "Gonzalez Plaza");
        aliceG.setColor("Dark");
        aliceG.setBirthMonth("May");
        aliceG.setGithub("AliceGonzalez");
        aliceG.setHasPets(true);
        students.add(aliceG);

        // Deepa - NEED GITHUB
        Person deepaK = new Person("Deepa", "Kakade");
        deepaK.setColor("Pink");
        deepaK.setBirthMonth("June");
        deepaK.setGithub("");  // NEED GITHUB
        deepaK.setHasPets(false);
        students.add(deepaK);

        // Mariyana
        Person mariyanaK = new Person("Mariyana", "Katzarova");
        mariyanaK.setColor("Green");
        mariyanaK.setBirthMonth("December");
        mariyanaK.setGithub("mariyana-katz");
        mariyanaK.setHasPets(true);
        students.add(mariyanaK);

        // Lydia
        Person lydiaK = new Person("Lydia", "Konstanski");
        lydiaK.setColor("Mushroom");
        lydiaK.setBirthMonth("October");
        lydiaK.setGithub("lydiastonekonstanski");
        lydiaK.setHasPets(true);
        students.add(lydiaK);

        // Chris
        Person chrisM = new Person("Chris", "McCall");
        chrisM.setColor("Blue");
        chrisM.setBirthMonth("May");
        chrisM.setGithub("christopher_mccall");
        chrisM.setHasPets(false);
        students.add(chrisM);

        // Nick
        Person nickM = new Person("Nick", "McNamara");
        nickM.setColor("Green");
        nickM.setBirthMonth("January");
        nickM.setGithub("nicholasmacnamara");
        nickM.setHasPets(true);
        students.add(nickM);

        // Ethan
        Person ethanR = new Person("Ethan", "Rieger");
        ethanR.setColor("Blue");
        ethanR.setBirthMonth("May");
        ethanR.setGithub("erieger11");
        ethanR.setHasPets(true);
        students.add(ethanR);

        // Jorden
        Person jordenR = new Person("Jorden", "Ross");
        jordenR.setColor("Green");
        jordenR.setBirthMonth("December");
        jordenR.setGithub("jross911");
        jordenR.setHasPets(false);
        students.add(jordenR);

        // Diksha
        Person dikshaS = new Person("Diksha", "Sharma");
        dikshaS.setColor("Blue");
        dikshaS.setBirthMonth("March");
        dikshaS.setGithub("dikshasharmaa");
        dikshaS.setHasPets(false);
        students.add(dikshaS);

        // and so on for EACH person in the cohort.
        return students;
    }

}
