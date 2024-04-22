import java.util.ArrayList;
import java.util.List;


    public class Curs implements OperatiiCurs {
        String nume;
        String descriere;
        Profesor profu;
        Student[] studenti;
     private int[] note;

    List<Profesor> ProfesoriNote = new ArrayList<Profesor>();

    public Curs() {
        this.nume = "";
        this.descriere = "";
        this.profu = null;
        this.studenti = null;
    }
        public Curs(String nume, String descriere, Profesor profu, Student[] studenti)
        {
            this.nume = nume;
            this.descriere = descriere;
            this.profu = profu;
            this.studenti = studenti;
        }

        public void UpdateProfesor(Profesor profu)
        {
            this.profu = profu;
        }
        public void AddStudent(Student student)
        {


            int noualungime = studenti.length+1;
            Student[] aux = new Student[noualungime];
            int index =0;
            for(Student s : studenti)
            {
                aux[index++] = s;
            }

            aux[index] = student;

            this.studenti = new Student[noualungime];
            System.arraycopy(aux, 0, studenti, 0,
                    noualungime);
        }

	  @Override
	public void RemoveStudent(Student student) {
		for (int i = 0; i < studenti.length; i++) {
			if (studenti[i].equals(student)) {
				Student[] updatedStudents = new Student[studenti.length - 1];
				System.arraycopy(studenti, 0, updatedStudents, 0, i);
				System.arraycopy(studenti, i + 1, updatedStudents, i, studenti.length - i - 1);
				studenti = updatedStudents;
				return;
			}
		}
		System.out.println("Student " + student.getNumeIntreg() + " nu a fost gasit in curs");
	}

	@Override
	public void UpdateStudent(Student student) {
		for (int i = 0; i < studenti.length; i++) {
			if (studenti[i].equals(student)) {
				studenti[i] = student;
				return;
			}
		}
		System.out.println("Student " + student.getNumeIntreg() + " nu a fost gasit in curs");
	}



    @Override
    public void UpdateCurs(String nume, String descriere) {
        this.nume = nume;
        this.descriere = descriere;
    }


    @Override
        public String toString() {
            String str =
                    "Curs: " + "nume=" + nume + ", descriere=" + descriere + ",\nprofu=" + profu + ",\nstudenti:\n" ;
            for(Student s : studenti)
            {
                str+= s + "\n";
            }
            return str;
        }

        public String getNume() {
            return this.nume;
        }


    public void stergeProfesor(){
            this.profu=null;
    }

     public void UpdateStudent(Student studentVechi, Student studentNou)
     {
         int index = 0;

         for(Student s : studenti)
         {
             if(s.equals(studentNou))
             {
                 System.out.println("Studentul vechi nu poate fii modificat astfel deoarece studentul nou se afla deja in lista");
                 return;
             }
         }

         for(Student s : studenti)
         {
             if(s.equals(studentVechi))
             {
                 studenti[index] = studentNou;
                 //Nota initiala a studentului nou este 1
                 note[index] = 1;
                 return;
             }

             index++;
         }
     }


     public void notareStudent(Student student, int nota)
     {
         int index = 0;

         for(Student s : studenti)
         {
             if(s.equals(student))
             {
                 note[index] = nota;
             }

             index++;
         }
     }

     public void raportareNoteStudenti()
     {
         System.out.println("Notele stundentilor la cursul " + this.getNume() + ": ");
         for(int i = 0; i < studenti.length; i++)
         {
             System.out.println(studenti[i] + " : " +  Integer.toString(note[i]) + " (nota acordata de " + ProfesoriNote.get(i).getNumeIntreg() + ")");
         }
     }

    public void raportareMedieNote()
    {
        double sum = 0;

        for(int i = 0; i < note.length;i++)
        {
            sum += note[i];
        }

        double medie = sum / note.length;
        System.out.println("Media notelor este " + medie);
    }

    public void raportareStudentiInscrisi()
    {
        System.out.println("Studenti inscrisi la cursul " + this.getNume());

        for(Student s : studenti)
        {
            System.out.println(s);
        }
    }



    }


