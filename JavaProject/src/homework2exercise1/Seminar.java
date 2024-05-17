package homework2exercise1;

import java.util.ArrayList;
import java.util.List;

public class Seminar {
    private String name;
    private String id;
    private List<IStudent> participants;

    //TODO: List of participants

    public Seminar(String name, String id) {
        this.name = name;
        this.id = id;
        //TODO: Initialize list of participants
        this.participants = new ArrayList<>();
    }

    public <E extends IStudent> void addParticipant(E participant) {
        //TODO: Add to list of participants
        participants.add(participant);
    }

    public void addParticipants(List<? extends IStudent> newParticipants) {
        for(IStudent participant : newParticipants) {
            if (!participants.contains(participant)) {
                participants.add(participant);
            }
        }
    }

    public List<IStudent> getParticipants() {
        return participants;
    }

    public List<IStudent> getParticipantsFromStudyProgram(String studyProgram) {
        List<IStudent> filteredList;
        List<IStudent> originalList = this.getParticipants();

        filteredList = originalList.stream().filter(participant -> participant.getSubject().equals(studyProgram)).toList();

        return filteredList;
    }


    public static void main(String[] args) {
        Seminar phdStudents = new Seminar("Doktorandenseminar", "");
        phdStudents.addParticipant(new PhD("Adrian", "Software Engineering"));
        phdStudents.addParticipant(new PhD("Alice", "Software Engineering"));
        phdStudents.addParticipant(new PhD("Bob", "Algorithmics"));
        phdStudents.addParticipant(new PhD("Charly", "Visual Analytics"));
        phdStudents.addParticipant(new Student("Zedrick", "Software Engineering"));

        Seminar bachelorStudents = new Seminar("Seminar Software Engineering", "SSE");
        bachelorStudents.addParticipant(new Student("Zedrick", "Wirtschaftsinformatik"));
        bachelorStudents.addParticipant(new Student("Yvonne", "Wirtschaftsinformatik"));
        bachelorStudents.addParticipant(new Student("Wladislav", "Mathematik"));
        bachelorStudents.addParticipant(new Student("Xenia", "Informatik"));
        bachelorStudents.addParticipant(new Student("Udo", "Informatik"));
        bachelorStudents.addParticipant(new PhD("Adrian", "Informatik"));
        bachelorStudents.addParticipants(phdStudents.getParticipants());


        System.out.println(phdStudents.getParticipantsFromStudyProgram("Software Engineering"));
        System.out.println();
        System.out.println(phdStudents.getParticipantsFromStudyProgram("Algorithmics"));
        System.out.println();
        System.out.println(phdStudents.getParticipantsFromStudyProgram("Visual Analytics"));
        System.out.println();

        System.out.println(bachelorStudents.getParticipantsFromStudyProgram("Wirtschaftsinformatik"));
        System.out.println();
        System.out.println(bachelorStudents.getParticipantsFromStudyProgram("Mathematik"));
        System.out.println();
        System.out.println(bachelorStudents.getParticipantsFromStudyProgram("Informatik"));
        System.out.println();
        System.out.println(bachelorStudents.getParticipantsFromStudyProgram("Software Engineering"));
        System.out.println();
    }
}
