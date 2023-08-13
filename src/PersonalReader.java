import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonalReader {

    private BufferedReader reader;
    private String input;
    public PersonalReader(BufferedReader reader, String input){
        this.reader=reader;
        this.input=input;
    }

    public BufferedReader getReader() {
        return reader;
    }

    public void setReader(BufferedReader reader) {
        this.reader = reader;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String read() throws IOException {
        input=reader.readLine();
//        System.out.println(input.toString());
        return input;
    }

    @Override
    public String toString() {
        return "PersonalReader{" +
                "reader=" + reader +
                ", input='" + input + '\'' +
                '}';
    }
}
