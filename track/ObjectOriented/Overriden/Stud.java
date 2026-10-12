
class Stud {

    int rollno;
    String name;

    @Override
    public boolean equals(Object obj) {
        Stud s = (Stud) obj;

        if (this.rollno == s.rollno && this.name.equals(s.name)) {
            return true;
        } else {
            return false;
        }
    }

    Stud(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno);
        System.out.println(name);;
    }
}
