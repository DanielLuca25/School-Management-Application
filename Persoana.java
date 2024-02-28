 public abstract class Persoana {
        String nume;
        String prenume;

        public Persoana() {
            this.nume = "";
            this.prenume= "";
        }

        public Persoana(String nume,String prenume) {
            this.nume = nume;
            this.prenume = prenume;
        }
        @Override
        public String toString() {
            return "Persoana{" + "nume=" + nume + ", prenume=" + prenume + '}';
        }

         public String getNume(){
             return nume;
         }

         public void setNume(String nume) {
             this.nume = nume;
         }
         public String getPrenume() {
             return prenume;
         }
         public void setPrenume(String prenume) {
             this.prenume = prenume;
         }
         public String getNumeIntreg()
         {
             return nume + " " + prenume;
         }
    }



