


    public class Student extends Persoana {
        int grupa;

        public Student() {
            super();
            this.grupa = 0;
        }
        public Student(String nume, String prenume, int grupa)
        {
           super(nume, prenume);
           this.grupa = grupa;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "grupa=" + grupa +
                    ", nume='" + nume + '\'' +
                    ", prenume='" + prenume + '\'' +
                    '}';
        }

        public int getGrupa() {
            return grupa;
        }
        public void setGrupa(int grupa) {
            this.grupa = grupa;
        }
    }


