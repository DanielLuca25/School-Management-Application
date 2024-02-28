public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Andrei","Negoita",2231);
        Student student2 = new Student("Luca","Daniel",4221);
        Student student3 = new Student("Tanase","Mihai",4792);
        Student student4 = new Student("Marius", "Andrei", 4691);

        Profesor profPCLP = new Profesor("Danciu", "Gabriel");
        Profesor profAnaliza = new Profesor("Paltanea", "Eugen");


        Student[] studentiAnaliza = {student2,student3};
        Student[] studentiPCLP = {student1,student2,student4};

        Curs cursAnaliza = new Curs("Analiza Matematica", "Siruri, inegrale, derivate", profPCLP, studentiAnaliza);
        Curs cursPCLP = new Curs("PCLP", "Programare Java", profAnaliza, studentiPCLP);


        ManagerCursuri cursuri = new ManagerCursuri();
        cursuri.AddCurs(cursAnaliza);
        cursuri.AddCurs(cursPCLP);
        //cursuri.StergeCurs(cursAnaliza);
        //cursuri.raportareCursuri();


        //cursPCLP.AddProfesor(profAnaliza);
        //cursPCLP.StergeProfesor();
        //cursPCLP.raportareProfesori();

        System.out.println();

        //cursPCLP.modificaStudent(student2, student3);
        cursPCLP.raportareStudentiInscrisi();


        System.out.println();

        cursPCLP.notareStudent(student1, 10);
        cursPCLP.notareStudent(student2, 8);
        cursPCLP.notareStudent(student4, 6);
        cursPCLP.raportareNoteStudenti();

        System.out.println();

        cursPCLP.raportareMedieNote();}

///exceptii citire din fisier hcod
}