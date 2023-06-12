package designPatterns.builder;

public class User {

    private final int id;
    private final String name;
    private final String address;

    private User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.address = userBuilder.address;
    }


    static class UserBuilder {
        private int id;
        private String name;
        private String address;


        static UserBuilder getInstance() {
            return new UserBuilder();
        }

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
        User.UserBuilder instance = new User.UserBuilder();
        User.UserBuilder builder = instance.setAddress("skms")
                .setName("").setId(1);
        User skms = instance.build(builder);

    }
}
