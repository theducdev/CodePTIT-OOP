class Assignment implements Comparable<Assignment> {

    public String studentID, subjectID;
    public Student student;
    public Subject subject;

    public Assignment(String msv, String subjectID) {
        this.studentID = msv;
        this.subjectID = subjectID;
    }

    @Override
    public int compareTo(Assignment other) {
        return subject.subjectName.compareTo(other.subject.subjectName);
    }

    @Override
    public String toString() {
        return student.toString() + " " + subject.toString();
    }
}