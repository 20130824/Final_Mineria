
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import weka.core.*;
import weka.classifiers.trees.J48;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static BufferedReader readDataFile(String filename) {
        BufferedReader inputReader = null;

        try {
            inputReader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException ex) {
            System.err.println("Archivo no encontrado " + filename);
        }

        return inputReader;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader datafile = readDataFile("pitchers.arff");
        Scanner scanner = new Scanner(System.in);
        Instances data = new Instances(datafile);
        data.setClassIndex(16);
        datafile.close();
        J48 clasificador = new J48();
        clasificador.buildClassifier(data);
        Instance Testinst = new DenseInstance(20);

        Testinst.setMissing(16);
        Testinst.setDataset(data);
        ArrayList Atributos = new ArrayList();


        //@attribute pitchers_name
        System.out.println("Nombre del jugador");
        Testinst.setValue(0, scanner.nextInt());
        Atributos.add("number_of_times_at_bat_in_1986");
        //@attribute players_team_at_the_end_of_in_1986
        System.out.println("Equipo al final de la temporada anterior, 0: Atl., 1: Bal., 2: Bos., 3: Cal., 4: Chi., 5: Cin., 6: Cle., 7: Det., 8: Hou., 9: K.C., 10: L.A., 11: Mil., 12: Min., 13: Mon., 14: N.Y., 15: Oak., 16: Phi., 17: Pit., 18: S.D., 19: S.F., 20: Sea., 21: St.L., 22: Tex., 23: Tor.");
        Testinst.setValue(1, scanner.nextInt());
        Atributos.add("players_team_at_the_end_of_in_1986");
        //@attribute players_league_at_the_end_of_1986
        System.out.println("Liga temporada anterior, 0: A, 1: N");
        Testinst.setValue(2, scanner.nextInt());
        Atributos.add("players_league_at_the_end_of_1986");
        //@attribute number_of_wins_in_1986 INTEGER
        System.out.println("Cantidad de juegos ganados en la temporada anterior");
        Testinst.setValue(3, scanner.nextInt());
        Atributos.add("number_of_wins_in_1986");
        //@attribute number_of_losses_in_1986 INTEGER
        System.out.println("Cantidad de juegos perdidos en la temporada anterior");
        Testinst.setValue(4, scanner.nextInt());
        Atributos.add("number_of_losses_in_1986");
        //@attribute earned_run_average_in_1986 REAL
        System.out.println("Efectividad (ERA) en la temporada anterior");
        Testinst.setValue(5, scanner.nextInt());
        Atributos.add("earned_run_average_in_1986");
        //@attribute number_of_games_in_1986 INTEGER
        System.out.println("Total de juegos en la temporada anterior");
        Testinst.setValue(6, scanner.nextInt());
        Atributos.add("number_of_games_in_1986");
        //@attribute number_of_innings_pitched_in_1986 REAL
        System.out.println("Innings lanzados en la temporada anterior");
        Testinst.setValue(7, scanner.nextInt());
        Atributos.add("number_of_innings_pitched_in_1986");
        //@attribute number_of_saves_in_1986 INTEGER
        System.out.println("Juegos salvados en la temporada anterior");
        Testinst.setValue(8, scanner.nextInt());
        Atributos.add("number_of_saves_in_1986");
        //@attribute number_of_years_in_the_major_leagues INTEGER
        System.out.println("Anios en grandes ligas");
        Testinst.setValue(9, scanner.nextInt());
        Atributos.add("number_of_years_in_the_major_leagues");
        //@attribute number_of_wins_during_his_career INTEGER
        System.out.println("Juegos ganados de por vida");
        Testinst.setValue(10, scanner.nextInt());
        Atributos.add("number_of_wins_during_his_career");
        //@attribute number_of_losses_during_his_career INTEGER
        System.out.println("Juegos perdidos de por vida");
        Testinst.setValue(11, scanner.nextInt());
        Atributos.add("number_of_losses_during_his_career");
        //@attribute earned_run_average_during_his_career REAL
        System.out.println("Efectividad (ERA) de por vida");
        Testinst.setValue(12, scanner.nextInt());
        Atributos.add("earned_run_average_during_his_career");
        //@attribute number_of_games_during_his_career INTEGER
        System.out.println("Juegos jugados de por vida");
        Testinst.setValue(13, scanner.nextInt());
        Atributos.add("number_of_games_during_his_career");
        //@attribute number_of_innings_pitched_during_his_career REAL
        System.out.println("Innings lanzados de por vida");
        Testinst.setValue(14, scanner.nextInt());
        Atributos.add("number_of_innings_pitched_during_his_career");
        //@attribute number_of_saves_during_his_career INTEGER
        System.out.println("Juegos salvados de por vida");
        Testinst.setValue(15, scanner.nextInt());
        Atributos.add("number_of_saves_during_his_career");
        //@attribute 1987_annual_salary_on_opening_day_in_thousands_of_dollars
        Atributos.add("1987_annual_salary_on_opening_day_in_thousands_of_dollars");
        //@attribute players_league_at_the_beginning_of_1987 {A,N}
        System.out.println("Liga del jugador en temporada actual , 0: A, 1: N");
        Testinst.setValue(17, scanner.nextInt());
        Atributos.add("players_league_at_the_beginning_of_1987");
        //@attribute players_team_at_the_beginning_of_1987
        System.out.println("Equipo del jugador en temporada actual, 0: Atl., 1: Bal., 2: Bos., 3: Cal., 4: Chi., 5: Cin., 6: Cle., 7: Det., 8: Hou., 9: K.C., 10: L.A., 11: Mil., 12: Min., 13: Mon., 14: N.Y., 15: Oak., 16: Phi., 17: Pit., 18: S.D., 19: S.F., 20: Sea., 21: St.L., 22: Tex., 23: Tor.");
        Testinst.setValue(18, scanner.nextInt());
        Atributos.add("players_team_at_the_beginning_of_1987");
        //@attribute players_nationality
        System.out.println("Nacionalidad, 0: American, 1: Canadian, 2: Dominican, 3: Dutch, 4: English, 5: German, 6: Mexican, 7: Puerto_Rican");
        Testinst.setValue(19, scanner.nextInt());
        Atributos.add("players_nationality");



        System.out.println("El nombre es:"+  clasificador.classifyInstance(Testinst));



    }
}

