class Student {

    public String ID, name, phoneNumber, email;

    public Student(String msv, String name, String phoneNumber, String email) {
        this.ID = msv;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + phoneNumber + " " + email;
    }
}