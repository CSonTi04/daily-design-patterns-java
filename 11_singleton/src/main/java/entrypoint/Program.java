package entrypoint;


import model.TheBell;

public class Program {
    public static void main(String[] args) {
        var bell = TheBell.getInstance();
        bell.ring();
    }
}
