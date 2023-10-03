package compositon;

import java.util.List;

public class Kitabxana {

    private List<Kitab> kitabList;

    public Kitabxana(List<Kitab> kitabList) {
        this.kitabList = kitabList;
    }

    public List<Kitab> kitabXanadakiButunKitablar() {
        return kitabList;
    }
}
