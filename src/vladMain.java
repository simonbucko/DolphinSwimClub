public class vladMain {
    public static void main(String[] args) {
        Coach c = new Coach();
        EliteSwimmer es1 = new EliteSwimmer(0, "stroke", "vlad", "kokot", "9080394", "asas", 23);
        EliteSwimmer es2 = new EliteSwimmer(1, "stroke", "vlad", "kokot", "9080394", "asas", 23);
        EliteSwimmer es3 = new EliteSwimmer(2, "stroke", "vlad", "kokot", "9080394", "asas", 23);
        c.students.add(es1);
        c.students.add(es2);
        c.students.add(es3);
        c.displayStudents();
    }
}

