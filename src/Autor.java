import java.util.Objects;

public class Autor {
    private String autorName;
    private String autorSirname;

    public Autor(String autorName, String autorSirname){
        this.autorName = autorName;
        this.autorSirname = autorSirname;
    }

    public String getAutorName() {
        return autorName;
    }

    public String getAutorSirname() {
        return autorSirname;
    }

    @Override
    public String toString() {
        return "Author: " + autorName + ' ' + autorSirname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return autorName.equals(autor.autorName) && autorSirname.equals(autor.autorSirname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autorName, autorSirname);
    }
}
