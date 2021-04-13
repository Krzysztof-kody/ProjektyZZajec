package com.company.cwiczenia.gra1a1;

public class Stworek{
    int zdrowie;
    int energia;
    int szczescie;
    int sytosc;
    int toaleta;
    String imie;
    boolean gramy;
    public Stworek(String imie){
        this.imie = imie;
        zdrowie = 100;
        energia = 100;
        szczescie = 100;
        sytosc = 100;
        toaleta = 100;
        gramy = true;
    }
    public void przywitajSie(){
        System.out.println("Cześć, jestem " + imie + "!");
    }

    public String pasek(int n, int max){
        String p ="";
        p += "|";
        for(int i =0; i<n/5; i++)
            p +="#";
        for(int i =0; i<(max-n)/5; i++)
            p +=" ";

        p += "|";

        return p;
    }

    public int getZdrowie() {
        return zdrowie;
    }

    public void setZdrowie(int zdrowie) {
        if (this.zdrowie > 0){
            this.zdrowie += zdrowie;
            if(this.zdrowie <= 0){
                this.zdrowie = 0;
                setSytosc(-30);
                setSzczescie(-30);
                setEnergia(-30);
                setToaleta(-30);
            }else
            if(this.zdrowie < 20){
                setSytosc(-10);
                setSzczescie(-10);
                setEnergia(-10);
                setToaleta(-10);
            }}
        if(this.zdrowie > 100){
            this.zdrowie = 100;
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if(this.energia > 0){
            this.energia += energia;
            if(this.energia <= 0){
                this.energia = 0;
                System.out.println(imie + " jest wyczerpany(a)");
                setZdrowie(-20);
            }}
        if(this.energia > 100){
            this.energia = 100;
            setZdrowie(10);
        }
    }

    public int getSzczescie() {
        return szczescie;
    }

    public void setSzczescie(int szczescie) {
        if(this.szczescie > 0){
            this.szczescie += szczescie;
            if(this.szczescie <= 0){
                this.szczescie = 0;
                if(this.zdrowie > 0)
                    setZdrowie(-40);
                if(this.energia > 0)
                    setEnergia(-40);
            }}
        if(this.szczescie > 100){
            this.szczescie = 100;
            setEnergia(10);
            setZdrowie(10);
        }
    }

    public int getSytosc() {
        return sytosc;
    }

    public void setSytosc(int sytosc) {
        if(this.sytosc > 0){
            this.sytosc += sytosc;
            if(this.sytosc <= 0){
                this.sytosc = 0;
                System.out.println("Twój stworek głoduje!!!");
                setZdrowie(-20);
                setSzczescie(-20);
                setEnergia(-20);
            }}
        if(this.sytosc > 100 ){
            this.sytosc = 100;
            System.out.println("Uważaj, " + imie + " jest przekarmiony/na");
            setZdrowie(-10);
            setToaleta(-50);
        }
    }

    public int getToaleta() {
        return toaleta;
    }

    public void setToaleta(int toaleta) {
        if(this.toaleta > 0){
            this.toaleta += toaleta;
            if(this.toaleta <= 0){
                System.out.println("Twój stworek zrobił w spodnie");
                setZdrowie(-20);
                setSzczescie(-70);
                this.toaleta = 100;
            }}
    }

    public void statystyki(){
        System.out.println("Zdrowie:   " + pasek(zdrowie, 100));
        System.out.println("Energia:   " + pasek(energia, 100));
        System.out.println("Szczescie: " + pasek(szczescie, 100));
        System.out.println("Sytosc:    " + pasek(sytosc, 100));
        System.out.println("Toaleta:   " + pasek(toaleta, 100));

    }
    public void stan(){
        if(zdrowie == 0) {
            System.out.println("Twój stworek odszedł...");
            gramy = false;
        }
        else
        if(szczescie == 0) {
            System.out.println("Twój stworek uciekł");
            gramy = false;
        }
        else
        if(sytosc == 0) {
            System.out.println("Twój stworek jest zagłodzony");
        }
        else
        if(toaleta == 0) {

        }
    }


}
