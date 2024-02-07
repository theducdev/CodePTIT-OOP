import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Team {

    private String teamID;


    private String teamName;
    private String schoolName;
    public String getTeamName() {
        return teamName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setTeamID(int i) {
        this.teamID = String.format("team%02d", i);
    }

    public Team(String teamName, String schoolName) {
        this.teamName = teamName;
        this.schoolName = schoolName;
    }
    @Override
    public String toString() {
        return teamID + " " + teamName + " " + schoolName;
    }
}


public class Bai4_th3 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("INSTITUTION.in"));
        ArrayList<Team> teams = new ArrayList<>();
        HashMap <String, String> ten = new HashMap<>();
        int n = sc1.nextInt();
        sc1.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc1.nextLine().trim();
            String[] a = line.split(" ");
            String schoolName = "";
            for (int j = 1; j < a.length; j++) {
                schoolName+=a[j] + " ";
            }
            ten.put(a[0], schoolName);
        }

        Scanner sc2 = new Scanner(new File("REGISTER.in"));
        int k = sc2.nextInt();
        sc2.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc2.nextLine().trim();
            String[] a = line.split(" ");
            String schoolName = ten.get(a[0]);
            int sodoi = Integer.parseInt(a[1]);
            for (int j = 0; j < sodoi; j++) {
                String teamName = sc2.nextLine();
                teams.add(new Team(teamName, schoolName));
            }
        }
        Collections.sort(teams, new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                if (o1.getSchoolName().equals(o2.getSchoolName())) {
                    return o1.getTeamName().compareTo(o2.getTeamName());
                }
                return o1.getSchoolName().compareTo(o2.getSchoolName());
            }
        });
        for (int i = 0; i < teams.size(); i++) {
            teams.get(i).setTeamID(i+1);
            System.out.println(teams.get(i));
        }



    }
}
