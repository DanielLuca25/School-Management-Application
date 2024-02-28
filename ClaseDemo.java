public class ClaseDemo {


    public class Clase {
        public static void main(String[] args) {

            Student[] studenti = new Student[]{new Student("Andrei","Negoita",2231),new Student("Ion","Mateescu",4221)};

            Profesor prof = new Profesor("Anton","Panaitescu");

            Curs curs = new Curs("Rezistenta Materialelor", "calculul reacţiunilor,\n" +
                    "diagramele de eforturi, calculul caracteristicilor geometrice ale\n" +
                    "suprafeţelor plane şi calculul elementelor de rezistenţă la solicitări simple\n"
                    , prof, studenti);

            ManagerCursuri cursuri = new ManagerCursuri();
            cursuri.AddCurs(curs);
            cursuri.AfiseazaCursuriLaConsola();
        }
    }

}
