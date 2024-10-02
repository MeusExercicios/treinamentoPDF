package pdfTreino;

public class Pessoa {
    private String name;
    private String number;

    public Pessoa(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
