package Lab1.Task3;

import Lab1.Task1.Display;
import java.util.ArrayList;
import java.util.List;

public class Assistant {
    private final String assistantName;
    private List<Display> assignedDisplays;

    public Assistant(String assistantName) {
        this.assistantName = assistantName;
        assignedDisplays = new ArrayList<>();
    }
    public void assignDisplay(Display d) {
        assignedDisplays.add(d);
    }
    public void assist(){
        for (int i = 0; i < assignedDisplays.size(); i++) {
            for(int j = i + 1; j<assignedDisplays.size(); j++) {
                Display current = assignedDisplays.get(i);
                Display next = assignedDisplays.get(j);
                current.compareWithMonitor(next);
            }
        }
    }
    public Display buyDisplay(Display d){
        if(assignedDisplays.remove(d)){
            return d;
        }
        return null;
    }
    public List<Display> getAssignedDisplays() {
        return assignedDisplays;
    }
}
