package ex6;

import java.util.Objects;

public class ex6 {
    private String name;

    public ex6(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ex6 ex6 = (ex6) o;
        if(o instanceof String){
            return name.equals(o);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
