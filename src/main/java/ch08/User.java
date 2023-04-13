package ch08;

class User {
    String userName;
    int userAge;
    String gender;
    int height;
    int weight;

    public User() {}
    public User(String userName, int userAge, String gender, int height, int weight) {
        this.userName = userName;
        this.userAge = userAge;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public static void main(String[] args) {
        User user = new User("Tomas", 37, "남성", 180, 78);
    }
}
