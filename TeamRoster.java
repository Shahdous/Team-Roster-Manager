/**
 * @author Shahdous Zaman Khan Prohor
 */
public class TeamRoster {
    private String[] teamMembers;

    public TeamRoster(String[] names) {
        // Copying names into teamMembers
        teamMembers = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            teamMembers[i] = names[i];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TeamRoster[");
        for (int i = 0; i < teamMembers.length; i++) {
            sb.append(teamMembers[i]);
            if (i < teamMembers.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean isOnTeam(String name) {
        for (String teamMember : teamMembers) {
            if (teamMember.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public String getPlayer(int index) {
        if (index >= 0 && index < teamMembers.length) {
            return teamMembers[index];
        }
        return null;
    }

    public boolean replacePlayer(String name, int index) {
        if (index >= 0 && index < teamMembers.length) {
            teamMembers[index] = name;
            return true;
        }
        return false;
    }
}
