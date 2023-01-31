package empresa;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(ConsoleColors.GREEN +"\n"+"---------- Project init ----------" + "\n"+ ConsoleColors.RESET);
        Notas Jonas = new Notas(6.0, 12.0);
        Jonas.info(true,true);
        Jonas.setNota2(8.5);
        Jonas.results(false);
        System.out.println(ConsoleColors.GREEN +"\n"+"---------- End ----------"+ConsoleColors.RESET);
    }
}
