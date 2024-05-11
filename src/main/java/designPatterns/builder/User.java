package designPatterns.builder;

public class User {

    private final int id;
    private final String name;
    private final String address;

    private User(UserBuilder userBuilder) {
        /*Deep Cloning*/
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.address = userBuilder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    static class UserBuilder {
        private int id;
        private String name;
        private String address;


        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        User build(UserBuilder userBuilder) {
            return new User(userBuilder);
        }
    }
}

class BPT {
    public static void main(String[] args) {
        User.UserBuilder userBuilder = new User.UserBuilder().
                setAddress("Address").setName("name").setId(123);
        User user = userBuilder.build(userBuilder);
        System.out.println(user);
    }
}
