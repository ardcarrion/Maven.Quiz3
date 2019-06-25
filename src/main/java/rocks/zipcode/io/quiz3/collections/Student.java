package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> labs;
    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        if (labs != null) {
            for (Lab lab : labs) {
                if (lab != null && lab.getName().equals(labName)) return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) throws UnsupportedOperationException {
        if (getLab(labName) == null) throw new UnsupportedOperationException();
        getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = labs.size()-1; i >= 0; i--) {
            Lab lab = labs.get(i);
            sb.append(lab.getName()).append(" > ")
                    .append(lab.getStatus().toString()).append("\n");
        }
        return sb.toString().trim();
    }
}
