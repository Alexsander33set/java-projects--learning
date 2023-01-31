package empresa;

import javax.naming.spi.DirStateFactory.Result;

public class Notas {
    private double nota1;
    private double nota2;
    private boolean approved;

    Notas(Double nota1, Double nota2){
        setNota1(nota1);
        setNota2(nota2);
    }

    void info(boolean showN1, boolean showN2){
        System.out.println("------------------------------");
        System.out.print("Nota");
        if(showN1 & showN2){System.out.print("s: \n");}else{System.out.print(": \n");}
        if(showN1){System.out.println("Nota 1: "+nota1);}
        if(showN2){System.out.println("Nota 2: "+nota2);}
        System.out.println("------------------------------\n");
    }
    void results(boolean showNotes){
        double arithmetic_mean = (nota1+nota2)/2;
        
        if(showNotes){info(true, true);}
        if(arithmetic_mean >=6){approved = true;}
        System.out.println("Aluno "+(approved?"Aprovado!":"em Recuperação!")+"\nMédia: "+ arithmetic_mean);

    }
    public void setNota1(double nota1) {
        if(nota1 >= 0 & nota1 <=10){
            if(this.nota1==0.0){System.out.println("Nova Nota 1: "+nota1+"\n");}
            this.nota1 = nota1;
        }
        else{System.out.println("Nota 1 inválida\n");}
    }
    public void setNota2(double nota2) {
        if(nota2 >= 0 & nota2 <=10){
            if(this.nota2==0.0){System.out.println("Nova Nota 2: "+nota2+"\n");};
            this.nota2 = nota2;
        }
        else{System.out.println("Nota 2 inválida\n");}
    }
}
