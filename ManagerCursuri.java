



    public class ManagerCursuri implements OperatiiManagerCursuri {
        Curs[] cursuri;

        public ManagerCursuri() {
            cursuri = new Curs[0];
        }

        public void AddCurs(Curs curs) {

            for (Curs c : cursuri) {
                if (c.equals(curs)) {
                    System.out.println("Cursul" + curs.getNume() + " este deja in lista");
                    return;
                }
            }
            int noualungime = cursuri.length + 1;
            Curs[] aux = new Curs[noualungime];
            int index = 0;
            for (Curs c : cursuri) {
                aux[index++] = c;
            }

            aux[index] = curs;

            this.cursuri = new Curs[noualungime];
            System.arraycopy(aux, 0, cursuri, 0, noualungime);
        }

        @Override
        public void UpdateCurs(Curs curs) {
            //
        }

        @Override
        public void DeleteCurs(Curs curs) {
            //
        }


        public void AfiseazaCursuriLaConsola()
        {
            for (Curs c : cursuri)
                System.out.println(c);
        }

    }




