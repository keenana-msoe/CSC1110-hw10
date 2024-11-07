/*
 * Course: CSC 1110 131
 * Term: Fall 2023
 * Assignment: HW 10
 * Name: Andrew Keenan
 * Created: 11-1-23
 */
package src.keenana;

public enum Color {
    RESET("\u001B[0m"), BLACK("\u001B[30m"), RED("\u001B[31m"),
    GREEN("\u001B[32m"), YELLOW("\u001B[33m"), BLUE("\u001B[34m"),
    MAGENTA("\u001B[35m"), CYAN("\u001B[36m"), WHITE("\u001B[37m");
    String color;
    Color(final String color){
        this.color = color;
    }

    /**
     *returns the string of the color
     * @return the string code for the color
     */
    public String toString(){
        return this.color;
    }
}
