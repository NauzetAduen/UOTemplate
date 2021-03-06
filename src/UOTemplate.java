
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UOTemplate {

    private String name;
    public ArrayList<String> skills = new ArrayList<>();
    private int inteligence;
    private int strengh;
    private int dexterity;

    public UOTemplate(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            name = br.readLine();
            inteligence = Integer.valueOf(br.readLine());
            strengh = Integer.valueOf(br.readLine());
            dexterity = Integer.valueOf(br.readLine());
            for (int i = 0; i <7; i++) {
                skills.add(br.readLine());
            }
            
        } finally {
            br.close();
        }
    }

    public UOTemplate(String name, int inteligence, int strengh, int dexterity, ArrayList<String> skills) {
        this.name = name;
        this.inteligence = inteligence;
        this.strengh = strengh;
        this.dexterity = dexterity;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "UOTemplate{" + "name=" + name + ", skills=" + skills + ", inteligence=" + inteligence + ", strengh=" + strengh + ", dexterity=" + dexterity + '}';
    }
    
    
    public String getName() {
        return name;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public int getInteligence() {
        return inteligence;
    }

    public int getStrengh() {
        return strengh;
    }

    public int getDexterity() {
        return dexterity;
    }

}

