package creational.builder;

public class Subject {
    private String name;
    private int age;

    public Subject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder name(String value) {
            name = value;
            return this;
        }

        public Builder age(int value) {
            age = value;
            return this;
        }

        public Subject build() {
            return new Subject(name, age);
        }
    }
}
