package ifsp.poo;

public class MainUIControler {
    private MainUI ui;

    public MainUIControler(MainUI ui) {
        this.ui = ui;
    }

    public void reverse() {
        String input = ui.getInput();
        StringBuilder reverter = new StringBuilder(input); // cria um stringBuilder com o texto disponivel no textfield
        ui.setResult("Result: " + reverter.reverse().toString()); // atualiza o lbresult com a string invertida
    }
}
