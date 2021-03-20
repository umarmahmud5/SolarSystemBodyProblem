package solarsystembodyproblem;

/**
 *
 * @author Umar Mahmud XX-III-MMXXI
 */
public class SolarSystemBodyProblem {

    private SolarSystemData sSD;
    private static double G;

    public SolarSystemBodyProblem() {
        G = 6.674 * Math.pow(10, -11);
        sSD = new SolarSystemData();
        calculateForces();
    }

    private void calculateForces() {
        double temp;
        for (int i = 0; i < sSD.names.length; i++) {
            for (int j = 0; j < sSD.names.length; j++) {
                if (i <= j) {              
                } else {
                    temp = calculateF(sSD.masses[i], sSD.masses[j], sSD.distances[j][i]);
                    System.out.println("The Force between "+sSD.names[i]+" and "+sSD.names[j]+" is: "+temp);
                }
            }
        }
    }

    private double calculateF(double mass1, double mass2, double dist) {
        double force;
        force = (G * mass1 * mass2) / (dist * dist);
        return force;
    }

    public static void main(String[] args) {
        SolarSystemBodyProblem sSBP = new SolarSystemBodyProblem();
    }

}
