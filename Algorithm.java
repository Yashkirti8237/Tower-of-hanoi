public class Algorithm{
    public void solveHanoi(int n, char rodFrom, char middleRod, char rodTo){
        if( n == 1){
            system.out.println("Plate 1 from "+rodFrom+" to "+rodTo);
            return;
        }
        solveHanoi(n-1, rodFrom, rodTo, middleRod);
        system.out.prinntln("Plate "+n+" from "+rodFrom+" to "+rodTo);
        solveHanoi(n-1, middleRod, rodFrom, rodTo);
    }
}
    