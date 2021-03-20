package solarsystembodyproblem;

/**
 *
 * @author Umar Mahmud
 * XX-III-MMXXI
 */
public class SolarSystemData{
    protected double[] masses;          //in yottagrams 10^21 g
    protected double[][] distances;     //in Mm 10^6 m
    protected String[] names;                 //names of bodies
    
    public SolarSystemData(){
        masses = new double[9];
        distances = new double[9][9];
        names = new String[9];
        populateMasses();
        populateDistances();
        populateNames();
    }
    private void populateNames(){
        names[0] = "Sun";
        names[1] = "Mercury";
        names[2] = "Venus";
        names[3] = "Earth";
        names[4] = "Mars";
        names[5] = "Jupiter";
        names[6] = "Saturn";
        names[7] = "Uranus";
        names[8] = "Neptune";
    }
    private void populateDistances(){
        distances[0][0] = 0;            //Sun to Sun
        distances[0][1] = 57900;        //Mercury to Sun
        distances[0][2] = 108200;       //Venus to VSun
        distances[0][3] = 149600;       //Earth to Sun
        distances[0][4] = 227900;       //Mars to Sun 
        distances[0][5] = 778300;       //Jupiter to Sun
        distances[0][6] = 1427000;      //Saturn to Sun
        distances[0][7] = 2871000;      //Uranus to Sun
        distances[0][8] = 4497100;      //Neptune to Sun
        distances[1][1] = 0;            //Mercury to Mercury
        distances[1][2] = 50290;        //Venus to Mercury
        distances[1][3] = 91691;        //Earth to Mercury
        distances[1][4] = 170030;       //Mars to Mercury
        distances[1][5] = 720420;       //Jupiter to Mercury
        distances[1][6] = 1366690;      //Saturn to Mercury
        distances[1][7] = 2815640;      //Uranus to Mercury
        distances[1][8] = 4443090;      //Neptune to Mercury
        distances[2][2] = 0;            //Venus to Venus
        distances[2][3] = 41400;        //Earth to Venus
        distances[2][4] = 119740;       //Mars to Venus
        distances[2][5] = 670130;       //Jupiter to Venus
        distances[2][6] = 1316400;      //Saturn to Venus
        distances[2][7] = 2765350;      //Uranus to Venus
        distances[2][8] = 4392800;      //Neptune to Venus
        distances[3][3] = 0;            //Earth to Earth
        distances[3][4] = 78340;        //Mars to Earth
        distances[3][5] = 628730;       //Jupiter to Earth
        distances[3][6] = 1275000;      //Saturn to Earth
        distances[3][7] = 2723950;      //Uranus to Earth
        distances[3][8] = 4351400;      //Neptune to Earth
        distances[4][4] = 0;            //Mars to Mars
        distances[4][5] = 550390;       //Jupiter to Mars
        distances[4][6] = 1196660;      //Saturn to Mars
        distances[4][7] = 2645610;      //Uranus to Mars
        distances[4][8] = 4273060;      //Neptune to Mars
        distances[5][5] = 0;            //Jupiter to Jupiter
        distances[5][6] = 646270;       //Saturn to Jupiter
        distances[5][7] = 2095220;      //Uranus to Jupiter
        distances[5][8] = 3722670;      //Neptune to Jupiter
        distances[6][6] = 0;            //Saturn to Saturn
        distances[6][7] = 1448950;      //Uranus to Saturn
        distances[6][8] = 3076400;      //Neptune to Saturn
        distances[7][7] = 0;            //Uranus to Uranus
        distances[7][8] = 1627450;      //Neptune to Uranus
        distances[8][8] = 0;            //Neptune to Neptune
    }
    private void populateMasses(){
        masses[0] = 1989100000;     //Sun 
        masses[1] = 330.11;         //Mercury
        masses[2] = 4876.5;         //Venus
        masses[3] = 5972.4;         //Earth
        masses[4] = 641.71;         //Mars
        masses[5] = 1898187;        //Jupiter
        masses[6] = 568317;         //Saturn
        masses[7] = 86813;          //Neptune
        masses[8] = 102413;         //Uranus        
    }
}