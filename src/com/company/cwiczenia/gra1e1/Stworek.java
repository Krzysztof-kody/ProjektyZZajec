package com.company.cwiczenia.gra1e1;

public class Stworek {
        int zdrowie;
        int sytosc;
        int pecherz;
        int zabawa;
        boolean zywy;

        String imie;
        public Stworek(String imie){
            this.imie = imie;
            zdrowie = 100;
            sytosc = 50;
            pecherz = 0;
            zabawa = 100;
            zywy = true;
        }
        public String pasek(int n){
            String p = "";
            p += "|";
            for(int i = 0; i < n/5; i++)
                p += "#";

            for(int i = 0; i < 20 - n/5; i++)
                p +=" ";

            p +="|";
            return p;
        }
        public void statystyki(){
            System.out.println("Zdrowie    " + pasek(zdrowie));
            System.out.println("Najedzenie " + pasek(sytosc));
            System.out.println("Pęcherz    " + pasek(pecherz));
            System.out.println("Zabawa     " + pasek(zabawa));
        }

        public int getZdrowie() {
            return zdrowie;
        }

        public void setZdrowie(int zdrowie) {
            if(zywy) {
                this.zdrowie += zdrowie;
                int roznica = this.zdrowie - 100;
                if (this.zdrowie > 100) {
                    this.zdrowie = 100;
                    setZabawa(roznica);
                }
                if (this.zdrowie <= 0) {
                    this.zdrowie = 0;
                    System.out.println("TRUP!!!");
                    zywy = false;
                }
            }
        }

        public int getSytosc() {
            return sytosc;
        }

        public void setSytosc(int sytosc) {
            if(zywy) {
                this.sytosc += sytosc;
                int roznica = this.sytosc - 100;
                if (this.sytosc > 100) {
                    System.out.println("PRZEKARMIENIE!!!");
                    this.sytosc = 100;
                    setZdrowie(-roznica);
                    setPecherz(20);
                    setZabawa(-10);
                }
            }
            else{
                System.out.println("NIE KARM TRUPA!");
            }

        }

        public int getPecherz() {
            return pecherz;
        }

        public void setPecherz(int pecherz) {
            if(zywy) {
                this.pecherz += pecherz;
                if (this.pecherz > 100) {
                    setZdrowie(-20);
                    this.pecherz = 0;
                    setSytosc(-10);
                    setZabawa(-30);
                }
            }
        }

        public int getZabawa() {
            return zabawa;
        }

        public void setZabawa(int zabawa) {
            if(zywy) {
            this.zabawa += zabawa;
            if(this.zabawa > 100){
                this.zabawa = 0;
            }
            if(this.zabawa <= 0){
                this.zabawa = 0;
                setZdrowie(-10);
            }
            }
        }
    }

