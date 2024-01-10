package lesson_33.homework.task_1;

public class User {
    private final String username;
    private final String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', email='" + email + "'}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        User other = (User) obj;
        if (email == null) {
            if (other.email != null)
                return false;

        } else if (!email.equals(other.email))
            return false;

        if (username == null) {
            return other.username == null;
        } else return username.equals(other.username);
    }
}

