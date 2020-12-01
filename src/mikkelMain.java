import java.io.IOException;

public class mikkelMain {
    public static void main(String[] args) {
        File_S fs = null;
        try {
            fs = new File_S();
            fs.loadData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        fs.printAllData();
    }
}
