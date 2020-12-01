public abstract class Person {
    private String name;
    private String email;
    private String phone;
    private int age;
    private String surname;

    public Person(String name, String surname, String phone, String email, int age) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }
}
