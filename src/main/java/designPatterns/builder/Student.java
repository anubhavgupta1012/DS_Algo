package designPatterns.builder;

public class Student {
    public int id;
    public String name;
    public String address;

    public Student(StudentBuilder sb) {
        this.name = sb.name;
        this.address = sb.address;
        this.id = sb.id;
        this.address = sb.address;
    }


    static class StudentBuilder {
        private int id;
        private String name;
        private String address;


        public Student build() {
            return new Student(this);
        }

        public int getId() {
            return id;
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }
}

class mainTest {
    public static void main(String[] args) {
        Student build = Student.getBuilder()
                .setAddress("deoria")
                .setName("DHEERAJ")
                .setId(1234).build();

        System.out.println("skmss");

    }
}